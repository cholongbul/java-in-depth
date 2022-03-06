package effactivejava.dependencyinjection;

import java.util.ArrayList;
import java.util.List;

//싱글턴을 사용하여 유연하지 않고 테스트가 어려운 경우
public class SpellChecker2 {
    private static final Lexicon dictionary = new Lexicon();
    private SpellChecker2(){};
    public static SpellChecker2 INSTANCE = new SpellChecker2();//싱글턴 패턴

    public static boolean isValid(String word){return true;};
    public static List<String> suggestions(String typo){List<String> a = new ArrayList<>();
        return a;};
}
