public class Person{
    private String name, id, address, phone, email;
    private char gender;

    public Person(){

    }
    public Person(String name1, String id1, String phone1, String email1) {
        setName(name1);
        setId(id1);
        setPhone(phone1);
        setEmail(email1);
    }

    //----name----
    public void setName(String newName) {
        this.name = newName;
    }
    public String getName(){
        return this.name;
    }
    //----id----
    public void setId(String newId) {
        this.id = newId;
    }
    public String getId(){
        return this.id;
    }
    //----address----
    public void setAddress(String newAddress) {
        this.address = newAddress;
    }
    public String getAddress(){
        return this.address;
    }
    //----phone----
    public void setPhone(String newPhone) {
        this.phone = newPhone;
    }
    public String getPhone(){
        return this.phone;
    }
    //----email----
    public void setEmail(String newEmail) {
        this.email = newEmail;
    }
    public String getEmail(){
        return this.email;
    }
    //----gender----
    public void setGender(char newGender) {
        this.gender = newGender;
    }
    public char getGender(){
        return this.gender;
    }
    
    public String showInfo(){
        return getName() + " ( " + getId() + " ) , " + getPhone() +" , " + getEmail();
    }
}