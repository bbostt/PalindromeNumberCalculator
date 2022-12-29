import java.util.Scanner;
public class Ders6_PalindromSayiOrnegi {
	
	static boolean isPalindrome(int number) {
		int temp = number, reverseNumber = 0, lastNumber;
		while(temp != 0) {
			lastNumber = temp % 10;
			reverseNumber = (reverseNumber * 10) + lastNumber;
			temp = temp / 10;
		}
		
		if(number == reverseNumber) {
			
			System.out.println(number+(" Palindromdur !"));
			return true;
			
		}
		else {
			System.out.println(number+(" Palindrom değildir !"));
			return false;
		}
	}

	public static void main(String[] args) {
		int girilenSayi;
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen sayi giriniz : ");
		girilenSayi = input.nextInt();
		System.out.println(isPalindrome(girilenSayi));
		
		// 166 girdik örnek olarak
		// lastNumber = 6
		// reverseNumber = 6
		// temp = 16
		//---------//
		// lastNumber = 6
		// reverseNumber 66
		// temp = 1
		//---------//
		// lastNumber = 1
		// reverseNumber = 661
		// temp = 0
		//---------//
		// 166 == 661 eşit değil
		// false döner.

	}

}
