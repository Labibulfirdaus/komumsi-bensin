import java.util.Scanner;

// Menghitung Luas sekolah
public class buat_soal_sendiri {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("input panjang meter sekolah\t:");
		double panjang = input.nextDouble();
		System.out.print("input Lebar meter sekolah\t:");
		double lebar = input.nextDouble();
		double luas = panjang*lebar;
		double luas_hektar = luas/10000;

		System.out.println("luas sekolah dalam meter persegi adalah \t:"+luas);
		System.out.println("luas sekolah dalam hektar persegi adalah\t:"+luas_hektar);


		input.close();
	}
}
