package exceptionMar27;

public class Test {
		public static void demo() {
			System.out.println("Hello world");
		}
		public static void main(String[] args) {
			MyArrayList mal=new MyArrayList(5);
			try {
				mal.add(new Employee(1,"obula",20000));
				mal.add(new Employee(2,"sambhu",30000));
				mal.add(new Employee(3,"guru",60000));
				mal.add(new Employee(4,"sekhar",90000));
				mal.add(new Employee(5,"obula",250000));
			//	mal.add(new Employee(6,"obula",250000));
				//mal.add(new Employee(7,"obula",250000));
			} catch (InValidSizeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			System.out.println(mal.get(3));
		}
	
}
