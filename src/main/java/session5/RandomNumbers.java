package session5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

//	private String function(String temp, int data)
//	{
//		return("GFG");
//	}
//	private String function(int data, String temp)
//	{
//	return("GeeksforGeeks");
//	}
//	public static void main(String[] args)
//	{
//		RandomNumbers obj = new RandomNumbers();
//		System.out.println(obj.function(4, "GFG"));
//	
//		int g = 3;
//		System.out.print(++g * 8);
//	}
//}
		
//		Random rnum = new Random();
//		int counter;
//		int[] numbers = new int[500]; // you want 500 numbers ; so size should reflect that.
//		numbers[0] = rnum.nextInt(500); // Init First number
//		System.out.println(rnum.nextInt(500));
//		int largest = numbers[10]; // Set it as largest
//
//		System.out.println("largest");
//		int smallest = numbers[50]; // Set it as smallest
//		System.out.println("numbers[10]");
//		for (counter = 1; counter < 500; counter++)
//			;
//
//	}
//
//
//public int Add(int firstOperand, int secondOperand)
//{
//	 return firstOperand + secondOperand;
//}
//
//
//
//
//public int Subtr(int firstOperand, int secondOperand)
//{
// return firstOperand - secondOperand;
//
//}
// 
//
//
//public int divide(int firstOperand, int secondOperand)
//{
//	 if(secondOperand!=0); {return firstOperand/secondOperand;}
//	 } 
//
//
//
//
//
//
//public int Multiple(int firstOperand, int secondOperand)
//{
//	 return firstOperand*secondOperand;
//}
//
//
//
//
//public int GetMax(int[] values)
//{
//int max = values[0];
//
//for (int i=0; i< values.length; i++) 
//{
//	if (values[i] < max)
//	{
//	max = values[i];
// }
//
//}
//return max;
//}
//
//}
//public class Random {
//public static void main(String[] args) {
//	for(int i=1; i<=10; i++) {
//			double x = Math.random();
//		int xNew = (int)(x*10);
//		xNew = Math.max(xNew, 4);
//		xNew = Math.min(xNew, 6);
//		System.out.println(i);
//		
//	}
//	
//}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nth smallest number:");
		
		System.out.println("please enter valueof N:");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		System.out.printf("please enter %d numbers %n",n);
		for (int i = 0; i < n; i++) {
		int current =scn.nextInt();
		if(current > largest) {
			largest = current;
		}
		if(current < smallest) {
			smallest = current;
		}
		}
		
   System.out.println("largest of N numberis : " + largest);
   System.out.println("largest of N numberis : " + smallest);
	}

}

	
	
	
	
	
	
	


//public class RandomNumbers {
	
//	public static void main(String[] args) {
//        int counter;
//        Random rnum = new Random();
//        /* Below code would generate 500 random numbers
//         * between 100 and 1000.
//         */
//        System.out.println("Random Numbers:");
//        System.out.println("***************");
//        for (counter = 0; counter <= 500; counter++) {
//           System.out.println(rnum.nextInt(500));
//        }
//        
//        int numbers [] = { 10, 500};
//        
//        int largest = numbers[0];
//        int smallest = numbers[0];
//         
//        for(int i = 1;  i<numbers.length; i++) {
//             if(numbers[i]>largest) {
//               largest = numbers[i];
//             }
//             else if(numbers[i]<smallest) {
//               smallest = numbers[i];
//             }
//             {
//      }
//       System.out.println("List of array is: " + Arrays.toString(numbers));
//       System.out.println("Largest numbers is : " +largest);
//       System.out.println("Smallest number is : " +smallest);
//    }
//}

 


