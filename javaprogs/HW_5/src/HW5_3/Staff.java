package HW5_3;

public class Staff extends User{
    private double salary;
    private String subjects[] = new String[100];
    private int indexOfSubject = 0;
    public Staff(){}
    public Staff(int id, String login, String password, String name, String surname, double salary){
        super(id, login, password, name, surname);
        this.salary = salary;
    }
    public void getData(){
        System.out.println("Staff{"+id+";"+login+";"+password+";"+name+";"+surname+";"+salary+";("+getSubjects()+")}");
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void addSubject(String subject){
        subjects[indexOfSubject] = subject;
        indexOfSubject+=1;
    }
    public String getSubjects(){
        for(int i=0;i<indexOfSubject;i++){
            return subjects[i]+";";
        }
        return "";
    }
    public int getIndexOfSubject() {
        return indexOfSubject;
    }

    public void setIndexOfSubject(int indexOfSubject) {
        this.indexOfSubject = indexOfSubject;
    }
}
