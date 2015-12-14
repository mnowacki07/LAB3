package dad;

import java.util.Random;

public class Randoom {
	Random generator = new Random();
	final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVXYZ";
	final int N = 2;

	public int getRandomNumber() {
		int randomInt = 0;
		Random randomGenerator = new Random();
		randomInt = randomGenerator.nextInt(N);
		if (randomInt - 1 == -1) {
			return randomInt;
		} else {
			return randomInt - 1;
		}
	}

	public String generateRandomString() {

		StringBuffer randStr = new StringBuffer();
		for (int i = 0; i < N; i++) {
			int number = getRandomNumber();
			char ch = alphabet.charAt(number);
			randStr.append(ch);
		}
		return randStr.toString();
	}

}
