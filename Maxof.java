package Chap02;

public class Maxof {
	public static void main(String[] args) {
		int[] numArr = {32,45,67,30,69};
		
		int max = max0f(numArr);
		
		System.out.println("최댓값은 "+max+"입니다.");
	}
	static int max0f(int[] numArr) {

		int max = numArr[0];
		
		for (int i = 1; i < numArr.length; i++) {
			if(numArr[i] > max) max = numArr[i];
		}
		return max;
	}
}