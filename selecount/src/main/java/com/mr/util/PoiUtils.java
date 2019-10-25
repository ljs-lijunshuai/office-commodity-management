package com.mr.util;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by yangwen on 2019/9/3.
 */
public class PoiUtils {

    private XSSFWorkbook wk=null;
    private XSSFSheet sheet = null;
    public XSSFCellStyle cellStyle=null;

    /*获取sheet*/
    public XSSFSheet getSheetInstance(String sheetName){
        wk=new XSSFWorkbook();
        //设置样式
        cellStyle = wk.createCellStyle();
        /*边框*/
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        cellStyle.setBorderBottom(BorderStyle.THIN);//下边框
        cellStyle.setBorderLeft(BorderStyle.THIN);//左边框
        cellStyle.setBorderRight(BorderStyle.THIN);//右边框
        cellStyle.setBorderTop(BorderStyle.THIN); //上边框
        // 背景
        cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        cellStyle.setFillForegroundColor(IndexedColors.YELLOW.index);
        //创建sheet
        sheet = wk.createSheet(sheetName);
        return sheet;
    }


    /*导出*/
    public void exportReporter(String fileName, HttpServletResponse resp){

        ServletOutputStream outputStream=null;

        try {
            //设置response响应信息
            resp.setContentType("application/x-execl");
            resp.setHeader("Content-Disposition", "attachment;filename=" + new String((fileName+".xlsx").getBytes(),
                    "ISO-8859-1"));
            //获取outputstream对象
            outputStream = resp.getOutputStream();
            //输出对象
            wk.write(outputStream);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (outputStream!=null){
                    outputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    /*
    * 通过数据获取表格并写到前台页面
    * @author Administrator
    * @date 2019/9/3
    * @param null
    * @return
    **/
    public static  void getTable(HttpServletResponse response, List list, String xlsxName) {
        if (list == null || list.size() == 0) {
            return;
        }
        /*获取元素的Class对象*/
        Class clz = list.get(0).getClass();
        /*获取所有的属性*/
        Field[] fields = clz.getDeclaredFields();
        /*创建表空间*/
        HSSFWorkbook test = new HSSFWorkbook();
        /*获取sheel*/
        HSSFSheet sheet = test.createSheet("DrinkTest");
        HSSFRow row = sheet.createRow(0);
        int count = 0;
        if (fields != null && fields.length > 0) {
            count = fields.length;
        }
        /*获取所有的属性名,并放入到表头中*/
        for (int i = 0; i < count; i++) {
            row.createCell(i).setCellValue(fields[i].getName());
        }
        /*写入所有的内容*/
        for (int i=0;i<list.size();i++){
            HSSFRow commonRow = sheet.createRow(i+1);
            for (int j=0;j<fields.length;j++){
                Method[] m = clz.getMethods();
                Object invoke =null;
               /* PropertyDescriptor pd = new PropertyDescriptor(fields[j].getName(),
                        clz);
                Method getMethod = pd.getReadMethod();
                invoke = getMethod.invoke(list.get(i));*/
                for(int k = 0;k < m.length;k++){
                    if(("get"+fields[j].getName()).toLowerCase().equals(m[k].getName().toLowerCase())) {
                        try {
                            invoke =  m[k].invoke(list.get(i));
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e) {
                            e.printStackTrace();
                        }
                        break;
                    }
                }
                //如果是String进行强转
                if (fields[j].getGenericType().toString().equals("class java.lang.String")&&null!=invoke){
                    String str  = (String) invoke;
                    commonRow.createCell(j).setCellValue(str);
                };
                //如果是Integer进行强转
                if (fields[j].getGenericType().toString().equals("class java.lang.Integer")&&null!=invoke){
                    Integer inta  = (Integer) invoke;
                    commonRow.createCell(j).setCellValue(inta);
                };
                if (fields[j].getGenericType().toString().equals("class java.lang.Double")&&null!=invoke){
                    Double inta  = (Double) invoke;
                    commonRow.createCell(j).setCellValue(inta);
                };
                if (fields[j].getGenericType().toString().equals("class java.util.Date")&&null!=invoke){
                    Date inta  = (Date) invoke;
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    String time= sdf.format(inta);
                    commonRow.createCell(j).setCellValue(time);
                }

            }

        }
        ServletOutputStream outputStream = null;
        try {
            response.setContentType("application/x-execl");
            response.setHeader("Content-Disposition", "attachment;filename=" + new String((xlsxName+".xlsx").getBytes(),
                    "ISO-8859-1"));

            outputStream = response.getOutputStream();
            test.write(outputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (null!=outputStream){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }



}
