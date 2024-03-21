package cond;

public class BiggerNum {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int max = (a > b) ? a : b;
        System.out.printf("더 큰 숫자는 %d입니다", max);
    }
}
