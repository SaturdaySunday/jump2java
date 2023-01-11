package chap_06;

public class _03_Return {
    // 호텔 전화번호
    public static String getPhoneNumber() {
        String phoneNumber = "02-1234-5678";
        return phoneNumber;
    }
    // 호텔 주소
    public static String getAddress() {
        return "서울";
    }
    // 호텔 액티비티
    public static String getActivities() {
        return "볼링, 탁구, 노래";
    }
    public static void main(String[] args) {
       String contactNumber = getPhoneNumber();
        System.out.println("전화번호 : " + contactNumber);

        String address = getAddress();
        System.out.println("주소 : " + address);
        System.out.println("액티 : " + getActivities());

    }
}
