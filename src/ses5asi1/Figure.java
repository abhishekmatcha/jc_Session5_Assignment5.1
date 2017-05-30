package ses5asi1;

	abstract class Figure {
		double dimension1, dimension2, dimension3;

		Figure(double d1, double d2, double d3) {
			dimension1 = d1;
			dimension2 = d2;
			dimension3 = d3;
		}

		abstract void findArea();

		abstract void findPerimeter();
	}

		