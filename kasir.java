import java.util.Scanner;

public class kasir{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("masukkan harga barang\t: ");
		double harga_Barang = input.nextDouble();

		System.out.print("masukkan jumlah barang\t: ");
		double jumlah_Barang = input.nextDouble();

		System.out.print("masukkan total diskon\t: ");
		double diskon = input.nextDouble();

		double total_sebelum_diskon = harga_Barang*jumlah_Barang;

		double potongan = diskon/100 * total_sebelum_diskon;

		double total_setelah_diskon = total_sebelum_diskon- potongan;

		System.out.println("total harga sebelum diskon\t:"+ total_sebelum_diskon);
		System.out.println("potongan harga\t\t\t:"+ potongan);
		System.out.println("total harga setelah diskon\t:"+total_setelah_diskon);
		input.close();
	}
}