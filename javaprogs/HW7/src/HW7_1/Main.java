package HW7_1;

public class Main {
    public static void main(String[] args) {
        Users[] users = {
                new Users("Will", "Smith"),
                new Users("June", "Black"),
                new Users("Jorja", "Smith"),
                new Users("Ken", "Block"),
                new Users("John", "Kick"),
                new Users("Jerry", "Back"),
                new Users("John", "Dock"),
                new Users("Dell", "Chick"),
                new Users("Lol", "Jack"),
                new Users("Min", "Meow")
        };
        UserBeanImp u = new UserBeanImp(users);
        u.getAllUsers();
        u.getUsersByName("John");
        u.getUsersBySurname("Smith");
    }
}
