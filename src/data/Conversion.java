package data;


public class Conversion {

	public static void main(String[] args) {
        //Declare and initialize a byte with a value of 128
        //Observe NetBeans' complaint
		//de byte kan niet boven 127 of onder 127 dus het vraagt je om een ander te gebruiken of het kleiner te maken
		byte numero = 128;
        //Declare and initialize a short with a value of 128
        //Create a print statement that casts this short to a byte
		short yes = 128;
        
        //Declare and initialize a byte with a value of 127
        //Add 1 to this variable and print it
        //Add 1 to this variable again and print it again
		//het ging over 127 dus het besluit om opnieuw naar de laagste nummer te beginnen en het is -128 want 0 bestaat
		byte i = 127;
		System.out.println(i += 1);
		System.out.println(i += 1);
	}

}
