/**
 * 31.将一个数组逆序输出。 -----------------------
 * 
 * 程序分析：用第一个与最后一个交换。
 * 
 * 
 */
public class Prog31 {

	public static void main(String[] args) {
		int a[] = new int[100];
		for (int x = 0; x < a.length; x++) {
			a[x] = x;
		}

		for (int i = a.length-1; i >= 0; i--) {
			System.out.println(a[i]);
		}
	}

}
