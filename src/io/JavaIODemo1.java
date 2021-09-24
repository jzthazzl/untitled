package io;
import  java.io.File;
import java.io.FilenameFilter;

public class JavaIODemo1 {
    public static  void main(String[]args)throws Exception{
        File  file=new File("d:"+File.separator+"javaiodemo"+File.separator);
        FilenameFilter filter=new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File  currFile=new File(dir,name);
                if(currFile.isFile() && name.endsWith(".txt")){
                    return true;
                }else {
                    return false;
                }
            }
        };
        if(file.exists()){
            String[]lists=file.list(filter);
            for(String name:lists){
                System.out.println(name);
            }
        }
        /*if(file.exists()){
            file.delete();
        }else{
            System.out.println(file.createNewFile());
        }

        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        //System.out.println(file.createNewFile());
        file=new File("d:"+File.separator);
        if(file.isDirectory()){
            String[]names=file.list();
            for(String  name:names){
                System.out.println(name);
            }
        }*/
    }
}
