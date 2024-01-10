import java.util.Scanner;
import java.util.TreeMap;

public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeMap <String, Integer> a = new TreeMap<String, Integer>();
        a.put("Tetrahedron", 4);
        a.put("Cube", 6);
        a.put("Octahedron", 8);
        a.put("Dodecahedron", 12);
        a.put("Icosahedron", 20);
        int n=in.nextInt(), sum=0;
        String b="";
        for(int i=0;i<n;i++){
            b=in.next();
            sum+=a.get(b);
        }
        System.out.println(sum);
    }
}
