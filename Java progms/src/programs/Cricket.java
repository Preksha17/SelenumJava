package programs;

public class Cricket extends Games {
	 void playagame()
	 {
		 System.out.println("play games");
	 }
	 void scorecard()
	 {
		 System.out.println("score");
	 }
	 static int c=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cricket C=new Cricket();
		
          Exitgame();
          C.playagame();
          C.scorecard();
          C.viewInstruction();
          System.out.println(c);



	}

}
