package practice;
/*
[6-21] Tv . 클래스를 주어진 로직대로 완성하시오 완성한 후에 실행해서 주어진 실행결과
와 일치하는지 확인하라.
[ ] 참고 코드를 단순히 하기 위해서 유효성검사는 로직에서 제외했다.

 */


class MyTv {
    boolean isPowerOn;
    int channel;
    int volume;
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;
    void turnOnOff() {
// (1) isPowerOn true false , false true . 의 값이 면 로 면 로 바꾼다
        if(isPowerOn) {
            isPowerOn = false;
        } else {
            isPowerOn = true;
        }
    }
    void volumeUp() {
// (2) volume MAX_VOLUME 1 . 의 값이 보다 작을 때만 값을 증가시킨다
        if(volume<MAX_VOLUME) {
            volume++;
        }
    }
    void volumeDown() {
// (3) volume MIN_VOLUME 1 . 의 값이 보다 클 때만 값을 감소시킨다
    }
    void channelUp() {
// (4) channel 1 . 의 값을 증가시킨다
// channel MAX_CHANNEL , channel MIN_CHANNEL . 만일 이 이면 의 값을 로 바꾼다
    }
    void channelDown() {
// (5) channel 1 . 의 값을 감소시킨다
// channel MIN_CHANNEL , channel MAX_CHANNEL . 만일 이 이면 의 값을 로 바꾼다
    }
} // class MyTv
public class Exercise6_21 {

    public static void main(String[] args)
    {
        MyTv t = new MyTv();
        t.channel = 100;
        t.volume = 0;
        System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
        t.channelDown();
        t.volumeDown();
        System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
        t.volume = 100;
        t.channelUp();
        t.volumeUp();
        System.out.println("CH:"+t.channel+", VOL:"+ t.volume);

    }
}
