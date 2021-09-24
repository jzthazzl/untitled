package io;
import java.io.*;
public class FileWriter1  {
    public static  void main(String []args){
        char data[]=new char[1024];
        int len;
        String str=null;
        try {
            File file = new File("e:"+File.separator+"temp"+
                    File.separator+"temp1" +File.separator+"test.txt");
            if(file.exists()){
                Reader input=new FileReader(file);
                len=input.read(data);
                str=new String(data,0,len);
                System.out.println(str);
                input.close();
            }
            File file2 = new File("e:"+File.separator+"temp"+
                    File.separator+"temp2" +File.separator+"ok.txt");
            if(!file2.getParentFile().exists()){
                file2.getParentFile().mkdirs();
            }
            Writer out=new FileWriter(file2);
            out.write(str);
            out.flush();
            out.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
