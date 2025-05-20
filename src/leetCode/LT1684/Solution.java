package leetCode.LT1684;

import ch13.sec05.Person;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int countConsistentStrings(String allowed, String[] words) {

        // allowed 에 있는 각 문자(Character) 를 저장한 Set 만들기
        // 1. set 만들고
        // 2. allowed 의 각 문자를 탐색해서
        // 3. Set 에 넣기(add)
        Set<Character> set = new HashSet<>();


        for (char c : allowed.toCharArray()) {
            set.add(c);
        }

        // words 에 있는 각 문자열을 전체 탐색해서
        // 각 문자열의 문자가 allowed 에 있는지 확인
        // 1. words 의 각 문자(word) 탐색
        //    1. word의 각 문자(character)가
        //    2. Set에 있는지 확인(contains)
        //    3. 모두 다 있으면 count 늘리기

        int count = 0;
        for (String word : words) {
            boolean isConsistent = true; // 일단 boolean 을 true 로 셋팅
            for (char c : word.toCharArray()) {  // set에 저장된 Character c 를 문자 words 탐색
                if (!set.contains(c)) { // 만약 word에 포함되지 않은 단어가 존재한다면
                    isConsistent = false; // isConsistent 를 false로 변경하고 break;
                    break;
                }
            }
            if (isConsistent) { // if 문을 빠져나와서 정상작동하면 count++
                count++;
            }
        }
        return count;
    }

}