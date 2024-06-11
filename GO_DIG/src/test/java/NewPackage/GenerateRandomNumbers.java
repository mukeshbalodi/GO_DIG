package NewPackage;
import java.util.Random;

public class GenerateRandomNumbers {
	private static String getDecimalRandomNumber() {
		Random rand = new Random();
        float randomNumber = rand.nextFloat() * 100;
        int truncatedNumber = (int) randomNumber;
        float result = truncatedNumber / 100.0f;
        return String.format(".%02d" );
    }

    public static void main(String[] args) {
        System.out.println(getDecimalRandomNumber());
    }
}
