package conditionalex;

public class Gradenberekenaar {

    public Double findTotal(double temp, String unit, String toUnit) {
    	if(unit.equals("celsius") && toUnit.equals("fahrenheit")) {
    		return (temp * (9/5)) + 32;
    	}
    	else if (unit.equals("celsius") && toUnit.equals("kelvin")) {
    		return (temp + 273);
    	}
    	else if (unit.equals("fahrenheit") && toUnit.equals("celsius")) {
    		return (temp * (5/9)) - 32;
    	}
    	else if (unit.equals("fahrenheit") && toUnit.equals("kelvin")) {
    		return (temp + 273);
    	}
    	else if (unit.equals("kelvin") && toUnit.equals("celsius")) {
    		return (temp + 273);
    	}
    	else if (unit.equals("kelvin") && toUnit.equals("fahrenheit")) {
    		return (temp + 273);
    	}
    	
    	
    	
    	return -1.0;
    }
}
