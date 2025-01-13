package conditionalex;

public class ShoppingCart {

    public static void main(String[] args) {
        Calculator_week7 calc = new Calculator_week7();
        int addResult = calc.add(43, 79);
        System.out.println("Add Result: " + addResult);

        double divResult = calc.divide(15, 0);
        System.out.println("Division Result: " + divResult);

    }
}
