package odev2;

public class methods {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
	

	}
	public static void sayiBulmaca() {
		int[] sayilar = new int[]{1,2,3,5,7,9,0};
		int aranacak = 1;
		
		boolean varMı = false;
		 for (int sayi : sayilar) {
			 if (sayi==aranacak) {
				 varMı = true;
				 break;
				 
			 }
			 
		 }
		 String mesaj="";
		 if(varMı) {
			 mesajVer("Sayı mevcuttur: " + aranacak);
			 mesajVer(mesaj);
		 }else {
			 System.out.println("Sayı mevcut değildir: " +aranacak);
		 }
		 
	}
	public static void mesajVer(String mesaj) {
		
		System.out.println(mesaj);
	}

}
