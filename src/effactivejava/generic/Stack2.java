package effactivejava.generic;

import java.util.Arrays;
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
public class Stack2<E> {
    private E[] elements;
    private int size = 0;
    private static final int DEAFULT_INITIAL_CAPACITY = 16;
    //에러 발생 E는 실체화 불가능한데 new 키워드
    @SuppressWarnings("unchecked")
    public Stack2(){
        elements = (E[]) new Object[DEAFULT_INITIAL_CAPACITY];
    }

    public void push(E e){
        ensureCapacity();
        elements[size++] = e;
    }

    public E pop(){
        if (size == 0)
            throw new EmptyStackException();
        E result = elements[--size];
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
}
