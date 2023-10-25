package com.core.java.enums;
// every enum class extends object class and enum class.enum class not extends to other class  and in enum class  we need to create consturtor and method also

enum LapTop{

    Mack(2000),Surface,thinkpad(3000);
   private  int price;
    LapTop(){
        price=500;
    }
    private LapTop(int price){
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}



public class ExampleOfEnumsClass {
    public static void main(String[] args) {
        LapTop lap= LapTop.Mack;

        System.out.println(lap+""+lap.getPrice());
    }

}
