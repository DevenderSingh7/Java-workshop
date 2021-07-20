package types;


public enum Apple {

    radish(50),golden(60),greenish(70);

    int price;
     Apple(int price){
        this.price=price;

    }
    public int getPrice(){
        return price;
    }

}
