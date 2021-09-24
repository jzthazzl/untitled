package io;
import java.io.*;

public class FileDemo3 {
    public static void main(String[] args) {
        try {
            File file = new File("c:"+File.separator+"终不似，少年游");
            if (file.isDirectory()){
                File [] result=file.listFiles();
                for (int i = 0; i < result.length; i++) {
                    System.out.println(result[i]);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}