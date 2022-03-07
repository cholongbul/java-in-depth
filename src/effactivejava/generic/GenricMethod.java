package effactivejava.generic;

import java.util.*;
import java.util.function.UnaryOperator;

/**
 * packageName : effactivejava.generic
 * fileName : GenricMethod
 * author : ohjm
 * date : 2022/03/07 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2022/03/07 ohjm 최초 생성
 */
public class GenricMethod {
    private static UnaryOperator<Object> IDENTITY_FN = (t) -> t;

    public static <E> Set<E> union(Set<E> s1, Set<E> s2){
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

    @SuppressWarnings("unchecked")
    public static <T> UnaryOperator<T> identityFunction(){
        return (UnaryOperator<T>) IDENTITY_FN;
    }

    public static <E extends  Comparable<E>> E max(Collection<E> c){
        if (c.isEmpty())
            throw new IllegalArgumentException("컬렉션이 비어 있습니다.");
        E result = null;
        for (E e : c)
            if (result == null || e.compareTo(result) >0)
                result = Objects.requireNonNull(e);
        return result;
    }

    @SafeVarargs
    public final void dangerous(List<String>... stringLists){
        List<Integer> intList = List.of(42);
        Object[] objects = stringLists;
        objects[0] =intList; //힙 오염 발생
       String s = stringLists[0].get(0);
    }




}
