package io;
import java.io.*;

public class FileDemo2 {
    public static  void main(String []args){
        try {
            File file = new File("e:"+File.separator+"temp"+
                    File.separator+"temp1" +File.separator+"test.txt");
            if(!file.getParentFile().exists()){ //现在的父路径不存在
                file.getParentFile().mkdirs();//创建父路径
            }else{
                file.createNewFile();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}