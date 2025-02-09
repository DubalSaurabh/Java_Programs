package testclass;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int num = 6543;
        int sumEven = 0;

        while (num > 0) {
            int digit = num % 10; 
            if (num % 3 == 0) {
                sum += digit;
            }
            num /= 10; 
        }
        System.out.println(sum);


	}

}
