import java.util.ArrayList;
import java.util.Scanner;

public class Triangle extends Rooms {
	double side1;
	double side2;
	double side3;
	ArrayList <Furniture> furnitures;

	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
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
	public void addFurnitures(Furniture furnitures) {
		this.furnitures.add(furnitures);
	}
	@Override
	public double getArea() {
		double s = (this.side1 + this.side2 + this.side3) / 2;
		double area = Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
		return area;
	}

@Override
	public double getPerimeter() {
		double perimeter = this.side1 + this.side2 + this.side3;
		return perimeter;
	}

	@Override
	public double getHeight() {
		double s = (this.side1 + this.side2 + this.side3) / 2;
		double area = Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
		double height = (2 * area) / this.side1;
		return height;
	}

	@Override
	public ArrayList<Furniture> getFurniture() {
		// TODO Auto-generated method stub
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
