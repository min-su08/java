package array.ex;

import java.util.Scanner;

public class ProductStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxProduct = 10;
        String[] productNames = new String[maxProduct];
        int[] productPrices =  new int[maxProduct];
        int productcount = 0;

        while (true) {
            System.out.print("1. 상품 등록 | 2. 상품 목록 | 3. 종료\n메뉴를 선택하세요:");
            int menu = scanner.nextInt();

            if (menu == 1) {
                if (productcount >= 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                System.out.print("상품의 이름을 입력하세요:");

            }
        }
    }
}
