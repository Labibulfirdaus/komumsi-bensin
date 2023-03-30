import java.util.Scanner;

public class harga_total_bensin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jarak yang ditempuh (km): ");
        double jarak = input.nextDouble();

        System.out.print("Masukkan beban yang diangkut (kg): ");
        double beban = input.nextDouble();

        System.out.print("Masukkan waktu tempuh (jam): ");
        double waktu = input.nextDouble();

        System.out.print("Masukkan harga per liter bensin: ");
        double hargaPerLiter = input.nextDouble();

        System.out.print("Masukkan jumlah liter bensin yang dibeli: ");
        double jumlahLiter = input.nextDouble();

        double hargaTotalBensin = hargaPerLiter * jumlahLiter;
        double hargaTotal = hargaTotalBensin + (jarak * beban * waktu);

        System.out.println("Harga total adalah Rp " + hargaTotal);
		input.close();
    }
	
}