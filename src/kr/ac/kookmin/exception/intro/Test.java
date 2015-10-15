package kr.ac.kookmin.exception.intro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class AAA{
	
	public void readFile(){
		String Text = "";
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("/Users/user/workspace/6th/src/kr/ac/kookmin/exception/intro/a.text");
			int i;
			while((i = fis.read()) != -1){
				Text = Text + (char)i;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("text : " + Text);
		}
	}
}

public class Test {
	public static void main(String[] args){
		AAA a = new AAA();
		a.readFile();
	}
}

