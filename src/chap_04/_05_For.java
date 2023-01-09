package chap_04;

public class _05_For {
    public static void main(String[] args) {
        for ( int i = 0; i < 10; i++ ) {
            System.out.println("ㅎㅇ" + i);

        }
        for (int i = 5; i > 0; i -= 1) {
            System.out.print(i);

        }
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("합은" + sum );

        }
        System.out.println("총합은" + sum);


    }
}
