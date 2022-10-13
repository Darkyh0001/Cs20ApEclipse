import java.util.ArrayList;
public class Superheros 
{
	public static void main(String[] args) 
	{
		ArrayList<String> hero= new ArrayList<String>();
	    hero.add("Pigeon Man");
	    hero.add("Polar Man");
	    hero.add("JustinTrudeau");
	    hero.add("CaptainCanada");
	    hero.add("Maple Man");
	    for(int i=0; i < 5;i++) {
//		System.out.println(hero.get(i) )  ;
		hero.set(0, "Poutine Man");
	    hero.set(4, "ClearIce");
//	    System.out.println(hero );
		}
	    ArrayList<String> superPower= new ArrayList<String>();
	    superPower.add("Flying");
	    superPower.add("Icy breath");
	    superPower.add("Bad Politics");
	    superPower.add("Canadian Anthem");
	    superPower.add("The art of syrup");
	    for(int i=0; i < 5;i++) {
//	    	System.out.println(superPower.get(i) );
	    	
	    }
	    System.out.println("Name		        Power			They are human?");
	    ArrayList<Boolean> isHuman= new ArrayList<Boolean>();
	    isHuman.add(true);
	    isHuman.add(true);
	    isHuman.add(false);
	    isHuman.add(false);
	    isHuman.add(true);
	    for(int i=0; i < 5;i++) {
//	    	System.out.println(isHuman.get(i) );
	    	System.out.println((i) + " "+ hero.get(i) + "		" + superPower.get(i)+ "		" + isHuman.get(i));
	    }
	    for(int i=0; i < 5;i++) {
	    if(isHuman.get(i)){
    		System.out.println("Humans:");
	    	System.out.println((i) + " "+ hero.get(i) + "		" + superPower.get(i)+ "		" + isHuman.get(i));
	    }
	    }
	    for(int i=0; i < 5;i++) {
	    	if(hero.get(i).contains(" Man")) {
	    		System.out.println("Affiliation with man:");
		    	System.out.println((i) + " "+ hero.get(i) + "		" + superPower.get(i)+ "		" + isHuman.get(i));
		    	}
	    	}
	    }
}
// explore print f method

