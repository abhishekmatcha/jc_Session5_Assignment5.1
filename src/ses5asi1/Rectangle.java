package ses5asi1;

public class Rectangle extends Figure {

		Rectangle(double d1, double d2, double d3) {
			super(d1, d2, d3);
		}

		void findArea() {
			double area = dimension1 * dimension2;
			System.out.println("Area of Rectangle=" + area);
		}

		void findPerimeter() {
			double perimeter = 2 * (dimension1 + dimension2);
			System.out.println("Perimeter of Rectangle=" + perimeter);
		}

	}

	
	

