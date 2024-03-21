package ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int total = 0;
        double average = 0 ;

        System.out.println("5개의 정수를 입력하세요: ");
        for(int i=0; i< numbers.length; i++){
            numbers[i] = scanner.nextInt();
            total += numbers[i];
        }

        System.out.print("입력한 점수의 합계: " + total);
        System.out.println();
        average  = (double) total / numbers.length;
        System.out.print("입력한 정수의 평균: " + average);
    }
}
