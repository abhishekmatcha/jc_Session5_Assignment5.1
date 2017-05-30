package ses5asi1;
	
	public class Triangle extends Figure {
		Triangle(double d1, double d2, double d3) {
			super(d1, d2, d3);
		}

		void findArea() {
			double area = (dimension1 * dimension2) / 2;
			System.out.println("Area of Triangle=" + area);
		}

		void findPerimeter() {
			double perimeter = dimension1 + dimension2 + dimension3;
			System.out.println("Perimeter of Triangle=" + perimeter);

		}

	}

