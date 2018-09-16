package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private String name;
    private String group;
    private String id;
    private String email;
    // TODO: khai báo các phương thức getter, setter cho Student
    public String getName() {
        return this.name;
    }
    public void setName(String n) {
        this.name = n;
    }
    public void setid(String n) {
        this.id = n;
    }
    public void setGroup(String n) {
        this.group = n;
    }
    public void setEmail(String n) {
        this.email = n;
    }


    /**
     * Constructor 1
     */
    Student()
    {
        name = "Student";
        id = "000";
        group = "INT22041";
        email = "uet@vnu.edu.vn";
    }
    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
        name = n;
        id = sid;
        email = em;
        group = "INT22041";
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        name = s.name;
        group = s.group;
        id = s.id;
        email = s.email;
        // TODO:
    }

    String getInfo() {

        System.out.println("Name: " + this.name + "\nId: "+ this.id +"\nGroup: "
                    +this.group + "\nEmail: "+this.email);
        return null; // xóa dòng này sau khi cài đặt
    }
}
