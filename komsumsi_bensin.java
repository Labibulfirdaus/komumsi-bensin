import java.util.Scanner;

public class komsumsi_bensin {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int bensin = 100;
		System.out.println("bensin sekarang :"+bensin + " %");
		System.out.print("jarak (km): ");
		int jarak = input.nextInt();
		if (jarak >= 1 && jarak <= 20){
			int konsumsi = bensin/100*jarak;
			System.out.println("komsumsi bensin  : "+ konsumsi + " %");
			int bensin_tersisa = bensin - jarak;
			System.out.println("bensin yang tersisa : "+ bensin_tersisa + " %");
		}else if (jarak >= 21 && jarak <= 50){
			int konsumsi = bensin/100*jarak;
			System.out.println("komumsi bensin : "+ konsumsi + " %"); 
			int bensin_tersisa = bensin - jarak;
			System.out.println("bensin yang tersisa : "+ bensin_tersisa + " %");
		}
		else if (jarak >= 51 && jarak <= 100){
			int konsumsi = bensin/100*jarak;
			System.out.println("komumsi bensin : "+ konsumsi + " %"); 
			int bensin_tersisa = bensin - jarak;
			System.out.println("bensin yang tersisa : "+ bensin_tersisa + " %");
		}
		input.close();
	}
}
