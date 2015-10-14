package kr.ac.kookmin.exception.fileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class AddLineNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String path = AddLineNumber.class.getResource("").getPath();
	       //System.out.println(path);
	       
	       try {
			BufferedReader inputStream = 
			           new BufferedReader(new FileReader("original.txt"));
			PrintWriter outputStream = 
	               new PrintWriter(new FileOutputStream("numbered.txt"));
			
			
			
			for(int i = 1; i <= 6; i++){
				String str = inputStream.readLine();
				str = (i) + str + '\n';

				outputStream.write(str);
			}
			
			inputStream.close();

			outputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	         

	}

}