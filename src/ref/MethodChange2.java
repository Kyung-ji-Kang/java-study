package ref;

public class MethodChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value); //10
        changeReference(dataA); //dataA의 참조값을 넘겨줌
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value); //20
    }

    static void changeReference(Data dataX) {
        dataX.value = 20; // 인스턴스 dataX가 참조하는 값을 변경
    }
}
