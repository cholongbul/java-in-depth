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
//제너릭이 필요한 스택
public class Stack1 {
    private Object[] elements;
    private int size = 0;
    private static final int DEAFULT_INITIAL_CAPACITY = 16;

    public Stack1(){
        elements = new Object[DEAFULT_INITIAL_CAPACITY];
    }

    public void push(Object e){
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop(){
        if (size == 0)
            throw new EmptyStackException();
        Object result = elements[--size];
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
