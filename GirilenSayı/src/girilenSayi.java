import java.util.Scanner;

public class girilenSayi {

	public static void main(String[] args) {
		int k, i=1, toplam=0, sayiAdet=0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayi giriniz: ");
		k = input.nextInt();
		
		while(i<=k) {
			i++;
			if(i%3==0 && i%4==0) {
				System.out.println("Degerler:"+ i);
				
				toplam+=i;
				sayiAdet++;
			}	
		}
		double ort = toplam/sayiAdet;
		System.out.println("0'dan girilen sayýya kadar olan sayýlarýn 3'e ve 4'e bölünenlerinin Ortalamasý: " + ort);
		
		
		

	}

}
