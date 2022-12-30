
import java.util.Scanner;

public class Proje2 {
	
	// Mesafe Hesaplama Fonksiyonu:
	
	public static float mesafe(float T) {
		return (T*3*100000000/2);
	}
	// Hiz Hesaplama Fonksiyonu:
	
	public static float Hiz(float f) {
		return (f*12/2);
	}

	public static void main(String[] args) {
		
		System.out.println("yaşınız kaç?");
		Scanner scan= new Scanner(System.in);
		int i=scan.nextInt();
		
		
		
		
		if (i<18) {
			System.out.println("size sigara satamayiz");
			
		}
	}
	
}