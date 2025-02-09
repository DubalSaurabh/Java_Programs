package testclass;

public class sumEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int num = 7643;
        int sumEven = 0;

        while (num > 0) {
            int digit = num % 10; 
            if (digit % 2 == 0) {
                sum += digit;
            }
            num /= 10;
        }
        System.out.println(sum);
	}}
