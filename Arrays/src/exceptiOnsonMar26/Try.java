package exceptiOnsonMar26;

import java.io.FileWriter;
import java.io.IOException;

public class Try {
	public static void main(String[] args) {
		
		try {
			FileWriter fr=new FileWriter("ax.txt");
			try {
				FileWriter fs=new FileWriter("ax.txt");
			}
			
			catch(IOException e) {
				
			}
			finally {
				
			}
			System.out.println();
		}
		
		
		catch(IOException e) {
			System.out.println();
		}
		finally {
			
		}
		
		System.out.println();
		

}
}

