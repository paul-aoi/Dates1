import java.util.Scanner;

public class LabSeven {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputs;
		int input;
		String[] names = {"Paul", "Eric", "Rapha", "Asura" , "Chelsea", "Brandon", "Kathleen", "Candelaria", "Alex", "Ashish"};
		int number[] = {0,1,2,3,4,5,6,7,8,9};
		String colors[] = {"blue", "red", "orange", "black", "purple", "yellow", "green", "indigo", "violet", "turquoise" };
		int loopA = 0;
		int loopB = 0;
		boolean valid;
		
		
do{		
	do{
		System.out.println("who do you want to learn about? enter 1-10");
		input = scan.nextInt();
		if (input <= names.length) {			
			System.out.println(names[input  -1]);
			System.out.println("would you like to know their favorite* \n  "
					+ "color or favorite* number?  color/number ");
			break;
		}
		else if (input > 10 || input < 1){
			System.out.println("invalid number, try again ");
			valid = true;
		}
	}while (valid =true);
		
	
		
	
			
	do{
		inputs = scan.nextLine();
			
		
		if (inputs.equalsIgnoreCase("number")){
			System.out.println(number[input -1]);
			break;
			
		}
		else if (inputs.equalsIgnoreCase("color")) {
				System.out.println(colors[input -1]);
				break;
		 }
		else {
			System.out.println("invalid input, try again");
			loopB = 1;
		}
	}while (loopB == 1);
	
	do {
		System.out.println("would you like to try again, yo?  Y/N ");
		inputs = scan.nextLine();
		 
		if (inputs.equalsIgnoreCase("y")){
			loopA = 1;
			break;
		}
		else if (inputs.equalsIgnoreCase("n")) {
			System.out.println("thanks for choosing my program");
			break;
			}
		else {
			System.out.println("invalid input, please enter Y or N");
			
		}
		
	}while (valid = true);

}while(loopA == 1);
	}
}

