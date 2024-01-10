import java.util.HashSet;

public class Main2 {
    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<>();
        hash.add(1);
        hash.add(2);
        hash.add(2);
        hash.add(1);
        hash.add(5);
        hash.add(3);
        hash.add(4);
        hash.add(5);
        int sum=0;
        for(Integer i:hash){
            sum++;
        }
        System.out.println("Уникальных "+sum);
    }
}
