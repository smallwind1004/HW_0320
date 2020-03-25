public class Car {
    private String name, color, capacity, powertype, weight, disp, year;

    public Car() {

    }
    // public Car(String name1){
    //     setName(name1);
    // }
    // -----name-----
    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    // -----color-----
    public void setColor(String newColor) {
        this.color = newColor;
    }

    public String getColor() {
        return this.color;
    }

    // -----capacity-----
    public void setCapacity(String newCapacity) {
        this.capacity = newCapacity;
    }

    public String getCapacity() {
        return this.capacity;
    }

    // -----powertype-----
    public void setPowetype(String newPowertype) {
        this.powertype = newPowertype;
    }

    public String getPowertype() {
        return this.powertype;
    }

    // -----weight-----
    public void setWeight(String newWeight) {
        this.weight = newWeight;
    }

    public String getWeight() {
        return this.weight;
    }

    // -----displacement-----
    public void setDisp(String newDisp) {
        this.disp = newDisp;
    }

    public String getDisp() {
        return this.disp;
    }

    // -----year-----
    public void setYear(String newYear) {
        this.year = newYear;
    }

    public String getYear() {
        return this.year;
    }

    public String showInfo() {
        return getName() + " (" + getYear() + ") " + getPowertype() + " , " + getWeight();
    }

    public String showAll() {
        return "name : " + getName() + "\n------\ncolor : " + getColor() + "\n------\ncapacity : " + getCapacity()
                + "\n------\npowertype : " + getPowertype() + "\n------\nweight : " + getWeight()
                + "\n------\ndisplacement : " + getDisp() + "\n------\nyear : " + getYear();
    }
}