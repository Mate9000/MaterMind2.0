package conditionalex;

public class Calculator_week7 {
    public int add(int x, int y){
        return x + y;
    }
    
    // This method could throw an ArithmeticException
    public double divide(int x, int y) {
        int result = 0;
    	try {
        	int[] vars = new int[5];
        	vars[5] = 230;
        	result = x / y;
    	return x / y;
        }
    	catch(Exception ex)
    	{
    		
    	}
        catch(ArithmeticException ex)
        {
        	System.out.println(ex.getMessage());
        }
        return result;
    }
}
