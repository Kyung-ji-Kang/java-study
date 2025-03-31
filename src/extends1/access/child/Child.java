package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call(){
        publicValue = 1;
        protectedValue = 1;
        //defaultValue = 1; 다른패키지 접근 불가
        //privateValue = 1;//접근 불가, 컴파일 오류

        publicMethod();
        protectedValueMethod();
        //defaultValueMethod();
        //privateValueMethod();
        printParent();
    }
}
