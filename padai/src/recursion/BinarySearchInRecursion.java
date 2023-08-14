package recursion;

public class BinarySearchInRecursion {
	public static void main(String[] args) {
		int [] arr = {1,2,3,5,78,88,90,95,98};
		
		int target = 88 ;
		int idx = search(arr, 0, arr.length-1, target);
		System.out.println(idx);
		
	}
	private static int search(int[] arr, int st, int end, int target) {
		if(st>end) {
			return -1;
		}
		int mid = st+(end-st)/2;
		if(arr[mid]==target) {
			return mid;
		}
		if(arr[mid]>target) {
			return search(arr, st, mid-1, target);
		}
		else {
			return search(arr, mid+1, end, target);
		}
	}

}
