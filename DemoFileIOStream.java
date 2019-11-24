package com.cdac.java.fileio.binary.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoFileIOStream {
	static void write(String content)
	{
		File file = new File("D:\\fiostream.txt");
		
		FileOutputStream fos=null;
		//String content="This is FileInputOutPutStream";
		try {
			fos= new FileOutputStream(file);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			//it override the file content
			fos.write(content.getBytes());
			
			System.out.println("File Written Successfully!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
		
	}
	static String read()
	{
		File file = new File("D:/fiostream.txt");
		FileInputStream fis =null;
		byte[] content=null;
		
		try {
			
			fis= new FileInputStream(file);
			
			content= new byte[fis.available()];
			System.out.println(content);
			
		}
		catch(FileNotFoundException e) {}
		catch(IOException e) {}
		
		try {
			fis.read(content);
		}
		catch (IOException e) {}
		finally {
			
			try {
				fis.close();
			} catch (IOException e) {}
			
		}
		String output = new String(content);
		return output;
	}
	public static void main(String[] args) {
		write("Change the way of thinking2!");
		String readContent = read();
		System.out.println(readContent);
	}

}
