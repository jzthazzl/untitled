package io;
import java.io.*;
public class FileInputStream1 {
    public static  void main(String []args){
        try {
            File file = new File("d:"+File.separator+"test.txt");
            if(file.exists()){
                InputStream input=new FileInputStream(file);
                byte []data=new  byte[1024];
                int  foot=0;
                int temp=0;
                while((temp=input.read())!=-1){
                    data[foot++]=(byte)temp;
                }
                input.close();
                System.out.println("["+new String(data,0,foot)+"]");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
