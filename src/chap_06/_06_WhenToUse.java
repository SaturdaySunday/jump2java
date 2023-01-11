package chap_06;

public class _06_WhenToUse {
    public static int getPoewer(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;

        }
        return result;
    }
    public static void main(String[] args) {
        // 필요이유
//        int result = 1;
//        for (int i = 0; i < 2; i++) {
//            result *= 2;
//
//        }
        System.out.println(getPoewer(2,2));

        System.out.println(getPoewer(3,3));


        System.out.println(getPoewer(4,2));
    }
}