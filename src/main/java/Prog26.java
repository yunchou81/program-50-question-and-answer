/**
 
 26.匹配单词
-----------

请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续
判断第二个字母。

程序分析：用情况语句比较好，如果第一个字母一样，则判断用情况语句或if语句判断第二个字母。
星期一      Monday
星期二      Tuesday
星期三      Wednesday
星期四      Thursday
星期五      Friday
星期六      Saturday
星期天      Sunday
 */
import java.util.Scanner;
public class Prog26 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("一个数给我：");
		char num = scanner.nextChar();
	}

}
