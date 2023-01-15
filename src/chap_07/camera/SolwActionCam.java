package chap_07.camera;

public class SolwActionCam extends ActionCam {
    public SolwActionCam() {
        this.name = ("슬로우캠");
    }

    public void makeVideo() {
        System.out.println(this.name + " : " + this.lens + "슬로우비디오제작");
    }
}