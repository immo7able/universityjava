package HW7_2;

public class Main {
    public static void main(String[] args) {
        Staff a = new Staff(1, "A","A",100000);
        Staff b = new Staff(2, "B","B",150000);
        Staff c = new Staff(3, "C","C",200000);
        Staff d = new Staff(4, "D","D",250000);
        Staff e = new Staff(5, "E","E",300000);
        HRManagers f = new HRManagers(6, "FF", 100000);
        HRManagers g = new HRManagers(7, "GG", 200000);
        HRManagers h = new HRManagers(8, "HH", 150000);
        HRManagers i = new HRManagers(9, "II", 160000);
        HRManagers j = new HRManagers(10, "JJ", 170000);
        Programmers k = new Programmers(11, "K", 200000, 20000, 0.5);
        Programmers l = new Programmers(12, "L", 300000, 30000, 0.6);
        Programmers m = new Programmers(13, "M", 400000, 20000, 0.7);
        Programmers n = new Programmers(14, "N", 500000, 40000, 0.8);
        Programmers o = new Programmers(15, "O", 400000, 50000, 0.7);
        Workers[] workers = {a,b,c,d,e,f,g,h,i,j,k,l,m,n,o};
        int max = 0;
        for(int p=0;p<workers.length;p++){
            if(workers[p].getSalary()>max)
            max=workers[p].getSalary();
        }
        Workers temp;
        System.out.println("Max="+max);
        for(int r=1;r<workers.length;r++){
            for(int s=1;s<workers.length;s++){
                if(workers[s].getSalary()>workers[s-1].getSalary()){
                    temp = workers[s];
                    workers[s]=workers[s-1];
                    workers[s-1]=temp;
                }
            }
        }
        for(int p=0;p<workers.length;p++){
            System.out.println(workers[p].getWorkerData());
        }
    }
}
