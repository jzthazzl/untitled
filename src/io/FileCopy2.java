package io;
import java.io.*;
public class FileCopy2 {
    public static void main(String[]args){
        File srcfile=new File("d:"+ File.separator+"temp"+
                File.separator+"source"+File.separator+"mov.mp4");
        File tarfile=new File("d:"+ File.separator+"temp"+
                File.separator+"target"+File.separator+"mov.mp4");
        try{
            InputStream in=new FileInputStream(srcfile);
            BufferedInputStream bis=new BufferedInputStream(in);
            if(!tarfile.exists())
                tarfile.createNewFile();
            OutputStream out=new FileOutputStream(tarfile);
            BufferedOutputStream bos=new BufferedOutputStream(out);
            int len;
            long begintime=System.currentTimeMillis();//获取拷贝文件前的系统时间
            while((len=bis.read())!=-1){
                bos.write(len);
            }
            long  endtime=System.currentTimeMillis();
            System.out.println("文件复制消耗:"+(endtime-begintime)+"毫秒");
            bis.close();
            bos.close();
            in.close();
            out.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
