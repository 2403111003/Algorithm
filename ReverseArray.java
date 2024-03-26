package Chap02;

public class ReverseArray {
	public static void main(String[] agrs) {
		int numArr[] = {0,1,2,3,4};
		
		//reverseArray(numArr);
		
		reverseArray2(numArr);
		
		displayArray(numArr);
		
	}
	static void reverseArray(int[] numArr) {
		for(int i = 0; i < numArr.length / 2; i++) {
		swapArr(numArr, i, numArr.length - 1 - i);
		}
	}
	static void reverseArray2(int[] numArr) {
		for(int i = 0,j = numArr.length - 1;i < numArr.length/ 2; i++)
			swapArr(numArr, i, j);
	}
	static void swapArr(int[] numArr,int source, int target) {
		int temp = numArr[source];
		numArr[source] = numArr[target];
		numArr[target] = temp;	
	}
	static void displayArray(int[] numArr) {
		for(int i = 0; i < numArr.length; i++)
			System.out.print(numArr[i]+" ");
		System.out.println();
	}
}
