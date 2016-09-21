package Lect_3_MethodsAndArray.Assignment;

import java.util.ArrayList;

public class Assignment {
	
	public static void sortArray01(int arr[]){

		int end = arr.length -1;
		int i =0;
		while(end>i){
			if(arr[i]==1){
				while(arr[end]!=0){
					end--;
				}
				int temp = arr[end];
				arr[end] = arr[i];
				arr[i] = temp;
			}else{
				i++;
			}
		}
	}
	// Q-1 Insertion Sort
	public static void insertSort(int arr[]){
		for(int i = 1;i<arr.length;i++){
			int temp = arr[i];
			int j = i-1;
			while(j>=0&&arr[j]>temp){
				arr[j+1] = arr[j];
				j = j-1;

			}

			arr[j+1] = temp;
		}
	}

	public static int binarySearch(int[] arr, int start, int end, int element){

		if(end<start){
			return -1;
		}
		System.out.println("Start: "+start+"  End:  "+end);
		int mid = (start+end)/2;
		if(arr[mid]==element){
			return mid;
		}
		else if(arr[mid]>element){
			return	binarySearch(arr, start, mid-1, element);
		}else if(arr[mid]<element){
			return binarySearch(arr, mid+1, end, element);
		}
		return -1;
	}

	public static ArrayList<Integer> intersectionOfArrays(int[] arr1, int[] arr2){
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(arr1.length > arr2.length){
			insertSort(arr1);
			for(int element:arr2){
				int index = binarySearch(arr1, 0, arr1.length-1, element);
				if(index!=-1){
					list.add(arr1[index]);
				}
			}
		}else{
			insertSort(arr2);
			for(int element:arr1){
				int index = binarySearch(arr2, 0, arr2.length-1, element);
				if(index!=-1){
					list.add(arr1[index]);
				}
			}
		}
		return list;

	}
	
	
	public static int rotateArray(int arr[]){
		for(int i=0;i<arr.length;i++){
			if(arr[i]>arr[i+1]){
				return i+1;
			}
		}
		return -1;
	}
	public static void sortArrayOf012(int arr[]){
		int start = 0;
		int end = arr.length-1;
		int i=0;
		while(i<=end){
			if(arr[i]==1){
				i++;
			}
			else if(arr[i]==0){
				int temp = arr[start];
				arr[start] = arr[i];
				arr[i] = temp;
				start++;
				i++;
				
			}
			
			else if(arr[i]==2){
				int temp = arr[end];
				arr[end] = arr[i];
				arr[i] = temp;
				end--;
			}
		}
	}
	
	
	public static void main(String[] args) {
		int arr1[]={-7,1,5,2,-4,3,0,-2};
		
		wave(arr1);
		for(int i: arr1){
			System.out.println(i+"  ");
		}
		
	}
	
	public static void wave(int arr[]){
		insertSort(arr);
		for(int i=0;i<arr.length-1;i++){
			swap(arr,i,i+1);
			i=i+1;
		}
	}
	public static void swap(int[] arr, int x, int y){
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
	
	
	public static int equalibrium(int[] arr){
		int sumLeft = 0;
		int sumRight = 0;
		for(int i:arr){
			sumRight= sumRight+i;
		}
		for(int i=0;i<arr.length;i++){
			sumRight = sumRight-arr[i];
			if(sumLeft==sumRight){
				return i;
			}
			sumLeft = sumLeft+arr[i];
			
		}
		return -1;
	}

	public static int secondLargest(int arr[]){
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>firstMax){

				firstMax = arr[i];

			}
			if(secondMax<arr[i] && arr[i]<firstMax){
				secondMax = arr[i];
			}
		}
		return secondMax;
	}
	
	public static void triplet(int arr[], int sum){
		insertSort(arr);
		for(int i=0;i<arr.length;i++){
			sum= sum-arr[i];
			int start = i+1;
			int end = arr.length-1;
			while(end>start){
				if(arr[start]+arr[end]>sum){
					end--;
				}
				else if(arr[start]+arr[end]<sum){
					start++;
				}else{
	 				System.out.println("first: "+arr[i]+" second: "+arr[start]+" third: "+arr[end]);					
	                return;		
				}
			}
		}
	}
}
