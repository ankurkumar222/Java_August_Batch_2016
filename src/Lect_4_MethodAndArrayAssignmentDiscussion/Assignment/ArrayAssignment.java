package Lect_4_MethodAndArrayAssignmentDiscussion.Assignment;

import java.util.Scanner;

public class ArrayAssignment {
	
	public static int largest(int arr[]){

		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max = arr[i];
			}			
		}
		return max;
	}
	// insertion Sort
	public static void insertSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
	}

	// intersection
	public static void intersection(int[] arr1, int[] arr2) {
		for (int i : arr1) {
			for (int j : arr2) {
				if (i == j) {
					System.out.println(i);
					break;
				}
			}
		}
	}

	// second largest element

	public static int secondLargestElement(int[] arr) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= first) {
				second = first;
				first = arr[i];
			} else if (arr[i] < first && arr[i] > second) {
				second = arr[i];
			}
		}
		return second;
	}
	

	// sort 0,1,2
	public static void sortArrayZeroOneTwo(int[] arr) {
		int nextZero = 0;
		int nextTwo = arr.length - 1;
		int i = 0;
		while (i < nextTwo) {
			if (arr[i] == 0) {
				int temp = arr[nextZero];
				arr[nextZero] = arr[i];
				arr[i] = temp;
				nextZero++;
			} else if (arr[i] == 2) {
				int temp = arr[nextTwo];
				arr[nextTwo] = arr[i];
				arr[i] = temp;
				nextTwo--;
			}
			i++;
		}
	}

	public static void findingPair(int arr[], int sum) {
		int start = 0;
		int end = arr.length - 1;
		insertSort(arr);
		while (end > start) {
			int tempSum = arr[start] + arr[end];
			if (tempSum > sum) {
				end--;
			} else if (tempSum < sum) {
				start++;
			} else {
				System.out.println("First: " + start + "second: " + end);
				start++;
				end--;
			}
		}
	}

	// sum of array
	public static int[] sumOfArray(int[] arr1, int[] arr2) {
		int length = arr1.length > arr2.length ? arr1.length : arr2.length;
		length++;
		int[] result = new int[length];

		int i = arr1.length - 1;
		int j = arr2.length - 1;
		int k = result.length - 1;
		int carry = 0;
		int sum = 0;
		while (i >= 0 && j >= 0) {
			sum = arr1[i] + arr2[j] + carry;
			carry = sum / 10;
			result[k] = sum % 10;
			k--;
			i--;
			j--;
		}
		while (i >= 0) {
			sum = arr1[i] + carry;
			carry = sum / 10;
			result[k] = sum % 10;
			k--;
			i--;
		}
		while (j >= 0) {
			sum = arr2[j] + carry;
			carry = sum / 10;
			result[k] = sum % 10;
			k--;
			j--;
		}
		result[k] = carry;
		return result;
	}

	// 0 & 1
	public static void sumOfZeroOne(int[] arr) {
		int nextZero = 0;
		int i = 0;
		while (i < arr.length) {
			if (arr[i] == 0) {
				int temp = arr[i];
				arr[i] = arr[nextZero];
				arr[nextZero] = temp;
				nextZero++;
			}
			i++;
		}
	}

	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		int arr1[] = { 9, 9, 9 };
		int arr2[] = { 1, 2, 3 };
		int arr[] = sumOfArray(arr1, arr2);
		for (int i : arr) {
			System.out.println(i);
		}
	}

	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

	public static void fun(){
		String str = "ABCDEFG";
		for(int i =0;i<str.length();i++){
			if(str.charAt(i)==str.charAt(i+1)){
				
			}
			
		}
		
	}


	public static double squareRootInteger(int number, int decimalDigits) {
		int currentDecimalDigit = 0;
		double result = 0;
		double increment = 1;
		while (currentDecimalDigit < decimalDigits) {
			while (result * result < number) {
				result = result + increment;
			}
			result = result - increment;
			increment = increment * .1;
			currentDecimalDigit++;
		}
		return result;
	}

	public static int squareRootInteger(int number) {
		int result = 1;
		int increment = 1;
		while (result * result <= number) {
			result = result + increment;
		}
		result = result - increment;
		return result;
	}

	public static boolean checkDecInc() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of numbers in sequence ");
		int n = s.nextInt();
		int prev = Integer.MAX_VALUE;
		int current;
		int i = 1;
		boolean isDec = true;
		while (i <= n) {
			current = s.nextInt();
			if (isDec && current > prev) {
				isDec = false;
			}
			if (!isDec && current < prev) {
				return false;
			}
			i++;
			prev = current;
		}
		return true;
	}

	public static void swapInArray(int[] arr, int pos1, int pos2) {
		int temp = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = temp;
	}

	public static void sortZeroOne(int[] arr) {

		int nextZero = 0;
		int i = 0;
		while (i < arr.length) {
			if (arr[i] == 0) {
				swapInArray(arr, i, nextZero);

				nextZero++;
			}
			i++;
		}
	}
	public static void sort0_1(int[] arr){

		int start = 0;
		int end = arr.length-1;
		while(end>start){
			if(arr[start]==0){
				start++;
			}else if(arr[end] == 1){
				end--;
			}else{
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		}

	}
	public static void findPair(int[] arr, int sum) {
		int start = 0;
		int end = arr.length - 1;
		while (end > start) {
			int currentSum = arr[start] + arr[end];
			if (currentSum > sum) {
				end--;
			} else if (currentSum < sum) {
				start++;
			} else {
				System.out.println("Start " + start + "End " + end);

				while (arr[start] + arr[end] == sum) {
					end--;
				}
			}
		}
	}

	public static int binarySearch(int[] arr, int element) {
		int start = 0;
		int end = arr.length - 1;
		while (end > start) {
			int mid = (start + end) / 2;

			if (arr[mid] > element) {
				end = mid - 1;
			} else if (arr[mid] < element) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;

	}

	// equalibrium index
	public static int equalibriumIndex(int[] arr) {
		int sumRight = 0;
		int sumLeft = 0;
		for (int i : arr) {
			sumRight = sumRight + i;
		}
		for (int i = 0; i < arr.length; i++) {
			sumRight = sumRight - arr[i];
			if (sumLeft == sumRight) {
				return i;
			}
			sumLeft = sumLeft + arr[i];
		}
		return -1;
	}

	public static void decimalToBinary(int number) {
		int arr[] = new int[32];
		int index = 0;
		while (number > 0) {
			int reminder = number % 2;
			number = number / 2;
			arr[index++] = reminder;
		}
		index = index - 1;
		for (int i = index; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

	public static void insertInArray(int[] arr, int pos, int element) {

		if (pos >= arr.length) {
			return;
		}

		for (int i = arr.length - 2; i >= pos; i--) {
			arr[i + 1] = arr[i];
		}
		arr[pos] = element;

	}

	// delete from array
	// ------- > do it yourself
	public static boolean deleteFromArray(int[] arr, int pos){
		if(pos>=arr.length){
			return false;
		}

		for(int i = pos;i<arr.length;i++){
			arr[i] = arr[i+1];
		}

		arr[arr.length-1] = -1;
		return true;
	}

	public static double squareRoorUpToDecimalPlaces(int num, int decimalPlaces) {
		double result = 1;
		int currentDecimalPlace = 0;
		double increment = 1;
		while (currentDecimalPlace <= decimalPlaces) {

			while (result * result <= num) {
				result = result + increment;
			}
			result = result - increment;
			increment = increment * 0.1;
			currentDecimalPlace++;
		}
		return result;
	}

	public static int squareRoorInteralPart(int num) {
		int result = 1;

		while (result * result <= num) {
			result++;
		}

		return result - 1;
	}

}
