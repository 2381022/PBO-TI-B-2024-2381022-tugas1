package soal3;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        String kumpulanKata;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kata kata menggunakan cara penulisan camelCase : ");
        kumpulanKata = input.next();
        char[] kataKata = kumpulanKata.toCharArray();
        int Total = 1;
        for (char huruf : kataKata){
            if((int)huruf >= 65 && (int)huruf <= 90){
                Total++;
            }
        }
        System.out.println("Jumlah kata-kata yang ada dalam kalimat adalah : " + Total);

    }
}
