import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args){
        Worker worker1 = new Worker("000001", "Simon", "Manzler", "Mr.", 2002, 35);
        Worker worker2 = new Worker("000002", "Ellen", "Jackson", "Mrs.", 1947, 18);
        Worker worker3 = new Worker("000003", "Henry", "Kirkland", "Mr.", 1997, 26);

        SalaryWorker worker4 = new SalaryWorker("000004", "Kaitlyn", "Quiambao", "Ms.", 2002, 0, 120000);
        SalaryWorker worker5 = new SalaryWorker("000005", "Luke", "Callaway", "Mr.", 1969, 0, 65000);
        SalaryWorker worker6 = new SalaryWorker("000006", "Steve", "Orlando", "Mr.", 1982, 0, 280000);

        ArrayList<Worker> workerList = new ArrayList<>();

        workerList.add(worker1);
        workerList.add(worker2);
        workerList.add(worker3);
        workerList.add(worker4);
        workerList.add(worker5);
        workerList.add(worker6);

        for (Worker worker : workerList) {
            System.out.println(worker.formalName() + "'s weekly pay statements are ");
            System.out.println("Week 1: " + worker.calculateWeeklyPay(40));
            System.out.println("Week 2: " + worker.calculateWeeklyPay(50));
            System.out.println("Week 3: " + worker.calculateWeeklyPay(40) + "\n");
        }




    }


}
