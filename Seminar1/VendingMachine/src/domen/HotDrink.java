package Domen;

public class HotDrink extends Product {
    // Поля
    private float tempHotDrink;
// Свойства
    public float gettempHotDrink() {
        return tempHotDrink;
    }

    public void settempHotDrink(int tempHotDrink) {
        this.tempHotDrink = tempHotDrink;
    }
    //конструкторы
    public  HotDrink(int price, int place, String name, long id){
        super(price,place,name,id);
        this.tempHotDrink = 0f;
    }
    public HotDrink (int price, int place, String name, long id, int tempHotDrink){
        super(price,place,name,id);
        this.tempHotDrink = tempHotDrink;
    }

    @Override
    public String toString() {
        return super.toString() + "temp="+tempHotDrink ;
    }

}