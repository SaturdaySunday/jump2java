package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 조건문 ElseIf
        // 한라봉 에이드가 있으면 +1
        // 또는 망고 주가 있으면 +1
        // 또는 아아줘

        boolean halla = false;
        boolean mango = false;
        boolean orange = true;

        if(halla) {
            System.out.println("한라본 +1" );

        } else if (mango) {
            System.out.println("망고 +1");
        } else if(orange){
            System.out.println("오렌지 +1");
        }else {
            System.out.println("아아 +1");
        }
        System.out.println("음료왔다");

        //else if 는 여러번 사용가능
    }
}
