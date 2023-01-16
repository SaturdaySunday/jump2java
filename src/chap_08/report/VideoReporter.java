package chap_08.report;

public class VideoReporter implements Reportable{

    @Override
    public void report() {
        System.out.println("30초영상함께");
    }
}
