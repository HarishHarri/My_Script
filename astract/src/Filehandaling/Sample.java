package Filehandaling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Sample {
	public static void main(String[] args) throws  IOException {
		File f1=new File ("F:\\hello.txt");
//		if (f1.mkdirs()) {
//			System.out.println("created");
//		} else {
//			System.out.println("no");
//		}

//			if (f1.createNewFile()) {
//				System.out.println("file created");
//			} else {
//				System.out.println("file is not created");
//			}
			FileWriter fw=new FileWriter(f1,true);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.newLine();
			bw.write("hey hello");
			bw.newLine();
			bw.write("hey hello");
			bw.flush();
//			
//			FileReader fr=new FileReader(f1);
//			char [] arr=new char [(int) f1.length()];
//			fr.read(arr);
//			String a1=new String(arr);
//			System.out.println(a1);
//		
//		Thread.sleep(5000);
//		if (f1.delete()) {
//			System.out.println("deleted");
//		} else {
//			System.out.println("not ");
//		}
		
	}
	
	
}
