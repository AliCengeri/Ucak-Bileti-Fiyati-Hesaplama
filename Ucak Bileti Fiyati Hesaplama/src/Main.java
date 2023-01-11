import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km, yas, tip;
        System.out.print("Mesafeyi giriniz: ");
        km = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();
        System.out.println("Yolculuk tipini giriniz (1=>Tek yön, 2=>Gidiş Dönüş)");
        tip = input.nextInt();
        double ucret = km * 0.1;
        if (km > 0 && yas >= 0 && (tip == 1 || tip == 2)) {
            if (yas < 12) {
                double ucret2 = ucret * 0.5;
                if (tip == 2) {
                    double ucret3 = (ucret2 * 0.8) * 2;
                    System.out.println("Toplam Tutar: " + ucret3);
                } else {
                    System.out.println("Toplam Tutar: " + ucret2);
                }
            }
            if (yas <= 24 && 12 <= yas) {
                double ucret2 = ucret * 0.9;
                if (tip == 2) {
                    double ucret3 = (ucret2 * 0.8) * 2;
                    System.out.println("Toplam Tutar: " + ucret3);
                } else {
                    System.out.println("Toplam Tutar: " + ucret2);
                }
            }
            if (yas > 64) {
                double ucret2 = ucret * 0.7;
                if (tip == 2) {
                    double ucret3 = (ucret2 * 0.8) * 2;
                    System.out.println("Toplam Tutar: " + ucret3);
                } else {
                    System.out.println("Toplam Tutar: " + ucret2);
                }
            } if (yas > 24 && yas <= 64){
                double ucret2 = (ucret * 0.8) * 2;
                if (tip == 2) {
                    System.out.println("Toplam Tutar: " + ucret2);
                } else {
                    System.out.println("Toplam Tutar: " + ucret);
                }
            }
        } else {
            System.out.println("Hatalı veri girdiniz.");
        }
    }
}