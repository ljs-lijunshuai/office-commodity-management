package com.mr.util;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;

public class CommonIOUtils {

    //上传方法
    public static String upload(MultipartFile imgFile, HttpServletRequest req) {

        // 重命名文件
        String oldName = imgFile.getOriginalFilename();
        // 新名称
        String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."));

        // 创建新文件夹
        // 获取项目路径
        String path = "E://imgs//";
        // 创建文件夹
        File folder = new File(path);

        if (!folder.exists()) {
            folder.mkdir();
        }

        // 创建空文件
        File newFile = new File(path + "/" + newName);
        try {
            // 将文件写入到新文件中
            imgFile.transferTo(newFile);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "E://imgs//" + newName;
    }

    //下载方法
    public static void downLoad(String path, HttpServletResponse resp) {
        //将文件读取到IO中
        FileInputStream fis = null;
        ServletOutputStream os = null;

        try {

            fis = new FileInputStream(new File(path));
            resp.reset();//重置一下
            //设置返回文件的编码格式
            resp.setCharacterEncoding("iso-8859-1");
            //设置打开方式
            String fileName = UUID.randomUUID().toString() + path.substring(path.lastIndexOf("."));
            resp.setHeader("Content-Disposition", "attachment;filename=\"" + fileName + "\""); //attachment;
            //通过response方法中的对象将数据写入到客户端
            os = resp.getOutputStream();
            //构建字节缓冲区

            byte[] buffer = new byte[1024];
            int len = 0;
            while ((len = fis.read(buffer)) > 0) {
                os.write(buffer, 0, len);
                os.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (os != null) os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //读取图片
    public static void readPic(String path, HttpServletResponse resp) {
        //将文件读取到IO中
        FileInputStream fis = null;
        ServletOutputStream os = null;
        try {
            fis = new FileInputStream(new File(path));
            int i = fis.available();//得到文件大小
            byte data[] = new byte[i];
            fis.read(data);
            fis.close();
            resp.setContentType("image/*");
            os = resp.getOutputStream();

            os.write(data);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (os != null) os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
