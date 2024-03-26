package Chap02;

import java.util.Random;
import java.util.Scanner;

public class MaxofArrayRnad {
	public static void main(String[] args) {
	int num = getPositiveNumber("사람 수 : ");
	int[] height = new int[num];
	getRandArray(height, 100, 200);
	
	int max = max0f(height);
	System.out.println("가장 큰 키는 "+max+"cm입니다.");
	}
	static int max0f(int[] numArr) {

		int max = numArr[0];
		
		for (int i = 1; i < numArr.length; i++) {
			if(numArr[i] > max) max = numArr[i];
		}
		return max;
	}
	static int getPositiveNumber(String message) {
		int num;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print(message);
			num = sc.nextInt();
		} while(num <= 0);
		return num;	
	}
	static void getRandArray(int[] numArr, int start,int end) {
		Random rd = new Random();
		
		for(int i = 0; i < numArr.length; i++) {
		 numArr[i] = start + rd.nextInt(end-start);
		 System.out.print(numArr[i]+" ");
		}
	System.out.println();
	}
}
