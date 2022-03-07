package effactivejava.generic;

import java.util.Arrays;
import java.util.Collection;
import java.util.EmptyStackException;

/**
 * packageName : effactivejava.generic
 * fileName : Stack
 * author : ohjm
 * date : 2022/03/07 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2022/03/07 ohjm 최초 생성
 */
//제너릭 추가 에러
public class Stack3<E> {
    private Object[] elements;
    private int size = 0;
    private static final int DEAFULT_INITIAL_CAPACITY = 16;
    //에러 발생 E는 실체화 불가능한데 new 키워드
    public Stack3(){
        elements = new Object[DEAFULT_INITIAL_CAPACITY];
    }

    public void push(E e){
        ensureCapacity();
        elements[size++] = e;
    }

    public E pop(){
        if (size == 0)
            throw new EmptyStackException();
        @SuppressWarnings("unchecked")
        E result = (E) elements[--size];
        elements[size] = null; //다 쓴 참조 해제
        return  result;
    }

    public boolean isEmpty(){
        return size == 0;
    }
    private void ensureCapacity(){
        if(elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size +1);
    }

    //매개변수에 와일드카드 타입 적용하여 유연성 확장
    public void pushAll(Iterable<? extends E> src){
        for (E e : src)
            push(e);
    }

    public void popAll(Collection<? super  E> dst){
        while (!isEmpty())
            dst.add(pop());
}
}
