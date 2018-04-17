import java.util.Iterator;

/**
 * 13.求未知数 -----------
 * 
 * 一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
 * 
 * 程序分析：在10万以内判断，先将该数加上100后再开方，再将该数加上268后再开方，如果开方后的结果满足如下条件，即是结果。
 * 
 * 
 */
public class Prog13 {

	public static void main(String[] args) {
		boolean[] array = new boolean[1000001];
		int[] array1 = new int[1000];
		int j = 0;
		for (int i = 1; i * i <= 1000; i++) {
			array[i * i] = true;
		}
//		for (int i = 0; i < 1000001; i++) {
//			if (array[i]) {
//				array1[j] = i;
//				System.out.println(array1[j]);
//				j++;
//
//			}
//		}

		for (int i = 0; i < 1000; i++) {
			if (array[i + 100]) {
				if (array[i + 168]) {
					System.out.println(i);
				}
			}
		}

	}
}
