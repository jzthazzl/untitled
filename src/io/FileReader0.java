package io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader0 {
    public static void main(String[]args){
        File srcfile=new File("d:"+ File.separator+"temp"+ File.separator+"source"+File.separator+ "FileCopy0.java");
        File tarfile=new File("d:"+ File.separator+"temp"+ File.separator+"target"+File.separator+ "FileCopyBackup.java");
        try{
            FileReader reader=new FileReader(srcfile);
            int ch;
            while((ch=reader.read())!=-1){
                System.out.println((char)ch);
            }
            if(!tarfile.exists())
                tarfile.createNewFile();
            FileWriter writer=new FileWriter(tarfile);
            String  str="你好，厦门理工欢迎您！";
            writer.write(str);
            writer.write("\r\n");
            reader.close();
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
