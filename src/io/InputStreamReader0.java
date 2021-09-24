package io;
import java.io.*;
public class InputStreamReader0 {
    public static  void main(String[]args){
        File srcfile=new File("d:"+ File.separator+"temp"+ File.separator+"source"+File.separator+ "FileCopy0.java");
        File tarfile=new File("d:"+ File.separator+"temp"+ File.separator+"target"+File.separator+ "FileCopyBackup.java");
        try{
            FileInputStream  in=new FileInputStream(srcfile);
            InputStreamReader isr=new InputStreamReader(in);
            BufferedReader br=new BufferedReader(isr);
            if(!tarfile.exists())
                tarfile.createNewFile();
            FileOutputStream out=new FileOutputStream(tarfile);
            OutputStreamWriter osw=new OutputStreamWriter(out);
            BufferedWriter bw=new BufferedWriter(osw);
            String line;
            while((line=br.readLine())!=null){
                bw.write(line);
            }
            br.close();
            bw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}