package exceptionMar27;

public class MyArrayList {
	
	private int size;
	private Object[] array;
	private int flag=0;
	public MyArrayList(int size) {
		this.size = size;
		array=new Object[size];
	}

	public void add(Object obj) throws InValidSizeException   {
		if(!(flag<size)) 
			throw new InValidSizeException("Index more than size");
			array[flag]=obj;
			flag++;
		
	}
	public Object get(int index) {
		return array[index];
		
	}
	

}
