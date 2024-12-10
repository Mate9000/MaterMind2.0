package conditionalex;

public class Manymen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		calc.originalPrice = 10;
		calc.FindTotal();
		
		calc.originalPrice = 12;
		calc.FindTotal();
	}

}
