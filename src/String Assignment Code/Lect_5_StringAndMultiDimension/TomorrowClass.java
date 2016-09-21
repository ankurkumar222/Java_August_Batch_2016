package Lect_5_StringAndMultiDimension;

public class TomorrowClass {

	
	public static int factorialI(int num){
		int fact = 1;
		for(int i=num;i>0;i--){
			fact = fact*i;
		}
		return fact;
	}
	
	public static int factorialR(int num){
		if(num==0){
			return 1;
		}
		return  num*factorialR(num-1);
	}
	
	public static int firstIndexSeven(int[] arr, int start){
		if(start==arr.length){
			return -1;
		}
		if(arr[start]==7){
			return 0;
		}
		int index = firstIndexSeven(arr, start+1);
		if(index!=-1){
			return index+1;
		}else{
			return -1;
		}
	}
	
	public static int lastIndexSevenWithoutCopying(int[] arr, int start){
		if(start==arr.length){
			return -1;
		}
		int smallIndex = lastIndexSevenWithoutCopying(arr, start+1);
		if(smallIndex!=-1){
			return smallIndex+1;
		}else{
			if(arr[0]==7){
				return 0;
			}else{
				return -1;
			}
		}
		
	}
	
	public static int lastIndexSeven(int[] arr){
		if(arr.length==0){
			return -1;
		}
		int[] newArray = new int[arr.length-1];
		for(int i=1;i<arr.length;i++){
			newArray[i-1] = arr[i];
		}
		int index = lastIndexSeven(newArray);
		
		if(index!=-1){
			return index+1;
		}else{
			if(arr[0]==7){
				return 0;
			}else{
				return -1;
			}
		}
		
	}
	
	public static int firstIndexSeven(int[] arr){
		if(arr.length==0){
			return -1;
		}
		if(arr[0]==7){
			return 0;
		}
		int[] newArray = new int[arr.length-1];
		for(int i=1;i<arr.length;i++){
			newArray[i-1] = arr[i];
		}
		int index = firstIndexSeven(newArray);
		if(index!=-1){
			return index;
		}else{
			return -1;
		}
	}
	
	public static boolean arrayContainsSeven(int[] arr){
		if(arr.length==0){
			return false;
		}
		
		if(arr[0]==7){
			return true;
		}
		int[] newArray = new int[arr.length-1];
		for(int i =1;i<arr.length;i++){
			newArray[i-1] = arr[i];
		}
		return arrayContainsSeven(newArray);
	}
	
	public static boolean isArraySorted(int[] arr){
		if(arr.length==0){
			return true;
		}
		
		if(arr[0]>arr[1]){
			return false;
		}
		
		int[] newArray = new int[arr.length-1];
		for(int i=1;i<arr.length;i++){
			newArray[i-1] = arr[i];
		}
		return isArraySorted(newArray);
	}
	
	public static int fibo(int num){
		if(num==0){
			return 0;
		}
		if(num==1){
			return 1;
		}
		
		return fibo(num-1)+fibo(num-2);
	}
	
	public static void main(String[] args) {
		int result = factorialR(5);
		System.out.println(result);

	}

}
