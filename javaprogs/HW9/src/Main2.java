import java.util.Stack;

public class Main2 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(4);
        stack.add(2);
        stack.add(3);
        stack.add(5);
        stack.add(8);
        stack.add(6);
        stack.add(7);
        stack.add(0);
        stack.add(9);
        System.out.println(stack.get(2));
        for(int i=0;i<stack.size();i++){
            if(i==2)
                System.out.println(stack.get(i));
        }
    }
}
