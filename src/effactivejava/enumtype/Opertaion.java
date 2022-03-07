package effactivejava.enumtype;

/**
 * packageName : effactivejava.enumtype
 * fileName : Opertaion
 * author : ohjm
 * date : 2022/03/07 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2022/03/07 ohjm 최초 생성
 */
public enum Opertaion {
    PLUS, MINUS, TIMES, DIVIDE;

    public double apply(double x, double y){
        switch (this){
            case PLUS: return x + y;
            case MINUS: return x - y;
            case TIMES: return x * y;
            case DIVIDE: return x / y;
        }
        throw new AssertionError("알 수 없는 연산: " + this);
    }
}
