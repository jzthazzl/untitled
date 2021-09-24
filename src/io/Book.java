package io;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class Book implements Serializable {//实现序列化接口
    private transient String  title;
    private double price;
    public Book(String title,double price){
        this.title=title;
        this.price=price;
    }
    @Override
    public String toString() {
        return "Book{" +
                "书名='" + title + '\'' +
                ", 价格=" + price +
                '}';
    }
}
