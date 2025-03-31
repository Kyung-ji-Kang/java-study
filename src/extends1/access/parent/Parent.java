package extends1.access.parent;

public class Parent {

    public int publicValue;
    protected  int protectedValue;
    int defaultValue;
    private int privateValue;


    public void publicMethod(){
        System.out.println("Parent.publicMethod");
    }
    protected void protectedValueMethod(){
        System.out.println("Parent.protectedValueMethod");
    }
    void  defaultValueMethod(){
        System.out.println("Parent.defaultValueMethod");
    }
    private void  privateValueMethod(){
        System.out.println("Parent.privateValueMethod");
    }

    public void printParent(){
        System.out.println("===Parent 매서드 인--");
        System.out.println("publicValue = "+publicValue);
        System.out.println("protectedValue = "+protectedValue);
        System.out.println("defaultValue = "+defaultValue);
        System.out.println("privateValue = "+privateValue);

        defaultValueMethod();
        privateValueMethod();
    }
}
