package chararray;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CharArray ca = new CharArray(
				 new char[] {'H', 'A', 'L', 'L', 'O'});
		 
		 ca.print();
		 
		 ca.print(1, 4);
		 
		 System.out.println("Counter: " + ca.Counter);
		 System.out.println("Counter: " + CharArray.Counter);
		 
		 CharArray caWorld = new CharArray(
				 new char[] {'W', 'O', 'R', 'L', 'D'});
		 
		 ca.print();
		 System.out.println("Counter: " + ca.Counter);
		 System.out.println("Counter: " + caWorld.Counter);
		 System.out.println("Counter: " + CharArray.Counter);
		 
		 caWorld.print();


		System.out.println("caWorld.length() = " + caWorld.length());
	 
	}

}
