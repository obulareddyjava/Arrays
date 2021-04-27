package exceptiOnsonMar26;

public class ExceptionWithTry {
public static void main(String[] args) {
	try {
		
		System.out.println("two"+10/0);
		}catch(ArithmeticException e) {
			//e.printStackTrace();
			//e.toString();
			e.getMessage();
		}finally{
			String a=null;
			System.out.println(a.length());
		}
	
}
}
