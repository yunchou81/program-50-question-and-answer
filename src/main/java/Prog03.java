
/**
 * 
 * 3.水仙花数 ----------
 * 
 * 打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
 * 
 * 程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
 * 
 * 
 */
public class Prog03 {

	public static void main(String[] args) {
		int a = 1;
		int b = 0;
		int c = 0;
		int x = 0;
		int y = 0;

		while (x <= 999) {
			x = a * 100 + b * 10 + c;
			y = a * a * a + b * b * b + c * c * c;
			if (x == y) {
				System.out.println(x);

				c = c + 1;
				if (c == 10) {
					b = b + 1;
					c = 0;
					if (b == 10) {
						a = a + 1;
						b = 0;
					}
				}
				x = a * 100 + b * 10 + c;
				y = a * a * a + b * b * b + c * c * c;
			
			} else {
				c = c + 1;
				if (c == 10) {
					b = b + 1;
					c = 0;
					if (b == 10) {
						a = a + 1;
						b = 0;
					}
				}
				x = a * 100 + b * 10 + c;
				y = a * a * a + b * b * b + c * c * c;
			}

		}
	}

}
