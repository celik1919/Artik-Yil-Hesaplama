import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil, kalan1, kalan2, kalan3;
        Scanner mec = new Scanner(System.in);

        System.out.print("Yıl giriniz: ");
        yil = mec.nextInt();
        kalan1 = yil % 4;
        kalan2 = yil % 100;
        kalan3 = yil % 400;

        if (kalan1 == 0) {
            if (kalan2 == 0) {
                if (kalan3 == 0) {
                    System.out.println(yil + " bir artık yıldır !");
                } else {
                    System.out.println(yil + " bir artık yıl değildir !");
                }
            } else {
                System.out.println(yil + " bir artık yıldır !");
            }
        } else {
            System.out.println(yil + " bir artık yıl değildir !");
        }
    }
}