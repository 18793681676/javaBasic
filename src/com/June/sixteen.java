package com.June;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class sixteen {

    public static void main(String[] args) {

        FileInputStream fis = null;

        FileOutputStream fos = null;

        File file = new File("..........");
        try {
            file.createNewFile();
            fis = new FileInputStream(file);

            fos = new FileOutputStream(".......");

            byte[] words = new byte[10240];
            while ((fis.read(words)) != -1) {
                fos.write(words, 0, words.length);
            }
            System.out.println("文件数据复制成功！！！！！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if (fis != null) {

                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {

                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

        }
    }

}
