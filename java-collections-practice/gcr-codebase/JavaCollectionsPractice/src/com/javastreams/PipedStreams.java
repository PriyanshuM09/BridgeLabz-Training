package com.javastreams;
	import java.io.*;
	public class PipedStreams {
  public static void main(String[] args) {
	try { PipedOutputStream pos = new PipedOutputStream();
	            PipedInputStream pis = new PipedInputStream(pos);
	            Thread writer = new Thread(new Writer(pos));
	           Thread reader = new Thread(new Reader(pis));
            
	           writer.start();
	            reader.start();

	        } 
	catch(IOException e) {
	            System.out.println("Pipe connection error");
	        }}
	}

	class Writer implements Runnable {
	    private PipedOutputStream pos;
	    Writer(PipedOutputStream pos) {
	        this.pos = pos;
	    }
	    public void run() {
	        try {
	            String msg = "Hello from Writer Thread";
	            pos.write(msg.getBytes());
	            pos.close();
	        }
	        catch (IOException e) {
	            System.out.println("Writer error");
	        }
	    }
	}
	class Reader implements Runnable {
	    private PipedInputStream pis;
	    Reader(PipedInputStream pis) {
	        this.pis = pis;
	    }

	    public void run() {
	        try {
	            int data;
	            while ((data = pis.read()) != -1) {
	                System.out.print((char) data);
	            }
	            pis.close();
	        } catch (IOException e) {
	            System.out.println("Reader error");
	        }
	    }
	}


