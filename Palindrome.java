package week1day2;

public class Palindrome {

	public static void main(String[] args) {
		int num1, sum = 0, temp;
	      int num = 34343;
	      int num2 = num;
	      temp = num2;
	      while (num2 > 0) {
	         num1= num2 % 10;
	         sum = (sum * 10) + num1;
	         num2 = num2 / 10;
	     }
	     if (temp == sum) {
	        System.out.println(num+ " is a palindrome number.");
	     } else {
	        System.out.println(num + " is not a palindrome number.");
	     }
	   }
	}