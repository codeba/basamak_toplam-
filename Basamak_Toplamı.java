package patika;

import java.util.Scanner;

public class Basamak_Toplamı {
    public static void main(String[] args) {
        int number, basValue, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        number = sc.nextInt();
        while (number != 0) {
            basValue = number % 10;
            number = number / 10;
            sum += basValue;
        }
        System.out.println("toplam:"+sum);
    }
}
