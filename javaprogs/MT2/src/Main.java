public class Main{
    public static void main(String[] args) throws CloneNotSupportedException{
        Student a = new Student("Ahmad","Abuallaban", 3.9, "DE");
        Student b = a.clone();
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
class Student implements Cloneable{
    String name;
    String surname;
    double gpa;
    String faculty;

    public Student(String name, String surname, double gpa, String faculty) {
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public Student clone() throws CloneNotSupportedException{
        return (Student)super.clone();
    }
    @Override
    public String toString(){
        return "Name: "+this.name+" Surname: "+this.surname+" GPA:"+this.gpa+" Faculty:"+this.faculty;
    }
}