package chap_04;

public class _06_Whlie {
    public static void main(String[] args) {
        // 반복문
        int distance = 25;
        int move = 0;
        while (move < distance) {
            System.out.println("헤엠침");
            System.out.println("거리" + move);
            move += 3;
        }
        System.out.println("끝");
    }
}
