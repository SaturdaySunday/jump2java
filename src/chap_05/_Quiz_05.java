package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        int [] size = new int[12];{
            for (int i = 0; i < size.length; i++) {
                size[i] = 250 + (5 * i);


            }
            System.out.println(size);
            for (int sizea :
                 size) {
                System.out.println("사이즈 " + sizea + " 재고있음");
            }
            System.out.println();
        }

    }
}
