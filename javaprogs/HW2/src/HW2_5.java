public class HW2_5 {
    public static int average(int[] array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum/array.length;
    }
    public static double average(double[] array){
        double sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum/array.length;
    }
    public static void main(String[] args) {
        System.out.println(average(new int[]{1,2,3,4,5}));
        System.out.println(average(new double[]{1.0, 5.0, 6.0}));
    }
}
