package chap_04;

public class _04_Switchcase {
    public static void main(String[] args) {
        // 스위치 케이스
        // 1등 :전액
        // 2등 : 반액
        // 3등 : 반액


        int rank = 4;
        if (rank == 1 ) {
            System.out.println("전액 장학금");
        } else if (rank ==2 ) {
            System.out.println("반액");
        } else if (rank == 3) {
            System.out.println("반액");
        }else {
            System.out.println("없음");
        }
        System.out.println("조회끝");

        // 스위치케이스
        rank = 3;
        switch (rank) {
            case 1 :
                System.out.println("전액");
                break;
            case 2 :
            case 3 :
                System.out.println("반액");
                break;
            default:
                System.out.println("없음2");


        }
    }
}
