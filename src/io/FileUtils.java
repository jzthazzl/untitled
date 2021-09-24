package io;
import java.io.*;
import java.util.ArrayList;

public class FileUtils {
    public static ArrayList<String>listFiles(File file,final String key){
        FilenameFilter filter=new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File currFile=new File(dir,name);
                if(currFile.isFile() &&  name.contains(key)){
                    return true;
                }
                return false;
            }
        };
        ArrayList<String> arrayList=fileDir(file,filter);
        return  arrayList;
    }

    public  static  ArrayList<String>listFile(File file,final String[]suffixArray){
        FilenameFilter filter=new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File currFile=new File(dir,name);
                if(currFile.isFile()){
                    for(String  suffix:suffixArray){
                        if(name.endsWith("."+suffix)){
                            return true;
                        }
                    }
                }
                return false;
            }
        };
        ArrayList<String> arrayList=fileDir(file,filter);
        return  arrayList;
    }

    public  static  ArrayList<String> fileDir(File dir,FilenameFilter  filter){
        ArrayList<String> arrayList=new ArrayList<String>();
        File[]lists=dir.listFiles(filter);
        for(File list:lists){
            arrayList.add(list.getAbsolutePath());
        }
        File[]files=dir.listFiles();
        for(File file:files){
            if(file.isDirectory()){
                ArrayList<String> every=fileDir(file,filter);
                arrayList.addAll(every);
            }
        }
        return arrayList;
    }

    public  static  void  copySrcPathToDestPath(File srcDir,File destDir)throws Exception{
        File[]files=srcDir.listFiles();
        for(int i=0;i<files.length;i++){
            File copiedFile=new File(destDir,files[i].getName());
            if(files[i].isDirectory()){
                if(!copiedFile.mkdirs()){
                    System.out.println("无法创建："+copiedFile);
                    return;
                }
                copySrcPathToDestPath(files[i],copiedFile);
            }else {
                FileInputStream input=new FileInputStream(files[i]);
                FileOutputStream output=new FileOutputStream(copiedFile);
                byte[]buffer=new byte[1024];
                int n=0;
                while((n=input.read(buffer))!=-1){
                    output.write(buffer,0,n);
                }
                input.close();
                output.close();
            }
        }
    }

}
