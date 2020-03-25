public class Truck extends Car{
    private String gcapacity, tairsNum;
    public Truck(){

    }
    public Truck(String name1){
        //super(name1);
        setName(name1);
    }

    // -----goodcapacity-----
    public void setGcapacity(String newGcapacity) {
        this.gcapacity = newGcapacity;
    }

    public String getGcapacity() {
        return this.gcapacity;
    }

    // -----TairsNum-----
    public void setTairsNum(String newTairsNum) {
        this.tairsNum = newTairsNum;
    }

    public String getTairsNum() {
        return this.tairsNum;
    }

    public String showInfo(){
        return "Truck : " + super.showInfo();
    }
    public String showAll(){
        return "Truck : " + super.showAll() + "\n------\ngoodcapacity : " + getGcapacity() + "\n------\ntairs : " + getTairsNum();
    }
}