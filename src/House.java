import java.util.ArrayList;
import java.util.Scanner;

public class House {
	
	int numRooms;
	ArrayList<Rooms> rooms = new ArrayList<Rooms>();
	
	public House(int numRooms) {
		super();
		this.numRooms = numRooms;
		addRooms(numRooms);
	}
	public void addRooms(int numRooms) {
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < numRooms; i++) {
			System.out.println("Enter the angle of the room seperated by space");
			String anglesInput = input.nextLine();
			String [] angles = anglesInput.split(" ");
			if(angles.length == 1) {
				System.out.println("Enter the sides of the room seperated by space");
				int side = input.nextInt();
				input.nextLine(); 
				Circle circleRooms = new Circle(side);
				addRooms(circleRooms);
			}
			else if(angles.length == 3) {
				System.out.println("Enter the sides of the room seperated by space");
				int side1 = input.nextInt();
				int side2 = input.nextInt();
				int side3 = input.nextInt();
				Triangle triRoom = new Triangle(side1, side2, side3);
				addRooms(triRoom);
			}
			else if(angles.length == 4) {
				int[] anglesIntArray = new int[angles.length];
		        for (int f = 0; i < angles.length; i++) {
		            anglesIntArray[i] = Integer.parseInt(angles[i]);
		        }
		        System.out.println("Enter the sides of the room seperated by space");
				int side1 = input.nextInt();
				int side2 = input.nextInt();
				int side3 = input.nextInt();
				int side4 = input.nextInt();
		        if(anglesIntArray[0] == anglesIntArray[1]) {
		        	Square sqrRoom = new Square(side1, side2, side3, side4);
		        	addRooms(sqrRoom);
		        }
		        else if(anglesIntArray[0] != anglesIntArray[1]) {
		        	Rectangle recRoom = new Rectangle(side1, side2, side3, side4);
		        	addRooms(recRoom);
		        }			
			}
			
		}
			
	}
	public void addRooms(Rooms room) {
		rooms.add(room);
	}
	public double totalSqrFootage() {
		double totalSq = 0;
		for(Rooms i : rooms) {
			totalSq += i.getArea();
		}
		return totalSq;
	}
	public void printRooms() {
		int count = 0;
		for(Rooms r : rooms) {
			if(r instanceof Circle) {
				System.out.println("Circle Rooms");
				System.out.println("	Room: " + count + 1);
				System.out.println("	Square Footage: " + r.getArea());
				System.out.println("	Perimeter: " + r.getPerimeter());
				System.out.println("	Furniture:");
				r.printFurniture(); 
			}
			else if(r instanceof Square) {
				System.out.println("Square Rooms");
				System.out.println("	Room: " + count + 1);
				System.out.println("	Square Footage: " + r.getArea());
				System.out.println("	Perimeter: " + r.getPerimeter());
				System.out.println("	Furniture:");
				r.printFurniture(); 
			}
			else if(r instanceof Rectangle) {
				System.out.println("Rectangle Rooms");
				System.out.println("	Room: " + count + 1);
				System.out.println("	Square Footage: " + r.getArea());
				System.out.println("	Perimeter: " + r.getPerimeter());
				System.out.println("	Furniture:");
				r.printFurniture(); 
			}
			else if(r instanceof Triangle) {
				System.out.println("Triangle Rooms");
				System.out.println("	Room: " + count + 1);
				System.out.println("	Square Footage: " + r.getArea());
				System.out.println("	Perimeter: " + r.getPerimeter());
				System.out.println("	Furniture:");
				r.printFurniture(); 
			}
		}
	}
	
	
}
