package HW5_2;

public class OlympicGames {
    String city;
    int year;
    Sportsman sportsmansList[];
    public OlympicGames(){
    }
    public OlympicGames(String city, int year, Sportsman sportsmansList[]){
        this.city = city;
        this.year = year;
        this.sportsmansList = sportsmansList;
    }
}
