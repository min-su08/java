package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        //intValue = doubleValue; //커파일 오류 발생
        intValue = (int) doubleValue; //형변환
        intValue = (int) doubleValue;///형 변환
        System.out.println(intValue);

        int z = (int) 10.5;
        System.out.println(z);
        System.out.println("doubleValue = " + doubleValue);
    }
}
