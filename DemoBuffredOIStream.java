package com.cdac.java.fileio.binary.stream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoBuffredOIStream {
	
	void write()
	{
		File file = new File("D:/bufffile.txt");
		FileOutputStream fos=null;
		try {
			 fos=new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String data="This is the data of buffered OI";
		try {
			bos.write(data.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			bos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
	}

}
