import java.math.BigInteger;

public class LookAndSay {

	public static void main(String[] args) {
		System.out.println(lookAndSay(3132));
		System.out.println((lookAndSay2(new BigInteger("1213200012171979"))));
		System.out.println(lookAndSay2(BigInteger.valueOf(54544666)));
		System.out.println(lookAndSay(95));
		System.out.println(lookAndSay2(new BigInteger("1213141516171819")));
		System.out.println(lookAndSay(120520));
		System.out.println(lookAndSay2(BigInteger.valueOf(231)));
		

	}
	
	public static long lookAndSay(long num) {
		
		String numString = Long.toString(num);
		String result = "";
		if(numString.length() % 2 != 0) {
			return -1;
		}
		for(int i = 0; i < numString.length() - 1; i = i + 2) {
			int temp = Character.getNumericValue(numString.charAt(i));
			for(int j = 0; j < temp; j++) {
				result = result + numString.charAt(i + 1);
			}
		}
		return Long.parseLong(result);
		
	}
	
	public static BigInteger lookAndSay2(BigInteger num) {
		
		String numString = num.toString();
		String result = "";
		if(numString.length() % 2 != 0) {
			return BigInteger.valueOf(-1);
		}
		for(int i = 0; i < numString.length() - 1; i = i + 2) {
			int temp = Character.getNumericValue(numString.charAt(i));
			for(int j = 0; j < temp; j++) {
				result = result + numString.charAt(i + 1);
			}
		}
		return new BigInteger(result);
		
	}

}
