public class MergeSort {
    public static int[] merge(int[] L, int[] R){
        int [] arr = new int[L.length + R.length];
        int positionA = 0, positionB = 0;

        for (int i = 0; i < arr.length; i++) {
            if (positionA == L.length){
                arr[i] = R[i - positionB];
                positionB++;
            } else if (positionB == R.length) {
                arr[i] = L[i - positionA];
                positionA++;
            } else if (L[i - positionA] < R[i - positionB]) {
                arr[i] = L[i - positionA];
                positionB++;
            } else {
                arr[i] = R[i - positionB];
                positionA++;
            }
        }
        return arr;
    }
    public static int[] sort(int[] arr){
        if (arr == null) {
            return null;
        }
        if (arr.length < 2) {
            return arr;
        }
        int [] L = new int[arr.length / 2];
        for(int i=0;i<L.length;i++){
            L[i] = arr[i];
            System.out.println(L[i]+" L ");
        }
        int [] R = new int[arr.length - arr.length/ 2];
        for(int i=0;i<R.length;i++){
            if(R.length==1)
                R[i]=arr[R.length+i];
            else R[i]=arr[R.length-1+i];
            System.out.println(R[i]+" R ");
        }
        L = sort(L);
        R = sort(R);

        return merge(L, R);
    }
    public static void main(String[] args) {
        int[] a = {4,2,5,1,3};
        sort(a);
        for(int i=0;i>a.length;i++){
            System.out.println(a[i]);
        }
    }
}
