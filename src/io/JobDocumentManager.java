package io;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class JobDocumentManager {
    public static void main(String[]args)throws  Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("--1:指定关键字检索文件   2：指定后缀名检索文件   3：复制文件/目录   " +
                "4：退出--");
        while(true){
            System.out.print("请输入指令：");
            int command=sc.nextInt();
            switch (command){
                case 1:
                    searchByKeyWord();
                    break;
                case 2:
                    searchBySuffix();
                    break;
                case 3:
                    copyDirectory();
                    break;
                case 4:
                    exit();
                    break;
                default:
                    System.out.println("您输入的指令错误！");
                    break;
            }
        }
    }
    private static  void searchByKeyWord(){
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入要检索的目录位置：");
        String  path=sc.next();
        File file=new File(path);
        if(!file.exists()||!file.isDirectory()){
            System.out.println(path+"(不是有效目录)");
            return;
        }
        System.out.print("请输入搜索关键字：");
        String key=sc.next();
        ArrayList<String> list=FileUtils.listFiles(file,key);
        for(Object obj:list){
            System.out.println(obj);
        }
    }

    private static  void searchBySuffix(){
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入要检索的目录位置：");
        String  path=sc.next();
        File file=new File(path);
        if(!file.exists()||!file.isDirectory()){
            System.out.println(path+"(不是有效目录)");
            return;
        }
        System.out.print("请输入搜索后缀：");
        String suffix=sc.next();
        String[]suffixArray=suffix.split(",");
        ArrayList<String> list=FileUtils.listFile(file,suffixArray);
        for(Object obj:list){
            System.out.println(obj);
        }
    }

    private static  void copyDirectory()throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入源目录：");
        String srcDirectory=sc.next();
        File  srcFile=new File(srcDirectory);
        if(!srcFile.exists()||!srcFile.isDirectory()){
            System.out.println("无效目录");
            return;
        }
        System.out.print("请输入目标位置：");
        String destDirectory=sc.next();
        File  destFile=new File(destDirectory);
        if(!destFile.exists()||!destFile.isDirectory()){
            System.out.println("无效目录");
            return;
        }
        FileUtils.copySrcPathToDestPath(srcFile,destFile);
    }

    private static  void exit(){
        System.out.println("您已退出，谢谢使用！");
        System.exit(0);
    }
}
