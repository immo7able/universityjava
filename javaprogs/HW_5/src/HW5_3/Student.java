package HW5_3;

public class Student extends User{
    private double gpa;
    private String courses[] = new String[100];
    private int indexOfCourses = 0;
    public Student(){}
    public Student(int id, String login, String password, String name, String surname, double gpa){
        super(id, login, password, name, surname);
        this.gpa = gpa;
    }
    public void getData(){
        System.out.println("Student{"+id+";"+login+";"+password+";"+name+";"+surname+";"+gpa+";("+getCourses()+")}");
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public void addCourse(String course){
        courses[indexOfCourses] = course;
        indexOfCourses+=1;
    }
    public String getCourses(){
        for(int i=0;i<indexOfCourses;i++){
            return courses[i]+";";
        }
        return "";
    }
    public int getIndexOfCourses() {
        return indexOfCourses;
    }

    public void setIndexOfCourses(int indexOfCourses) {
        this.indexOfCourses = indexOfCourses;
    }
}
