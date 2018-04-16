/**
 
 10.反指数计算
-------------

一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在
第10次落地时，共经过多少米？第10次反弹多高？

 */
public class Prog10 {

	public static void main(String[] args) {
		int x=100;
		int[] a = new int[1000];
		for (int i = 1; x!=0; i++) {
			a[i]=x;
			System.out.println("第"+(i-1)+"次落地篮球高度为"+x);
			x=x/2;
		}
		System.out.println(x);
	}

}
