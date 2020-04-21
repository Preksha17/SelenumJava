package programs;

abstract class Games {
	abstract void playagame();
	abstract void scorecard();
   void viewInstruction()
    {
    	System.out.println("Instruction will be same");
    }
   static void Exitgame()
    {
    	System.out.println("Closing game");
    }

}
