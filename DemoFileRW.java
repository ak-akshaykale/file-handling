package com.cdac.java.fileio.character;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoFileRW
{
	void write()
	{
		File file = new File("D:/frw.txt");
		FileWriter fw=null;
		BufferedWriter bw=null;
		try {
			fw= new FileWriter(file,true);
			bw=new BufferedWriter(fw);

		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			//fw.write("Hello");
			//fw.append("hello");
			bw.append("Hello Java").append("\n");
			System.out.println("File is saved");

		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		File file = new File("D:/frw.txt");
		FileReader fr=null;
		
		try {
			 fr= new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		char[] chars=new char[100]; 
		try {
			fr.read(chars);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String output = new String(chars);
		System.out.println(output);
	}

}
