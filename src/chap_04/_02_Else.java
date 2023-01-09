package chap_04;

public class _02_Else {
    public static void main(String[] args) {
        // 조건문 If Else
        int hour = 15;
        if (hour < 14) {
            System.out.println("아아 +1");
        }
        else {
            System.out.println("디아아 +1");
        }
        System.out.println("커피주문됨1");

        //오후 2시 이후이거나 모닝커피를 마신경우?
        hour = 15;
        boolean morning = true;
        if (hour >= 14 && morning == true)
        {
            System.out.println("디아아 +1");
        } else {
            System.out.println("걍 아아");
        }
        System.out.println("커피왔다");
    }

}
