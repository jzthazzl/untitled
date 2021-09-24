package io;

import java.io.*;

public class LineNumberReader0 {
    public static void main(String[]args){
        File srcfile=new File("d:"+ File.separator+"temp"+ File.separator+"source"+File.separator+ "FileCopy0.java");
        File tarfile=new File("d:"+ File.separator+"temp"+ File.separator+"target"+File.separator+ "FileCopyBackup.java");
        try{
            FileReader reader=new FileReader(srcfile);
            BufferedReader br=new BufferedReader(reader);
            LineNumberReader lnr=new LineNumberReader(br);
            if(!tarfile.exists())
                tarfile.createNewFile();
            FileWriter writer=new FileWriter(tarfile);
            BufferedWriter  bw=new BufferedWriter(writer);
            String str;
            long begintime=System.currentTimeMillis();//获取拷贝文件前的系统时间
            while((str=lnr.readLine())!=null){
                bw.write(lnr.getLineNumber()+"     "+str);
                bw.newLine();
            }
            long  endtime=System.currentTimeMillis();
            System.out.println("文件复制消耗:"+(endtime-begintime)+"毫秒");
            lnr.close();
            br.close();
            bw.close();
            reader.close();
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
