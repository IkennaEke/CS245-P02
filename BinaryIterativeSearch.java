
public class BinaryIterativeSearch implements Practice2Search {

	@Override
	public String searchName() {
		return "Binary Iterative Search";
	}

	@Override
	public int search(int[] arr, int target) {
		return search(arr, target, 0, arr.length-1);
	}
	
	private int search(int [] arr, int target, int start, int end){
		while (start != end){
			int mid = (end+start)/2;
			if(arr[mid] == target){
				return arr[mid];
			}
			else{
				if(arr[mid]<target){
					start= mid+1;
				}
				else if(arr[mid]>target){
					end = mid-1;
				}
			}
			
		}
		return -1;
	}
	

}
