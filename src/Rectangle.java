import java.util.ArrayList;
import java.util.Scanner;

public class Rectangle extends Rooms{
	double side1;
	double side2;
	double side3;
	double side4;
	ArrayList <Furniture> furnitures;

	public Rectangle(double side1, double side2, double side3, double side4) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.side4 = side4;
		this.furnitures = new ArrayList<Furniture>();
		askFurniture();
		 
	}
	public void askFurniture() {
		Scanner input = new Scanner(System.in);
		System.out.println("Inser Information");
		System.out.println("Do you want to add a piece of furniture Y or N");
		String choice = input.next();
		if(choice == "Y") {
			System.out.println("How much furniture would you like to add");
			int numFurn = input.nextInt();
			for(int i = 0; i < numFurn; i++) {
				System.out.println("Enter Name:");
				String name = input.next();
				System.out.println("Enter cost:");
				float cost = input.nextFloat();
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
			System.out.println("No Furniture in the room"); 
		}
	}
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide3() {
		return side3;
	}
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	public double getSide4() {
		return side4;
	}
	public void setSide4(double side4) {
		this.side4 = side4;
	}
	public void addFurnitures(Furniture furnitures) {
		this.furnitures.add(furnitures);
	}
	@Override
	public double getArea() {
		double area = this.side1 * this.side2;
		return area;
	}

	@Override
	public double getPerimeter() {
		double perimeter = 2 * (this.side1 + this.side2);
		return perimeter;
	}

	@Override
	public double getHeight() {
		
		return this.side2;
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
