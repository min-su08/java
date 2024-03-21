package scanner;

import java.util.Scanner;

public class scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요 : ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 정수를 입력하세요 : ");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("두 수는 같습니다.");
        }
        else{
            System.out.println("두 수는 다릅니다.");
        }

    }
}
