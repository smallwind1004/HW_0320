public class Staff extends Person{
    private String unit, mission;

    public Staff(){

    }
    public Staff(String name1, String id1, String phone1, String email1, String unit1) {
        super(name1, id1, phone1, email1);
        setUnit(unit1); 
    }

    //----unit----
    public void setUnit(String newUnit) {
        this.unit = newUnit;
    }
    public String getUnit(){
        return this.unit;
    }
    //----mission----
    public void setMission(String newMission) {
        this.mission = newMission;
    }
    public String getMission(){
        return this.mission;
    }
    
    public String showInfo(){
        return "Staff : " + super.showInfo() + " , " + getUnit();
    }
}