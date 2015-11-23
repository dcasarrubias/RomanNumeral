import java.util.Scanner;
import java.util.Arrays;
public class Lab1 {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		Lab1 lab = new Lab1(); // create instance of class Lab1
		int num1;  // variable that stores user input
		String phrase;
		
		System.out.println("Please enter String: ");
		phrase = input.nextLine();
		lab.split(phrase);
		
		System.out.println("Enter number: "); // prompts user for number
		num1 = input.nextInt();  // stores number entered by user in variable num1
		lab.RomannumeralConverter(num1); // sends number entered by user and passes it as a parameter to method RomannumeralConvertor so the number can be converted into roman numerals. 
		
		
	}
	public int howMany(int [][] arr, int val){
		return 0;
	}
	public String [] split(String str){
		String [] phrase;
		phrase = str.split(" ");
		System.out.println(Arrays.toString(phrase));
		
		return phrase; 
	}
	
	public String RomannumeralConverter(int number){
		String rNumeral = " ";
		int num = number;
		
		while (num >= 1000){
			rNumeral += "M";
			num -= 1000;
		}
		while(num >= 900){
			rNumeral += "CM";
			num -= 900;
		}
		while(num >= 500){
			rNumeral += "D";
			num -= 500;
		}
		while(num >= 400){
			rNumeral += "CD"; 
			num -= 400;
		}
		while(num >= 100){
			rNumeral += "C";
			num -= 100;
		}
		while(num >= 90){
			rNumeral += "XC";
			num -=90;
		}
		while(num >= 50){
			rNumeral += "L";
			num -=50;
		}
		while(num >= 40){
			rNumeral +="XL";
			num -= 40;
		}
		while(num >= 30){
			rNumeral += "XXX";
			num -= 30;
		}
		while(num >= 20){
			rNumeral += "XX";
			num -= 20;
		}
		while(num >= 10){
			rNumeral += "X";
			num -=10;
		}
		while(num >= 9){
			rNumeral += "IX";
			num -= 9;
		}
		while(num >= 5){
			rNumeral += "V";
			num -= 5;
		}
		while(num >= 4){
			rNumeral += "IV";
			num -= 4;
		}
		while(num >= 1){
			rNumeral += "I";
			num -= 1;
		}
		// http: //math.hws.edu/eck/cs124/javanotes3/c9/ex-9-3-answer.html
		System.out.println(rNumeral);
		return rNumeral;
	}
	
	
}
