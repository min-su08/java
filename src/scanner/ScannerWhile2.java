package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 수: ");
            int num1 = scanner.nextInt();

            System.out.print("두 번째 수: ");
            int num2 = scanner.nextInt();
            if(num1 == 0 && num2 == 0){
                System.out.println("프로그램을 종룍합니다.");
            }
            int sum = num1 + num2;
            System.out.println("두 수의 합: " + sum);
        }

    }
}
