package uppgift;

public class gendertest {
	
	public static void main(String[] args) {
		
		Gender kön = Gender.RARTED;
		switch(kön) {
		
		case MALE:
			System.out.println("Tja dude");
			break;
			
		case FEMALE:
			System.out.println("supp thot?");
			break;
			
		case RARTED:
			System.out.println(" Hej special snowflake");
			break;
		
		case TRAP:
			System.out.println("Traps are gay");
			break;
			
		case REVERSE_TRAP:
			System.out.println("You´re just weird dude");
		
		}
		
	}

}
