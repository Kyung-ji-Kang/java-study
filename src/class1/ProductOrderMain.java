package class1;

class ProductOrder{
    String productName;
    int price;
    int quantity;

    ProductOrder(String productName, int price, int quantity){
        this.price = price;
        this.productName = productName;
        this.quantity = quantity;
    }

    void prn(){
        System.out.println("상품명 : "+this.productName+"가격 : "+this.price+"수량 : "+this.quantity);
    }
}

public class ProductOrderMain {

    public static void main(String[] args){
        ProductOrder pro1 = new ProductOrder("두부",2000,2);
        ProductOrder pro2 = new ProductOrder("김치",5000,1);
        ProductOrder pro3 = new ProductOrder("콜라",1500,2);

        ProductOrder[] orders =  {pro1, pro2, pro3};
        int sum = 0;

        for(ProductOrder order: orders){
            order.prn();
            sum += order.price*order.quantity;
        }
        System.out.println("총 결제 금액: "+sum);
    }



}
