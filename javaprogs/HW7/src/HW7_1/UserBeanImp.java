package HW7_1;

public class UserBeanImp implements UserBean {
    Users[] users;
    public UserBeanImp(Users[] users){
        this.users = users;
    }
    @Override
    public void getAllUsers(){
        for(int i = 0;i<users.length;i++){
            System.out.println("User:"+users[i].name+" "+users[i].surname);
        }
    };
    @Override
    public void getUsersByName(String name){
        for(int i = 0;i<users.length;i++){
            if(users[i].name == name) System.out.println("User:"+users[i].name+" "+users[i].surname);
        }
    };
    @Override
    public void getUsersBySurname(String surname){
        for(int i = 0;i<users.length;i++){
            if(users[i].surname == surname) System.out.println("User:"+users[i].name+" "+users[i].surname);
        }
    };
}
