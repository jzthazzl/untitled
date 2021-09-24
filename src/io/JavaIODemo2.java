package io;
import  java.io.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaIODemo2 {
    public static  void main(String[]args)throws Exception{
        File file=new File("d:"+File.separator+"javaiodemo"+File.separator+"test.txt");
        if(file.exists()){
            System.out.println("是否是文件："+file.isFile());
            System.out.println("文件大小："+(new BigDecimal((double)file.length()/1024/1024).
                    divide(new BigDecimal(1),2,BigDecimal.ROUND_HALF_UP))+"M");
            System.out.println("上次修改时间："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").
                    format( new Date(file.lastModified())));
        }
      /* File file=new File("d:"+File.separator);
       print(file);*/
    }
    public static void print(File file){
        if(file.isDirectory()) {
            File result[] = file.listFiles();
            if (result != null) {
                for (int i = 0; i < result.length; i++) {
                    print(result[i]);
                }
            }
        }
        System.out.println(file);
    }
}
