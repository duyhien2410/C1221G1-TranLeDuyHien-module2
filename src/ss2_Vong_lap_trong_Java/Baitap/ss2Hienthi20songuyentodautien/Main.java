package ss2_Vong_lap_trong_Java.Baitap.ss2Hienthi20songuyentodautien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numbers;
        int status = 1;
        int n = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n prime number: ");
        numbers = scanner.nextInt();//5

        System.out.println(numbers+" the first prime number");
        System.out.print(2+"\t");

        for ( int i = 2 ; i <=numbers ;  ) {
            for (int j = 2; j <= Math.sqrt(n); j++) {
                if (n % j == 0) {
                    status = 0;
                    break;
                }
            }
            if (status != 0) {
                System.out.print(n+"\t");
                i++;
            }
            status = 1;
            n++;
        }
    }
}
