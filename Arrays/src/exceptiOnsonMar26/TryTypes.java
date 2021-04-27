package exceptiOnsonMar26;

import java.io.FileWriter;
import java.io.IOException;

public class TryTypes {
	public static void main(String[] args) {
		FileWriter fw=null;
	
	try {
		fw=new FileWriter("k.txt");
		fw.write("hello pant ");
		fw.flush();
		
	}catch(IOException e){
		e.printStackTrace();
	}finally {
		try {
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

}
}
