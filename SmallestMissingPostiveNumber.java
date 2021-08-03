package strings;
/**
 * 
 *  Find smallest positive number in an array
 * **/


public class SmallestMissingPostiveNumber {

	public SmallestMissingPostiveNumber() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int a[] = { 3,4,1,7 };
		System.out.println("Smallest Missing Postive Number " + positiveMissingNmb(a));

	}

	public static int positiveMissingNmb(int[] a) {
		if (a == null && a.length == 0)
			return 1;
		int n = a.length;
		int containsOne = 0;
		// Step 1
		for (int i = 0; i < n; i++) {
			if (a[i] == 1) {
				containsOne = 1;
			} else if (a[i] < 0 || a[i] > n) {
				a[i] = 1;
			}
		}
		if (containsOne == 0)
			return 1;
		// step 2
		for (int i = 0; i < n; i++) {
			int index = Math.abs(a[i]) - 1;
			if (a[index] > 0) {
				a[index] = -1 * a[index];
			}
		}
// step 3
		for (int i = 0; i < n; i++) {
			if (a[i] > 0) {
				return i + 1;
			}
		}
		return n + 1;
	}

}
