package com.cdac.java.fileio.binary.stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoDataIOStream {
	public static void main(String[] args) {
		File file = new File("D:/dataio.txt");
		FileOutputStream fos=null;
		FileInputStream fis=null;
		try {
			fos = new FileOutputStream(file);
			fis = new FileInputStream(file);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DataOutputStream dos = new DataOutputStream(fos);
		DataInputStream dis = new DataInputStream(fis);
		try {
			
			dos.writeUTF("String is inmutable");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			dos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			byte[] data = new byte[dis.available()];
			dis.read(data);
			String op = new String(data);
			System.out.println(op);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
