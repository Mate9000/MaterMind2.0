package masterMind2;
import java.util.Random;

public class MasterMath {
	Random random = new Random();
	String secretCode = "";
    public String generator (int[] numbers) {
	for (int e = 0; e < numbers.length; e++) {
		numbers[e] = (int) random.nextInt(6);
		secretCode = "" + numbers[0]+ numbers[1]+ numbers[2]+ numbers[e];
	}
	return secretCode;
	}
}