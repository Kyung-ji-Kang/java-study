package static1;

public class Data2CountMain2 {

    public static void main(String[] args) {
        Counter counter = new Counter();

        Data2 data1 = new Data2("A",counter);
        System.out.println("A ocunt= "+ counter.count);

        Data2 data2 = new Data2("B",counter);
        System.out.println("B ocunt= "+ counter.count);

        Data2 data3 = new Data2("C",counter);
        System.out.println("C ocunt= "+ counter.count);
    }
}
