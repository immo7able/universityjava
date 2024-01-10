package HW5_2;

public class Main {
    public static void main(String[] args) {
        Swimmer A = new Swimmer("A", 20, "Kaz","butterfly", 20.5);
        Swimmer B = new Swimmer("B", 24, "Rus","breaststroke", 21);
        Swimmer C = new Swimmer("C", 19, "Ger","freestyle", 19);
        Footballer D = new Footballer("D", 25,"Eng", "goalkeeper","RM");
        Footballer E = new Footballer("E", 22,"Esp", "midfielder","BARCELONA");
        Footballer F = new Footballer("F", 30,"Arg", "defender","CHELSEA");
        Gymnast G = new Gymnast("G", 23,"Rus", 180, 66, "Trampoline");
        Gymnast H = new Gymnast("H", 20,"Cro", 170, 60, "Acrobatic");
        Gymnast I = new Gymnast("I", 18,"USA", 165, 55, "Artistic");
        OlympicGames Brazil = new OlympicGames("Rio", 2024, new Sportsman[] {A,B,C,D,E,F,G,H,I});
        for(int i=0;i<Brazil.sportsmansList.length;i++){
            Brazil.sportsmansList[i].play();
        }
    }
}
