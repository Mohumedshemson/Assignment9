import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mainMenu();
		
		
	}
	public static void mainMenu() {
		ArrayList<House> houses = new ArrayList<House>();
		Scanner input = new Scanner(System.in);
		int choice = 0;
		while(choice != 3) {
			System.out.println("Choose an Option");
			System.out.println("1. View Houses      2. Add House\n3. Quit");
			choice = input.nextInt();
			
			if(choice == 1) {
				for(House h: houses) {
					System.out.println("Square Footage of House: " + h.totalSqrFootage());
					h.printRooms();
				}
			}
			else if(choice == 2) {
				System.out.println("Insert Information");
				System.out.println("How many rooms are in the house");
				int numRooms = input.nextInt();
				House house = new House(numRooms);
				houses.add(house);
			}
			
			
		}
	}
}
