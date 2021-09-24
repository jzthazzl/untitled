package io;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
public class FileOutputStream1 {
    public static  void main(String []args){
        try {
            File file = new File("e:"+File.separator+"temp"+
                    File.separator+"temp1" +File.separator+"test.txt");
            if(!file.getParentFile().exists()){ //现在的父路径不存在
                file.getParentFile().mkdirs();//创建父路径
            }
            OutputStream  out=new FileOutputStream(file);
            String  str="更多资源请看：www.xmut.edu.cn";
            byte []data=str.getBytes();
            out.write(data);
            out.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
