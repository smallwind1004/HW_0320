public class Suv extends Car{
    private String price, type;
    public Suv(){

    }
    public Suv(String name1){
        //super(name1);
        setName(name1);
    }

    // -----price-----
    public void setPrice(String newPrice) {
        this.price = newPrice;
    }
    public String getPrice() {
        return this.price;
    }

    // -----type-----
    public void setType(String newType) {
        this.type = newType;
    }
    public String getType(){
        return this.type;
    }

    public String showInfo(){
        return "Suv : " + super.showInfo();
    }
    public String showAll(){
        return "Suv : " + super.showAll() + "\n------\ngoodcapacity : " + getType() + "\n------\nprice : " + getPrice();
    }
}