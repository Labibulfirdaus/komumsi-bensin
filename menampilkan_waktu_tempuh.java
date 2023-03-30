import java.util.Scanner;
public class menampilkan_waktu_tempuh{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int jarak,kecepatan,waktu;
		System.out.print("masukkan jarak yang di tempuh(km) : ");
		jarak = input.nextInt();
		System.out.print("masukkan kecepatan yang di  (km)  : ");
		kecepatan = input.nextInt();

		waktu = jarak/kecepatan;
		System.out.println("waktu yang di tempuh adalah       : "+ waktu + " jam");
		input.close();
	}
}