
public class Main {

	public static void main(String[] args) {
	 sayiBulmaca ();
	 sayiBulmaca ();
	 sayiBulmaca ();
	 sayiBulmaca ();

	}
	public static void sayiBulmaca() {

		int [] sayilar = new int [] {1,2,5,7,9,0};
		int aranacak =5;
		boolean varMi=false;
		
		
		for (int sayi :sayilar) {
			
			
			if (sayi==aranacak) {
				
				varMi=true;
				break;
			}
		}
		
		if (varMi) {
		mesajVer (aranacak);
		
		} else {
			
			System.out.println("sayı mevcut değildir: "+aranacak);
		}

	}
	
	public static void mesajVer (int aranacak) {
		System.out.println("sayı mevcuttur: "+aranacak);
	}
}
