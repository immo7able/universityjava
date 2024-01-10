public class StringTest {
    public static void main(String[] args) {
        String s = "Narxoz";
        System.out.println(s.charAt(2));
        System.out.println(s.length());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.contains("g"));
        System.out.println(s.indexOf('o'));
        System.out.println(s.lastIndexOf('a'));
        System.out.println(s.replace('a','o'));
        System.out.println(s.replaceFirst("a", "o"));
        System.out.println(s.concat("Sam"));
        System.out.println(s.startsWith("Na"));
        System.out.println(s.endsWith("oz"));
        s = "Almaty";
        System.out.println(s.substring(2,4));
        System.out.println(s.substring(2));
        System.out.println(s.equals("Almaty"));
        System.out.println(s.equalsIgnoreCase("almaty"));
        String a = "abc";
        String b = "abc";
        System.out.println(a.equals(b));
        System.out.println(a == b);
        String temp = "Naraxoz";
        char[] arr = temp.toCharArray();
        int count = 0;
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='a'){
                count++;
                if(count==2)
                    index=i;
            }
        }
        System.out.println(index);
        System.out.println(temp.substring(0, index)+temp.substring(index + 1));
    }
}
