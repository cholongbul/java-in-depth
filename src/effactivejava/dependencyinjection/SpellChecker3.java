package effactivejava.dependencyinjection;

import java.util.ArrayList;
import java.util.List;

//의존객체주입은 유연성과 테스트의 용이성을 높여준다.
public class SpellChecker3 {
    private  final Lexicon dictionary;
    //사전의 종류가 여럿일 수도 있고 사전을 떄어놓고 기능을 테스트 해야할 수도 있다.
    //인스턴스 생성시 생성자에 필요한 자원을 넘겨주는 방식
    public  SpellChecker3(Lexicon dictionary) {
        this.dictionary = dictionary;
    }

    public static boolean isValid(String word){return true;};
    public static List<String> suggestions(String typo){List<String> a = new ArrayList<>();
        return a;};
}
