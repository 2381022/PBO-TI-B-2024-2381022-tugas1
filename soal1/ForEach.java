package soal1;

import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
        int inputAngka;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka yang anda inginkan : ");
        inputAngka = input.nextInt();
        int[] kumpulanAngka = new int[inputAngka];
        for (int i = 0; i < inputAngka; i++ ){
            System.out.print("Masukkan angka ke- " + (i + 1) + " : ");
            kumpulanAngka[i] = input.nextInt();
        }
        int Total = 0;
        for (int jumlah : kumpulanAngka){
            Total += jumlah;
        }
        System.out.println("Jumlah dari ke " + inputAngka + " angka adalah " + Total);
    }
}
