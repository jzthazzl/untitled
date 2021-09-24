package io;
import java.io.*;

public class FileDemo1 {
    public static void main(String[] args) {
        try {
            File file = new File("c:"+File.separator+"temp"+"\\text.txt");
            if (file.exists()){
                System.out.println("文件存在!即将删除");
                file.delete();
            }else {
                file.createNewFile();
                System.out.println("文件创建成功!");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
