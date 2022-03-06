package effactivejava.dependencyinjection;

import java.util.ArrayList;
import java.util.List;

//정적 유틸리티를 사용하여 유연하지 않고 테스트 하기 어려운 경우
public class SpellChecker1 {
    private static final Lexicon dictionary = new Lexicon();
    private SpellChecker1(){};//객체생성 방지

    public static boolean isValid(String word){return true;};
    public static List<String> suggestions(String typo){List<String> a = new ArrayList<>();
        return a;};
}
