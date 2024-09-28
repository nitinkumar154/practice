package recursion;

public class SortedArray {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,12,9};
		boolean res = isSorted(arr, 0);
System.out.println(res);
	}

	private static boolean isSorted(int[] arr, int st) {
		if(st== arr.length-2) {
			return arr[st]<arr[st+1];
		}
		
		
		return  arr[st]<arr[st+1]&& isSorted(arr, st+1);
		
		
		
	}

}
