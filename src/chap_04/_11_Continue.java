package chap_04;

public class _11_Continue {
    public static void main(String[] args) {

        int max = 20; // 최대 판매수량
        int sold = 0; // 현재 판매수량
        int noShow = 17; //17번 노쇼
        for (int i = 1; i < 50 ; i++) {
            System.out.println(i + "치킨옴");
            if (i == noShow) {
                System.out.println("넘겨");
                continue;

            }
            sold++;
            if (sold == max) {
                System.out.println("다팜");
                break;

            }

        }
    }
}
