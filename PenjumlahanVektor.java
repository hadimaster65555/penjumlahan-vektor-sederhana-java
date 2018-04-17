package LatihanJava;

import java.util.Arrays;
import java.util.Scanner;

public class PenjumlahanVektor {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukkan ukuran vektor ke-1");
		Integer nVektor1 = sc.nextInt();
		System.out.println("Masukkan nilai vektornya");
		Double vektor1[] = new Double[nVektor1];
		for (int i = 0; i < nVektor1; i++) {
			System.out.println("Elemen ke-" + (i+1));
			vektor1[i] = sc.nextDouble();
		}
		
		System.out.println("Masukkan ukuran vektor ke-2");
		Integer nVektor2 = sc.nextInt();
		System.out.println("Masukkan nilai vektornya");
		Double vektor2[] = new Double[nVektor2];
		for (int i = 0; i < nVektor2; i++) {
			System.out.println("Elemen ke-" + (i+1));
			vektor2[i] = sc.nextDouble();
		}
		
		
		if (vektor1.length == vektor2.length) {
			Integer nHasil = vektor1.length;
			Double hasil[] = new Double[nHasil];
			for (int i = 0; i < nHasil; i++) {
				hasil[i] = vektor1[i] + vektor2[i];
			}
			System.out.println("Hasilnya adalah = " + Arrays.toString(hasil));
		} else {
			System.out.println("Ukuran vektor tidak sama");
		}
	}
}
