package chap_06;

public class _Quiz_06 {
    public static String gethiddenData(String data , int index){
        String hiddenData = data.substring(0,index);
        for (int i = 0; i < data.length() - index; i++) {
            hiddenData += "*";

        }
        return hiddenData;
    }
    public static void main(String[] args) {
        String name = "사람사람";
        String id = "990130-1234567";
        String phone = "010-1234-5678";

        System.out.println("이름 : " + gethiddenData(name, 1));
        System.out.println("주민 : " + gethiddenData(id, 8));
        System.out.println("전화 : " + gethiddenData(phone, 9));



//            System.out.println(s.replace(" and", ",")); // 엔드를 콤마로
//            System.out.println(s.substring(7)); //인덱스 기준 7부터 시작
        }


    }
