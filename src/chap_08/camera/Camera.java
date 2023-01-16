package chap_08.camera;

public abstract class Camera {
    public void  takePicture() {
        System.out.println("사진촬영");

    }
    public void recordVideo() {
        System.out.println("동영상촬영");
    }

    public abstract void showMainfeature();

}
