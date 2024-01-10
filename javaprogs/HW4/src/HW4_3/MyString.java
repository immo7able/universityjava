package HW4_3;

public class MyString {
    String ss;
    public MyString(String s){
        ss=s;
    }
    public int compare(String s){
        if(ss.compareTo(s)>0)
            return 1;
        else if (ss.compareTo(s)<0) {
            return -1;
        }
        else return 0;
    }
    public String toUpperCase(){
        return ss.toUpperCase();

    }
    public char[] toChars(){
        return ss.toCharArray();

    }
    public String toString(){
        return "MyString{'"+ss+"'}";
    }
}
