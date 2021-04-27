package exceptiOnsonMar26;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			int a=10/2;
			System.out.println(a);
		System.exit(0);
		}catch(ArithmeticException e){
			System.out.println(10/2);
		}finally {
			System.out.println("finally block");
		}
		  
	}

}
