import java.util.Scanner;

public class main1 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double harga = 15000, konsumsi_bensin_per_Km_Liter = 0.5;
		System.out.print("jarak\t\t:");
		double jarak = input.nextDouble();
		System.out.print("kecepatan\t:");
		double kecepatan = input.nextDouble();


		System.out.println("waktu tempuh\t:"+ jarak/kecepatan + " jam");
		System.out.println("komsumsi bensin\t:"+ jarak*konsumsi_bensin_per_Km_Liter +" Liter");
		System.out.println("harga bensin\t:"+ jarak*konsumsi_bensin_per_Km_Liter*harga +" (Rp)");

		input.close();
	}
}