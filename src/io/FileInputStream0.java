package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.*;

public class FileInputStream0 {
    public static  void  main(String[]args)throws Exception{
        FileInputStream in=new FileInputStream(new File("c:"+ File.separator+"test.txt"));
        int b=0;
        while(true){
            b=in.read();
            if(b==-1){
                break;
            }
            System.out.println(b);
        }
        in.close();
        FileOutputStream out=new FileOutputStream(new File("c:"+ File.separator+"test.txt"),true);
        String  str="橘子皮";
        byte[]data=str.getBytes();
        for(int i=0;i<data.length;i++){
            out.write(data[i]);
        }
        out.close();
    }
}
