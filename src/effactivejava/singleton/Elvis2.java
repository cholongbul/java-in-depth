package effactivejava.singleton;

public class Elvis2 {
    //하나의 인스턴스만 생성 가능
    //private로 직접 접근 막음
    private static final Elvis2 INSTANCE = new Elvis2();
    //private로 생성자 생성 막음
    private Elvis2(){

    }
    //싱글턴이 아니게 전환 가능
    //제네릭 싱글턴 팩토리로 만들 수 있다.
    //정적 팩토리의 메서드참조를 공급라ㅗ 사용할 수 있다
    public static Elvis2 getInstance(){
        return INSTANCE;
    }
    public void leavTheBuilding(){

    }
    //직렬화시 싱글턴임을 보장해주는 readResolve메서드
    private Object readResolve(){
        //진짜 Elvis를 반환하고, 가짜 Elvis는 가비지 컬렉터에게 맡긴다.
        return INSTANCE;
    }
}
