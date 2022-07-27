package test.arrays;

public class MergeArrays {

	public static int[] mergeArrays(int[] arr1, int[] arr2) {  
	      int n1 = arr1.length;
	      int n2 = arr2.length;
	      int i = 0,j = 0,k = 0;
	      int[] res = new int[n1+n2];
	      
	      while(i < n1 && j < n2) { //continues till common min overlap
	        if(arr1[i] < arr2[j]) {
	          res[k] = arr1[i];
	          i++;
	        }
	          
	        else {
	          res[k] = arr2[j];
	          j++;
	        }
	        k++;
	      }
	      
	      while(i < n1) { //consume remaining array
	        res[k] = arr1[i];
	        k++;
	        i++;
	      }
	      while(j < n2) {
	        res[k] = arr2[j];
	        k++;
	        j++;
	      }
	      return res;
	} 
	
	public static void main(String[] args) {
		int[] arr1 = new int[] {1,4,7,10};
		int[] arr2 = new int[] {2,5,8,11};
		int[] arr3 = new int[] {3,6,9,12,14};
		
		int[] res = mergeArrays(mergeArrays(arr1,arr2), arr3);
		
		for(int i : res)
			System.out.print(i+" ");
	}

}
