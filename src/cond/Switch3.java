package cond;

public class Switch3 {
    public static void main(String[] args) {
        //틀린 Switch문

        int grade = 2;

        int coupon;
        switch(grade){
            case  1:
                coupon = 1000;

            case 2:
                coupon = 2000;

            case 3:
                coupon = 3000;

            default:
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
