package chap_03;

public class quiz {
    public static void main(String[] args) {
        String num =  "901231-1234567";
        num = "030708-4567890";
        System.out.println(num.subSequence(0,8));
        System.out.println(num.substring(0,num.indexOf("-") + 2));
    }


}
