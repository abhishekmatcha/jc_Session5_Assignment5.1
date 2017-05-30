package ses5asi1;

	public class Main {
		public static void main(String[] args) {
			Figure ob1 = new Circle(10, 0, 0);
			Figure ob2 = new Rectangle(9, 8, 0);
			Figure ob3 = new Triangle(6, 7, 4);
			System.out.println("Area and Perimeter of cirle for radius=" + ob1.dimension1);
			ob1.findArea();
			ob1.findPerimeter();
			System.out.println("");
			System.out.println("Now We will calculate area and perimeter of rectangle");
			System.out.println("Area and Perimeter of Rectangle length Length=" + ob2.dimension1 + "Width=" + ob2.dimension2);
			ob2.findArea();
			ob2.findPerimeter();
			System.out.println("");
			System.out.println("Now We will calculate area and perimeter of Triangle");
			System.out.println("Area and Perimeter of Traiangle for Base=" + ob3.dimension1 + "Height=" + ob3.dimension2
					+ "Side=" + ob3.dimension3);
			ob3.findArea();
			ob3.findPerimeter();
		}
	}



	

