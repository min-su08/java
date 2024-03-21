package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[][] grades = new int[4][3];
        String[] subjects = {"국어", "영어", "수학"};
        Scanner scanner = new Scanner(System.in);

        for (int row = 0; row < 4; row++) {
            System.out.println((row+1) + "번 학생의 성적을 입력하세요");
            for (int column = 0; column < 3; column++) {
                System.out.print(subjects[column] + "점수:");
                grades[row][column] = scanner.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += grades[i][j];
            }
            double average = (double) total / 3;
            System.out.println((i + 1) + "번 학생의 총점: " + total + ", 평균: " + average);
        }
    }
}
