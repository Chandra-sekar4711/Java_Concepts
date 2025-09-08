package sample;

import java.util.Arrays;

public class Arryss {

	public static void main(String[] args) {
		int a[] = new int[3];
		a[0]=100;
		a[1]=20;
		a[2]=340;
		System.out.println(Arrays.toString(a));

		String s[] = {"chnadrasekar","Balaji"};
		System.out.println(Arrays.toString(s));

		System.out.println(s[1]);

		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		Arrays.asList(a);
		Arrays.toString(a);
		int res = Arrays.binarySearch(a, 6);
		System.out.println(res);
		Arrays.sort(a);

		int a1[] = {1,2,3,4,5,6,6,6,};
		System.out.println(a1);






	}

}
