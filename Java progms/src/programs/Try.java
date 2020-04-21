package programs;

public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int n=60;
		try {
			n=n/0;
		} catch (ArithmeticException  evar) {
			// TODO: handle exception
			System.out.println(evar);
		}

	}

}
