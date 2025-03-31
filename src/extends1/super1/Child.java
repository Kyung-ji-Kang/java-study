package extends1.super1;

import extends1.super1.Parent;

public class Child extends Parent {

    public String value = "child";


    @Override
    public void hello(){
        System.out.println("Child.hello");
    }

    public void call(){
        System.out.println("this vlaue = "+ this.value);
        System.out.println("super vlaue = "+ super.value);

        this.hello();
        super.hello();
    }
}
