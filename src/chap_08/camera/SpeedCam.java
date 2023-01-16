package chap_08.camera;

public class SpeedCam extends Camera{
    @Override
    public void showMainfeature() {
        System.out.println("속도측정, 번호인식");

    }

    public void detect() {
        System.out.println("화재를 감지");

    }
    public void report() {
        System.out.println("화재신고");
    }
}
