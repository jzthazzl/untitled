package io;
import java.io.*;
public class FileDemo30 {
    public static  void main(String []args){
        //显示C:的所有目录
            File file = new File("c:"+File.separator);
            print(file);
    }
    public static void print(File file){
        try {
            if (file.isDirectory()) {
                File result[] = file.listFiles();
                if (result != null) {
                    for (int i = 0; i < result.length; i++) {
                        print(result[i]); //递归调用
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(file);
    }
}