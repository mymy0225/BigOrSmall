package practical13;
import java.util.Random;
public class RandomNumberGenerator {

	public int generateRandom() {
		Random random=new Random();
		return random.nextInt(8)+1;
	}
}
