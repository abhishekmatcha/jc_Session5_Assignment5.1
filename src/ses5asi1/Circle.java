package ses5asi1;

import java.util.*;

	public class Circle extends Figure {
		double pi = Math.PI;

		Circle(double d1, double d2, double d3) {
			super(d1, d2, d3);
		}

		void findArea() {
			double area = pi * dimension1 * dimension1;
			System.out.println("Area of Circle=" + area);
		}

		void findPerimeter() {
			double perimeter = 2 * pi * dimension1;
			System.out.println("Perimeter of Circle=" + perimeter);
		}

	}


