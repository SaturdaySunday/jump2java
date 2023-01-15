package chap_07.camera;

public class ActionCam extends Camera{
    public final String lens = "광각렌즈";
    public ActionCam() {
        super("액션캠");

    }

    public  void makeVideo() {
        System.out.println(this.name + " : " + this.lens + "비디오제작");

    }
}
