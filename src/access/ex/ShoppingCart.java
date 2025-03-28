package access.ex;

public class ShoppingCart {


    Item[] items = new Item[5];
    private  int itemcount ;

    public void addItem(Item item)
    {
        items[itemcount++] = item;
    }

    public int Item_total_price(Item item){
        return item.getPrice() * item.getQuantity();
    }


    public void disPlayItems(){
        int sum = 0;
        System.out.println("장바구니 상품 출력");
        for(int i=0; i<2; i++){
            System.out.println("상품명: "+items[i].getName()+", 합계: "+Item_total_price(items[i]));
            sum += Item_total_price(items[i]);
        }
        System.out.println("전체 가격 합: "+sum);
    }

}
