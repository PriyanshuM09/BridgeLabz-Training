package com.javastreams;
import java.io.*;
public class BufferedStreams {
    static final int SIZE = 4096;
    public static void main(String[] args) {

      String source="D:/FileHandling/largefile.dat";
      String unbufferedDest="D:/OutputFiles/unbuffered.dat";
        String bufferedDest="D:/OutputFiles/buffered.dat";
        unbufferedCopy(source, unbufferedDest);
        bufferedCopy(source, bufferedDest);
    }

   static void unbufferedCopy(String src, String dest){
    long start = System.nanoTime();
      try(FileInputStream in = new FileInputStream(src);
             FileOutputStream out = new FileOutputStream(dest)) {
         byte[] data=new byte[SIZE];
            int count;
            while((count=in.read(data))!=-1) {
            out.write(data,0, count);
            }
           } 
      catch (IOException e) {
            System.out.println("Error");
            return;
        }
      long end=System.nanoTime();
       System.out.println("Unbuffered Time: " + (end - start));
    }

    static void bufferedCopy(String src, String dest) {
        long start = System.nanoTime();
        try(BufferedInputStream in = new BufferedInputStream(new FileInputStream(src));
          BufferedOutputStream out =new BufferedOutputStream(new FileOutputStream(dest))) {
            byte[] data = new byte[SIZE];
            int count;
        while((count = in.read(data)) != -1) {
                out.write(data, 0, count);
            }
         } 
        catch(IOException e) {
            System.out.println("Error");
            return;
        }
     long end =System.nanoTime();
     System.out.println("Buffered Time: "+(end-start));
    }
}
