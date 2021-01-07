package practice;


/*
[6-2] 문제 에서 정의한 클래스에 두 개의 생성자와 를 추가해서 실행 6-1 SutdaCard info()
결과와 같은 결과를 얻도록 하시오.


[ ] 실행결과
3
1K

 */
public class Exercise6_2 {

    public static void main(String[] args) {
        SutdaCard card1 = new SutdaCard(3, false);
        SutdaCard card2 = new SutdaCard();
        System.out.println(card1.info());
        System.out.println(card2.info());
    }
}

class SutdaCard {


    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    String info() {
       if(isKwang) {
           return num + "k";

       } else {
           return num+"";
       }
    }

}
