package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int hour = 10;
        boolean sc = true;
        boolean dp = true;

        int fee = hour * 4000;
        if (fee > 30000) {
            fee = 30000;
        }

        if (sc || dp) {
            fee /= 2;

        }
        System.out.println("요금은" + fee + "원 입니다.");


    }

    }
