package HW7_2;

public class HRManagers implements Workers{
    int id;
    String fullName;
    int salary;
    public HRManagers(){}
    public HRManagers(int id, String fullName, int salary){
        this.id = id;
        this.fullName = fullName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String getWorkerData(){
        return "ID: "+id+" Fullname: "+fullName+" Salary: "+salary;
    }
    @Override
    public int getSalary(){
        return salary;
    }
}
