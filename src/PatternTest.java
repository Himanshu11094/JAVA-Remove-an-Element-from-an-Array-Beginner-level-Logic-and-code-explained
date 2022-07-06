
public class PatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int row=0; row<5;row++)
		{
			for(int space=5-row;space>=0;space--)
			{
			
				System.out.print(" ");
			    
			}	
			for (int star=0;star<=row+row;star++)
			{System.out.print ("*");}
			System.out.println("");
		
		}
	}

}
