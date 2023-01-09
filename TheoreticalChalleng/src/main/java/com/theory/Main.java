package com.theory;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;


import org.springframework.util.StringUtils;

public class Main {

	public static void main(String[] args) {
		
		readFile("file.csv");  //import the file
		

	}

	private static void readFile(String file) {
		

		String save="";
		String comma=",";
		
		Path source= Paths.get(file); // get data
		
		try {
			BufferedReader r=new BufferedReader(new FileReader(file));//read by Bufferedreader
			
			save=r.readLine();  //line by line read
			
			
			while(!StringUtils.isEmpty(save)) {
				System.out.println(save);
				String[] str=save.split(comma);   //store 
				

				
			}
		} catch (FileNotFoundException e) {
			

			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}


}
