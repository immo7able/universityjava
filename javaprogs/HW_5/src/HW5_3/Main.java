package HW5_3;

public class Main {
    public static void main(String[] args) {
        User A = new User(1, "A", "A", "A", "A");
        User B = new User(2, "B", "B", "B", "B");
        User C = new User(3, "C", "C", "C", "C");
        User D = new User(4, "D", "D", "D", "D");
        User E = new User(5, "E", "E", "E", "E");
        Student F = new Student(6, "F", "F", "F", "F", 3.5);
        Student G = new Student(7, "G", "G", "G", "G", 3.0);
        Student H = new Student(8, "H", "H", "H", "H", 3.3);
        Student I = new Student(9, "I", "I", "I", "I", 3.1);
        Student J = new Student(10, "J", "J", "J", "J", 3.2);
        Staff K = new Staff(11, "K", "K", "K", "K", 300000);
        Staff L = new Staff(12, "L", "L", "L", "L", 400000);
        Staff M = new Staff(13, "M", "M", "M", "M", 500000);
        Staff N = new Staff(14, "N", "N", "N", "N", 600000);
        Staff O = new Staff(15, "O", "O", "O", "O", 700000);
        User[] users = {A,B,C,D,E,F,G,H,I,J,K,L,M,N,O};
        O.addSubject("Math");
        J.addCourse("Math");
        for(int i=0;i<users.length;i++){
            users[i].getData();
        }
    }
}
