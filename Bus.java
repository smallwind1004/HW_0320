public class Bus extends Car{
    private String peopleNum, doorNum, company;
    public Bus(){

    }
    public Bus(String name1){
        //super(name1);
        setName(name1);
    }

    // -----peopleNum-----
    public void setPeopleNum(String newPeopleNum) {
        this.peopleNum = newPeopleNum;
    }

    public String getPeopleNum() {
        return this.peopleNum;
    }

    // -----doorNum-----
    public void setDoorNum(String newDoorNum) {
        this.doorNum = newDoorNum;
    }

    public String getDoorNum() {
        return this.doorNum;
    }

    // -----company-----
    public void setCompany(String newCompany) {
        this.company = newCompany;
    }

    public String getCompany() {
        return this.company;
    }

    public String showInfo(){
        return "Bus : " + super.showInfo();
    }
    public String showAll(){
        return "Bus : " + super.showAll() + "\n------\ngoodcapacity : " + getPeopleNum() + "\n------\ndoor : " + getDoorNum() + "\n------\ncompany : " + getCompany();
    }
}