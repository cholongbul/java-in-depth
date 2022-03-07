package effactivejava.generic;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.UnaryOperator;

import static effactivejava.generic.GenricMethod.identityFunction;
import static effactivejava.generic.GenricMethod.union;

/**
 * packageName : effactivejava.generic
 * fileName : Main
 * author : ohjm
 * date : 2022/03/07 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2022/03/07 ohjm 최초 생성
 */
public class Main {
    public static void main(String[] args) {
//        Set<String> guys = Set.of("톰", "딕", "해리");
//        Set<String> stooges = Set.of("래리", "모에", "컬리");
//        Set<String> aflCio = union(guys, stooges);
//        System.out.println(aflCio);

//        String[] strings = {"삼베", "대마", "나일론"};
//        UnaryOperator<String> sameString = identityFunction();
//        for (String s : strings){
//            System.out.println(sameString.apply(s));
//        }
//
//        Number[] numbers = {1,2.0,3L};
//        UnaryOperator<Number> sameNumber = identityFunction();
//        for(Number n : numbers)
//            System.out.println(sameNumber.apply(n));
//
//
//        List<String> strings1 = Arrays.asList("첫 요소");
//        List<String> strings2 = Arrays.asList("첫 요소");
//        GenricMethod genricMethod = new GenricMethod();
//        genricMethod.dangerous(strings1, strings2);

        Favorites f = new Favorites();

        f.putFavorite(String.class, "Java");
        f.putFavorite(Integer.class, 0xcafebabe);
        f.putFavorite(Class.class, Favorites.class);

        String favoriteString = f.getFavorite(String.class);
        int favoriteInteger = f.getFavorite(Integer.class);
        Class<?> favoriteClass = f.getFavorite(Class.class);
        System.out.printf("%s %x %s%n", favoriteString, favoriteInteger, favoriteClass.getName());
    }

}
