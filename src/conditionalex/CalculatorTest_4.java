package conditionalex;

public class CalculatorTest_4 {
    public static void main(String[] args) {
        
        Calculator_4 calc = new Calculator_4();
        
        //Name your friends
        double Walter = calc.findTotal(10, "Walter");
        Walter += calc.findTotal(12, "Jessie");
        Walter += calc.findTotal(9,  "Hank");
        Walter += calc.findTotal(8,  "Gus");
        Walter += calc.findTotal(7,  "Skyler");
        Walter += calc.findTotal(15, "Alex");
        Walter += calc.findTotal(11, "Tuco");
        Walter += calc.findTotal(30, "Forgetful");

        //Find and print the entire table's total, including tax and tip
        System.out.println(Walter);
        
        
    } 
}