////Do this in steps - Set up the following variables:
//A variable with the name of someone whose birthday is coming up
//A variable to hold if you are attending birthday party
//2 variables to hold 5 star ratings
//A variable to hold an average of 5 star ratings
//
//Then use the above variables in the following way:
//Use the variable and \n (new line character) to sing the entire Happy Birthday song.  It should print on 5 lines but you can only use one TEXT line to do so.
//Surround the variable with an IF statement that only sings if you are going to the party.  If not, it does nothing
//Test by changing the party variable
//Calculate the average of the 2 ratings and store it in the average variable.  Then print the average.
public class VarChallange {

	public static void main(String[] args) 
	{
		String name ="hassan";
		boolean goingParty=true;
		double rating1=5;
		double rating2=4;
		double average = rating1 + rating2; 
		average = average/2;
		System.out.println(average);
		if(goingParty) 
		{
			System.out.println("\nHappy birthday to you"+"\nYour a hundred and two" +"\nThis song is very sad"+ "\nHappy brithday to you"+"\nHappy brithday to you");
		}
		
	}

}

