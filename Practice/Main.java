public class Main {

    public static void main(String[] args) {
        Student stud1 = new Student();
        Student stud2 = new Student("Sean", "108021004", "0987654321", "108021004@live.asia.edu.tw", "CSIE");
        System.out.println(stud1.showInfo());
        System.out.println("----------");
        System.out.println(stud2.showInfo());
        System.out.println("==========");
        Professor professor1 = new Professor();
        Professor professor2 = new Professor("Jack", "123456", "23323456", "jacjxxx@asia.edu.tw", "kkk");
        System.out.println(professor1.showInfo());
        System.out.println("----------");
        System.out.println(professor2.showInfo());
        System.out.println("==========");
        Staff staff1 = new Staff();
        Staff staff2 = new Staff("Smallwind", "9527", "23323456-001", "staffxxx@asia.edu.tw", "yyyyy");
        System.out.println(staff1.showInfo());
        System.out.println("----------");
        System.out.println(staff2.showInfo());
        System.out.println("==========");
    }
}