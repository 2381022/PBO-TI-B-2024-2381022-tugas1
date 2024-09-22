package soal3;

import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
        String kumpulanKata;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kata kata menggunakan cara penulisan camelCase : ");
        kumpulanKata = input.next();
        char[] kataKata = kumpulanKata.toCharArray();
        int totalKata = 1;
        for (char huruf : kataKata){
            if((int)huruf >= 65 && (int)huruf <= 90){
                totalKata++;
            }
        }
        System.out.println("Jumlah kata-kata yang ada dalam kalimat adalah : " + totalKata);
    }
}
