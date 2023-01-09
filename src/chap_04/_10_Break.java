package chap_04;

public class _10_Break {
    public static void main(String[] args) {
        // 치킨집에서 20마리만 판매
        int max = 20;

        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님 치킨왔다");
            if (i == max) {
                System.out.println("다팜");
                break;

            }
        }
        System.out.println("문을닫는다");
    }
}