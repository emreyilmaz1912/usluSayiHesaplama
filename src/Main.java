import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Üslü Sayı Hesaplamaya Hoşgeldiniz!");
        Scanner input = new Scanner(System.in);
        int n,k,total = 1;
        System.out.print("Üssü alınacak sayıyı giriniz :");
        n = input.nextInt();
        System.out.print("Sayının üssünü giriniz :");
        k = input.nextInt();

        for (int i =1; i <= k; i++){
            total *= n;

        }
        System.out.println("Cevap :" + total);
    }
}