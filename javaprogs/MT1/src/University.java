public class University {
    String name;
    int yearEstablished;
    int numberOfFaculties;
    String city;
    String country;
    public University(){}
    public University(String name, int yearEstablished, int numberOfFaculties, String city, String country){
        this.name = name;
        this.yearEstablished = yearEstablished;
        this.numberOfFaculties = numberOfFaculties;
        this.city = city;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearEstablished() {
        return yearEstablished;
    }

    public void setYearEstablished(int yearEstablished) {
        this.yearEstablished = yearEstablished;
    }

    public int getNumberOfFaculties() {
        return numberOfFaculties;
    }

    public void setNumberOfFaculties(int numberOfFaculties) {
        this.numberOfFaculties = numberOfFaculties;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public void getData(){
        System.out.println("University{"+name+";"+yearEstablished+";"+numberOfFaculties+";"+city+";"+country+"}");
    }
}
