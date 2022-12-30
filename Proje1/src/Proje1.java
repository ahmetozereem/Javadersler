import java.util.Scanner;

public class Proje1 {
	
	// Mesafe Hesaplama Fonksiyonu:
	
	public static float mesafe(float T) {
		return (T*3*100000000/2);
	}
	// Hiz Hesaplama Fonksiyonu:
	
	public static float Hiz(float f) {
		return (f*12/2);
	}

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Hedefin Mesafesini Hesaplamak icin 1, ");
	System.out.println("Hedefin Hızını Hesaplamak icin 2, ");
	System.out.println("Hedefin anlık hız ve mesafe degisimini görmek için 3 ");
	System.out.println("yaziniz");
	
	int s= scan.nextInt();
	
	switch (s) {
	
	case (1):
		
	System.out.println("Radar t Parametresini giriniz: ");
	System.out.println(" t: 6 ile 0.2 arasında olmalidir ");
	
	float t= scan.nextFloat();
	
	float T= t/10000;
	
	float R= mesafe(T);
	
	if (t<=1) {
		
		System.out.println(" Hedef Mesafesi :  " + R/1000 + "  Km");
		System.out.println(".....Tehlike... Hedef Cok Yakin...");
	}
	
	else if (5>=t && t>1) {
		
		System.out.println(" Hedef Mesafesi :  " + R/1000 + "  Km");
		System.out.println(".....Hedef Yaklasıyor.....");
		
	}
	else if (6>=t && t>5) {
		
		System.out.println(" Hedef Mesafesi R:  " + R/1000 + "  Km");
		System.out.println("....Hedef Tespit Edildi....");
		
	}
	
	else {
	
		System.out.println("....Hatalı bir t degeri girdiniz....");
		
	}
	break;
	
	case (2):
	
		System.out.println("Radar f Parametresini giriniz: ");
		System.out.println(" f: 30 ile 10 KHz arasında olmalidir ");
		
		float f= scan.nextFloat();
		
		float v= Hiz(f);
		
		if (f>=10 && f<=30) {
			
			System.out.println("Hedefin Hizi: " + v*3.6 + "  Km/saat");
			
		}
		
		else {
			
			System.out.println("....Hedefin Hizi hesaplanamadi, Hatali bir f degeri girdiniz....");
			
		}
			
		break;
		
	case (3):
	
		System.out.println("Radar t Parametresini giriniz: ");
		System.out.println(" t: 6 ile 0.2 arasında olmalidir ");
		float tt= scan.nextFloat();
		
		System.out.println("Radar f parametresini giriniz: ");
		System.out.println(" f: 30 ile 10 KHz arasında olmalidir ");
		
		float ff= scan.nextFloat();
		
		if (ff>=10 && ff<=30) {
		if (tt>=0.2 && tt<=6) {	
			
		for (float i=tt; 6>=i && i>=0.2; i=(float) (i-0.2)) {
			
		//System.out.println(i);
			
		float TT= i/10000;
			
		float RR= mesafe(TT);
			
		float vv= Hiz(ff);
			
		System.out.println("Hedefin Mesafesi: " + RR + "  Km" + "  Hedefin Hizi: " + vv*3.6 + "  Km/saat");
		}
		}
		else {
			
			System.out.println("....Hedefin Hizi ve Mesafesi hesaplanamadi, Hatali bir deger girdiniz....");
			
		}
		}
		else {
			
			System.out.println("....Hedefin Hizi ve Mesafesi hesaplanamadi, Hatali bir deger girdiniz....");
			
		}
		break;
	}
	
	
	
}

}