package chap_04;

public class _08_NestedLoop {
    public static void main(String[] args) {
        // 이중반복문
        // 별 (*) 사각형
        /*
        *****
        *****
        *****
        *****

         */
        for (int i = 0; i < 5; i++) {
           for (int j = 0; j < 5; j++) {
               System.out.print("*");

            }
            System.out.println();


        }
        System.out.println("-----------");
        // 별삼각형
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        //별오른쪽

        System.out.println("-----------");


        for (int i = 0; i < 5; i++) { //5즐동작
            for (int j = 0; j < 4 - i; j++) { // 5번동작
                System.out.print(" ");

            }
            for (int k = 0; k <= i ; k++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }
}
