package effactivejava.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * packageName : effactivejava.generic
 * fileName : Chooser
 * author : ohjm
 * date : 2022/03/07 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2022/03/07 ohjm 최초 생성
 */
public class Chooser<T> {
    private final List<T> choiceList;
//    private final Object[] choiceArray;

    public Chooser(Collection<T> choices){
        choiceList = new ArrayList<>(choices);
        //choiceArray = choices.toArray();
    }

    public T choose(){
        Random rnd = ThreadLocalRandom.current();
       // return choiceArray[rnd.nextInt(choiceArray.length)];
        return choiceList.get(rnd.nextInt(choiceList.size()));
    }
}
