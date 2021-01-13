package practice;
/*

[ ] 실행결과
CH:10
VOL:20
 */
class MyTv2 {
    boolean isPowerOn;
    int channel;
    int volume;
    int previewChannel;
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    /*
    (1) . 알맞은 코드를 넣어 완성하시오
    */

    public void setChannel(int channel) {
        previewChannel = this.channel;
        this.channel = channel;
    }

    public int getChannel() {
        return channel;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void gotoPrevChannel() {
        setChannel(previewChannel);
    }


}

public class Exercise7_10 {
    public static void main(String args[]) {
        MyTv2 t = new MyTv2();
        t.setChannel(10);
        System.out.println("CH:"+t.getChannel());
        t.setChannel(20);
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());

    }
}
