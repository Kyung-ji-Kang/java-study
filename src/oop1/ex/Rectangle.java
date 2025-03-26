package oop1.ex;

public class Rectangle {
    int width; // 가로
    int height; //높이
    int are; //넓이
    int perimeter; //둘레길이
    boolean square; //정사각형 여부

    //넓이 구하는 함수
    void CalculateArea (Rectangle rec){
        this.are = rec.width * rec.height;
        System.out.println("넓이: "+this.are);
    }

    //둘레 길이 구하는 함수
    void calculatePerimeter(Rectangle rec){
        perimeter = 2*(rec.width+rec.height);
        System.out.println("둘레 길이: "+perimeter);
    }


    //정사각형 여부 판단 함수
    void isSquare(Rectangle rec){
        if (rec.width==rec.height){
            System.out.println("정사각형 여부: 정사각형임!");
        }
        else{
            System.out.println("정사각형 여부: 정사각형 아님!");
        }
    }

}
