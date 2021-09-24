package io;

import java.io.*;

public class FilePrintStream1 {
    public static  void main(String []args){
        try{
            String  name="王二小";
            int age=120;
            double  score=59.8;
            File file=new File("d:"+ File.separator+"temp"+ File.separator+"source"+
                    File.separator+"test.txt");
            FileOutputStream output=new FileOutputStream(file);
            PrintStream  pu=new PrintStream(output);
            pu.printf("姓名：%s,年龄:%d,成绩：%5.2f",name,age,score);
            pu.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
