
public class LCMofArrays {

	public static void main(String[] args) {
		int[] array1 = new int[] {5, 4, 6, 46, 54, 12, 13, 17};
		int[] array2 = new int[] {46, 54, 466, 544};
		int[] array3 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] array4 = new int[] {13, 6, 17, 18, 19, 20, 37};
		System.out.println(lcm(array1));
		System.out.println(lcm(array2));
		System.out.println(lcm(array3));
		System.out.println(lcm(array4));

	}
	
	public static int lcm(int[] nums) {
		boolean flag = true;
		int count = 0;
		int multiplier = 0;
		while(flag) {
			multiplier++;
			for(int i = 0; i < nums.length; i++) {
				if(multiplier % nums[i] == 0) {
					count++;
				}
			}
			if(count == nums.length) {
				flag = false;
			}
			count = 0;
		}
		return multiplier;
	}

}
