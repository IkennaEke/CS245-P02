
public class BinaryRecursiveSearch implements Practice2Search {

	@Override
	public String searchName() {
		return "Binary Recursive Search";
	}

	@Override
	public int search(int[] arr, int target) {
		return search (arr, target, 0, arr.length-1);
	}

	private int search(int[] arr, int target, int start, int end) {
		if(start == end){
			return -1;
		}
		int mid =(end+start)/2;
		if(arr[mid] == target){
			return arr[mid];
		}
		if(arr[mid]<target){
			return search (arr, target, start, mid-1);
		}
		if(arr[mid]>target){
			return search (arr, target, mid+1,end);
		}
		return -1;
	}

}
