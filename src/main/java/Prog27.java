/**
 * 27.求100之内的素数 ------------------
 * 
 */
public class Prog27 {

	public static void main(String[] args) {
		int[] a = new int[101];

		int i = 2;
		boolean flag = true;
		while (flag) {
			while (i < 101) {
				if (a[i] == 0) {
					for (int j = 2; (i * j) < 101; j++) {
						a[i * j] = 1;
					}
					i++;
				} else {
					i++;
				}
			}
			for (int j = 1; j < a.length; j++) {
				if (j >= 1 && j <= 100 && a[j] == 0) {

					System.out.println( + j + "是质素");
				}
			}
			flag = false;
		}
	}

}
