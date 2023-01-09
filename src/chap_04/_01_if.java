package chap_04;

public class _01_if {
    public static void main(String[] args) {
        // 조건문
        int hour = 15; // 오후 3시
        if (hour < 14) {
            System.out.println("아이스 아메리카노 +1"); // 2줄이상일때는 중괄호 쓰자
            System.out.println("설탕추가");

        }
        System.out.println("커피 나왔어요");

        // 오후 2시 이전, 모닝커피를 마시지 않은 경우?
        hour = 13;
        boolean morning = false; //커피 아직 안마심
        if (hour < 14 && !morning) {
            System.out.println("아메 +1");

        }
        hour = 15;
        morning = false;
        if (hour >=14 || morning){
            System.out.println("디아아");
        }
        System.out.println("디아아 ㅇㅇ");
    }
}
