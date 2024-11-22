package data;

public class Parsing01 {

	public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice = "15";
        String taxRate = "0.05";
        String gibberish = "12576qtgsafhxzua26tft1g";
        
        //Parse shirtPrice and taxRate, and print the total tax
        int i = Integer.parseInt(shirtPrice);
        double x = Double.parseDouble(taxRate);
        System.out.println( i * x );

        //Try to parse taxRate as an int

        //Try to parse gibberish as an int

    }
    
}
