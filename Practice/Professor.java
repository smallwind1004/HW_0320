public class Professor extends Person{
    private String research, roomNo, degree;

    public Professor(){

    }
    public Professor(String name1, String id1, String phone1, String email1, String roomNo1) {
        super(name1, id1, phone1, email1);
        setRoomNo(roomNo1); 
    }

    //----research----
    public void setResearch(String newResearch) {
        this.research = newResearch;
    }
    public String getResearch(){
        return this.research;
    }
    //----roomNo----
    public void setRoomNo(String newRoomNo) {
        this.roomNo = newRoomNo;
    }
    public String getRoomNo(){
        return this.roomNo;
    }
    //----degree----
    public void setDegree(String newDegree) {
        this.degree = newDegree;
    }
    public String getDegree(){
        return this.degree;
    }
    
    public String showInfo(){
        return "Professor : " + super.showInfo()+ " , " + getRoomNo();
    }
}