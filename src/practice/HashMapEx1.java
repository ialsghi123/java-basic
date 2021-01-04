package practice;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();


        map.put("ials", "2314");
        map.put("als", "1345");
        map.put("ialsghi", "2684");

        Scanner s = new Scanner(System.in);

        while(true) {
            System.out.println("id와 패스워드를 입력하세요");

            System.out.println("id:");
            String id = s.nextLine().trim();

            System.out.println("password:");
            String password = s.nextLine().trim();
            System.out.println();

            if(!map.containsKey(id)) {
                System.out.println("아이디를 잘못 입력하였습니다");
                continue;
            }

            else {
                if(!map.containsValue(password)) {
                    System.out.println("비밀번호를 잘못 입력하였습니다");

                } else {
                    System.out.println("아이디와 비밀번호가 일치합니다");
                    break;
                }
            }

        }


    }
}
