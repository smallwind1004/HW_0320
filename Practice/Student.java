public class Student extends Person{
    private String dept;

    public Student(){

    }
    public Student(String name1, String id1, String phone1, String email1, String dept1) {
        super(name1, id1, phone1, email1);
        setDept(dept1); 
    }

    //----department----
    public void setDept(String newDept) {
        this.dept = newDept;
    }
    public String getDept(){
        return this.dept;
    }

    public String showInfo(){
        return "Student : " + super.showInfo() + " , " + getDept();
    }
}