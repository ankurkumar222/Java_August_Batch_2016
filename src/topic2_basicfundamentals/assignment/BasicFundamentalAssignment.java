package Lect_2_BasicFundamentals.Assignment;

public class BasicFundamentalAssignment {

	public static int decimalToBinary(int decimalNumber){
		int arr[] = new int[32];
		int index =0;
		while(decimalNumber>0){
			int reminder = decimalNumber%2;
			decimalNumber = decimalNumber/2;
			arr[index++] = reminder;
		}
		index = index-1;
		int binaryNumber = 0;
		while(index>=0){
			binaryNumber = binaryNumber*10+arr[index--];
		}
		return binaryNumber;
	}

	public static int binaryToDecimal(int binaryNumber){
		int digit = 0;
		double decimalNumber = 0;
		while(binaryNumber>0){
			double reminder = binaryNumber%10;
			decimalNumber = decimalNumber+Math.pow(2.0, digit++)*reminder;
			binaryNumber = binaryNumber/10;
		}
		return (int)decimalNumber;
	}

	//uptoDecimal
	public static double squareRootToDecimalDigits(int number, int decimalDigit){
		double sqRoot = 1;
		int currentDecimalPlaces =0;
		double increment = 1;
		while(currentDecimalPlaces<decimalDigit){
			while(sqRoot*sqRoot<=number){
				sqRoot = sqRoot+increment;
			}
			sqRoot = sqRoot-increment;
			increment = increment*.1;
			currentDecimalPlaces++;
		}
		return sqRoot;
	}
	
	public static int squareRootIntegralPart(int num){
		int sqRoot = 1;

		int increment = 1;
		while(sqRoot*sqRoot<=num){

			sqRoot=sqRoot+increment;

		}
		sqRoot = sqRoot-increment;
		return sqRoot;


	}
	public static void main(String[] args) {
		System.out.println(squareRootToDecimalDigits(17,4));
	}
}
