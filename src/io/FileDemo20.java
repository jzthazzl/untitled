package io;
import java.io.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo20 {
    public static  void main(String []args){
        try {
            File file = new File("e:"+File.separator+"temp"+
                    File.separator+"temp1" +File.separator+"test.xlsx");
            if(!file.getParentFile().exists()){ //现在的父路径不存在
                file.getParentFile().mkdirs();//创建父路径
            }else{
                //file.createNewFile();
                if(file.exists()){
                    System.out.println("是否是文件:"+(file.isFile()));
         //文件大小是按照字节单位返回的数字，所以要换成M的单位，考虑到小数点的问题，所以用BigDecimal处理
                    System.out.println("文件大小："+
                            (new BigDecimal((double)file.length()/1024/1024).divide(
                                    new BigDecimal(1),2,BigDecimal.ROUND_HALF_UP))
                            +"M");
                    System.out.println("上次修改的时间:"+
                            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(
                                    new Date(file.lastModified())));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}