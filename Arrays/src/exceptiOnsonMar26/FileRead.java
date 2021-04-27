package exceptiOnsonMar26;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
public static void main(String[] args) {
	FileRead f=new FileRead();
	try {
		FileReader fr=new FileReader("hg.txt");
		int a=0;
		try {
			while((a=fr.read())!=-1) {
				System.out.print((char)a);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	
}
}
