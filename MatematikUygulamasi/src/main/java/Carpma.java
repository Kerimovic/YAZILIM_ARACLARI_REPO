import java.util.Scanner;

public class Carpma {
	/**
	 * carpma islemi yap�lacak.
	 * @param say1 ve say2 seklinde iki sayi istenecek ve girilen iki say�y� carp�p sonucu bulacak.
	 */
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int say1,say2;
        System.out.println("1. Say�y� Giriniz: ");
        say1 = input.nextInt();
        System.out.println("2. Say�y� Giriniz: ");
        say2 = input.nextInt();
        int sonuc=say1*say2;
        System.out.println(say1 + "*" + say2 + "=" + sonuc);
        
        
    }
}
