/*
package practice.ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Student implements Comparable {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    int total; // 총점
    int schoolRank; // 전교등수
    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        total = kor+eng+math;
    }
    int getTotal() {
        return total;
    }
    float getAverage() {
        return (int)((getTotal()/ 3f)*10+0.5)/10f;
    }
    public int compareTo(Object o) {

        if (o instanceof Student) {
            Student tmp = (Student) o;

            return tmp.total - this.total;
        } else {
            return -1;
        }
    }
    public String toString() {
        return name
                +","+ban
                +","+no
                +","+kor
                +","+eng
                +","+math
                +","+getTotal()
                +","+getAverage()
                +","+schoolRank;
    }
}

public class ch11_8 {

    public static void calculateSchoolRank(List list) {
        Collections.sort(list); // list . 먼저 를 총점기준 내림차순으로 정렬한다
        int prevRank = -1; // 이전 전교등수
        int prevTotal = -1; // 이전 총점
        int length = list.size();
        */
/*
        (2) . 아래의 로직에 맞게 코드를 작성하시오
        1. list Student . 반복문을 이용해서 에 저장된 객체를 하나씩 읽는다

        1.1 (total) (prevTotal) 총점 이 이전총점 과 같으면
        이전 등수 를 등수 로 한다 (prevRank) (schoolRank) .
        1.2 , 총점이 서로 다르면
        등수 의 값을 알맞게 계산해서 저장한다 (schoolRank) .
        이전에 동점자 였다면 그 다음 등수는 동점자의 수를 고려해야 한다 , .
        ( ) 실행결과 참고
        1.3 (prevTotal) (prevRank) 현재 총점과 등수를 이전총점 과 이전등수 에
        저장한다.
        *//*


        for (int i = 0; i < length; i++) {
            Student s = (Student) list.get(i);
        }



    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student("홍길동 ",1,1,100,100,100));
        list.add(new Student("남궁성 ",1,2,90,70,80));
        list.add(new Student("김자바 ",1,3,80,80,90));
        list.add(new Student("이자바 ",1,4,70,90,70));
        list.add(new Student("안자바 ", 1, 5, 60, 100, 80));

        calculateSchoolRank(list);
        Iterator it = list.iterator();
        while(it.hasNext())
            System.out.println(it.next());

    }
}
*/
