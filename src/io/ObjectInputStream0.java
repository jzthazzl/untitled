package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStream0 {
    public static void main(String[]args)throws  Exception{
        dser();
    }
    public static void dser() throws Exception{
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(
                new File("d:"+ File.separator+"temp"+ File.separator+"source"+
                        File.separator+ "book.ser")));
        Object obj=ois.readObject();
        Book book=(Book)obj;
        System.out.println(book);
        ois.close();
    }
}
