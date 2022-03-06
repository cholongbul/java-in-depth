package effactivejava.singleton;

public class Elvis1 {
    //하나의 인스턴스만 생성 가능
    //간결함, 확실함
    public static final Elvis1 INSTANCE = new Elvis1();
    //private로 생성자 생성 막음
    private Elvis1(){

    }
    public void leavTheBuilding(){

    }
    //직렬화시 싱글턴임을 보장해주는 readResolve메서드
    private Object readResolve(){
        //진짜 Elvis를 반환하고, 가짜 Elvis는 가비지 컬렉터에게 맡긴다.
        return INSTANCE;
    }
}
