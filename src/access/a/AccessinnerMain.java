package access.a;

public class AccessinnerMain {


    public static void main(String[] args) {
        AccessData data = new AccessData();

        //public 제어자
        data.publicField = 1;
        data.publicMethod();


        //default 제어자
        data.defaultField = 2;
        data.defaultMethod();

        //private 제어자
        //data.privateField = 3;
        //data.privateMethod();

        data.innerAccess();
    }

}
