package chap_02;

public class quiz2 {
    public static void main(String[] args) {
        int a = 115;
        int b = 121;
        String boarding = (a >= 120) ? "키가 " + a +"cm 이므로 탑승가능합니다" : "키가 " + a + "cm 이므로 탑승 불가능합니다.";
        System.out.println(boarding);
        String boarding2 = (b >= 120) ? "키가 " + b +"cm 이므로 탑승가능합니다" : "키가 " + b + "cm 이므로 탑승 불가능합니다.";
        System.out.println(boarding2);




    }
}
