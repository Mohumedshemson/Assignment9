import java.util.ArrayList;
import java.util.Scanner;

public class Circle extends Rooms{
	
	double side1;
	ArrayList <Furniture> furnitures;
	
	public Circle(double side1) {
		super();
		this.side1 = side1;
		this.furnitures = new ArrayList <Furniture>();
		askFurniture();
		
	}
	public double getSide1() {
		return side1;
	}
	public void setSide1(float side1) {
		this.side1 = side1;
	}
	public void askFurniture() {
		Scanner input = new Scanner(System.in);
		System.out.println("Inser Information");
		System.out.println("Do you want to add a piece of furniture Y or N");
		String choice = input.next();
		if(choice.equals("Y")) {
			System.out.println("How much furniture would you like to add");
			int numFurn = input.nextInt();
			for(int i = 0; i < numFurn; i++) {
				System.out.println("Enter Name:");
				String name = input.next();
				System.out.println("Enter cost:");
				float cost = input.nextFloat();
				input.nextLine(); // Consume the newline character
				System.out.println("Enter Description:");
				String description = input.nextLine();
				System.out.println("Enter Height:");
				float height = input.nextFloat();
				System.out.println("Enter Width:");
				float width = input.nextFloat();
				System.out.println("Enter Weight:");
				float weight = input.nextFloat();
				Furniture furniture = new Furniture(name, cost, description, height, width, weight);
				addFurnitures(furniture);
			}
		}
		else if(choice == "N") {
			//System.out.println("No Furniture in the room");
			return;
		}
	}
	public void addFurnitures(Furniture furnitures) {
		this.furnitures.add(furnitures);
	}
	@Override
	public double getArea() {
		double pI = 3.145;
		double radius = this.side1 / (2 * pI);
		double area = pI * Math.pow(radius, 2);
		
		return area;
	}
	@Override
	public double getPerimeter() {
		double pI = 3.145;
		double radius = this.side1 / (2 * pI);
		double perimeter = 2 * (pI * radius);
		return perimeter;
	}
	@Override
	public double getHeight() {
		
		return 0;
	}
	@Override
	public ArrayList<Furniture> getFurniture() {
		
		return this.furnitures;
	}
	
	public void printFurniture() {
		for(Furniture f : furnitures) {
			System.out.println("			Name: " + f.name);
			System.out.println("			Cost: " + f.cost);
			System.out.println("			Height: " + f.height);
			System.out.println("			Width: " + f.width);
			System.out.println("			Weight: " + f.weight);
			System.out.println("			Description: " + f.desctiption);
		}
		
	}
	
	
}
