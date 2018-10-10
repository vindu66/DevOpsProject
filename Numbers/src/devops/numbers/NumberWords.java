package devops.numbers;

import java.util.Scanner;

public class NumberWords {

	public int toWords( int number ) {
		System.out.println(number);
		Scanner scanner = new Scanner(System.in);
		while(number!=-1){
            if(number>=0 && number<=999){
                if(number==0){
                    System.out.print("NUMBER AFTER CONVERSION:\tZERO");
                } else {
                    System.out.print("NUMBER AFTER CONVERSION:\t");
                    numberToWord(((number / 100) % 10), " HUNDRED");
                    numberToWord((number % 100), " ");
                }

            } else{
                System.out.print("NUMBER OUT OF RANGE");
            }
            System.out.print("\nPlease type a number between 0 and 999 or -1 check for new numbers/navigate to exit ");
            number = scanner.nextInt();
        }
		return number;
		
    }

    public static void numberToWord(int num, String val) {
        String ones[] = {" ", " ONE", " TWO", " THREE", " FOUR", " FIVE", " SIX", " SEVEN", " EIGHT", " NINE", " TEN", " ELEVEN", " TWELVE", " THIRTEEN", " FOURTEEN", " FIFTEEN", " SIXTEEN", " SEVENTEEN", " EIGHTEEN", " NINETEEN"
        };
        String tens[] = {" ", " ", " TWENTY", " THIRTY", " FOURTY", " FIFTY", " SIXTY", " SEVENTY", " EIGHTY", " NINETY"};
        if (num > 19) {
            System.out.print(tens[num / 10] + " " + ones[num % 10]);
        } else {
            System.out.print(ones[num]);
        }
        if (num > 0) {
            System.out.print(val);
        }
    }

		
		
	}


