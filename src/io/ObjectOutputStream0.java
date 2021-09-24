package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStream0 {
    public static void main(String[]args)throws  Exception{
        ser();
    }
    public static void ser() throws Exception{
        ObjectOutputStream  oos=new ObjectOutputStream(new FileOutputStream(
                new File("d:"+ File.separator+"temp"+ File.separator+"source"+
                        File.separator+ "book.ser")));
        oos.writeObject(new Book("Python数据分析案例教程",43.0));
        oos.close();
    }
}
