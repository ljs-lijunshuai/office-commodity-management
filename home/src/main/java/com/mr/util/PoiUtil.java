package com.mr.util;

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

/**
 * Created by yangx on 2019/9/3.
 */
public class PoiUtil {

    private XSSFWorkbook wk = null;
    private XSSFSheet sheet = null;
    public XSSFCellStyle cellStyle = null;


    public XSSFSheet getSheetInstance(String sheetName) {
        wk = new XSSFWorkbook();
        // 设置头部样式
        cellStyle = wk.createCellStyle();
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        cellStyle.setBorderBottom(BorderStyle.THIN);//下边框
        cellStyle.setBorderLeft(BorderStyle.THIN);//左边框
        cellStyle.setBorderRight(BorderStyle.THIN);//右边框
        cellStyle.setBorderTop(BorderStyle.THIN); //上边框
        // 背景
        cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        cellStyle.setFillForegroundColor(IndexedColors.YELLOW.index);
        sheet = wk.createSheet(sheetName);
        sheet.setColumnWidth(0, 20 * 256);
        return sheet;
    }


    public void exportReporter(String fileName, HttpServletResponse resp) {
        ServletOutputStream outputStream = null;
        // 5.通过writer()方法将excel输出
        // 5.1 设置response信息
        try {
            resp.setContentType("application/x-execl");
            resp.setHeader("Content-Disposition", "attachment;filename=" + new String((fileName + ".xlsx").getBytes(),
                    "ISO-8859-1"));
            // 5.2 获取resp outputstream对象
            outputStream = resp.getOutputStream();
            // 5.3 输出对象
            wk.write(outputStream);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != outputStream) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
