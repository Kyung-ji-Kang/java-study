package access.ex;

public class MaxCounter {

    private int count;
    private int max;

    public MaxCounter( int max) {
        this.max = max;
    }

    public void increment(){
        if(max<=count){
            System.out.println("최대값을 초과할 수 없습니다");
            return;
        }
        else{
            count++;
        }
    }
    public int getCount(){
        return count;
    }

}
