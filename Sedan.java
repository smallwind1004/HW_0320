public class Sedan extends Car{
    private String peopleNum, type, use;
    public Sedan(){

    }
    public Sedan(String name1){
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

    // -----type-----
    public void setType(String newType) {
        this.type = newType;
    }

    public String getType() {
        return this.type;
    }

    // -----use-----
    public void setUse(String newUse) {
        this.use = newUse;
    }

    public String getUse() {
        return this.use;
    }

    public String showInfo(){
        return "Sedan : " + super.showInfo();
    }
    public String showAll(){
        return "Sedan : " + super.showAll() + "\n------\ngoodcapacity : " + getPeopleNum() + "\n------\ndoor : " + getType() + "\n------\nuse : " + getUse();
    }
}