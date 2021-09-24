package io;
import java.io.*;
public class StreamToReader {
    public static  void main(String []args){
        System.getProperties().list(System.out);//列出全部系统属性
        try {
            File file = new File("e:"+File.separator+"temp"+
                    File.separator+"temp1" +File.separator+"test.txt");
            if(!file.getParentFile().exists()){
                file.getParentFile().mkdirs();
            }
            OutputStream output=new FileOutputStream(file);
            Writer  out=new OutputStreamWriter(output);// 将字节流转换成字符流
            out.write("hello,world!");
            //output.write("welcome to xiamen中国厦门".getBytes("ISO8859-1"));
            output.write("welcome to xiamen中国厦门".getBytes("UTF-8"));
            out.flush();
            out.close();
            output.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
