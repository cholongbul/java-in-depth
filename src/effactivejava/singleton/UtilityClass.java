package effactivejava.singleton;

public class UtilityClass {
    //정적 필드 정적 메서드만 담은 클래스 작성시 인스턴스화를 아예 틀어막고 싶을 때
    //기본 생성자가 만들어지는 것을 막는다(인스턴스화 방지용) private 상속도 불가능
    private UtilityClass(){
        throw new AssertionError();
    }
}
