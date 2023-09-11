public class Worker extends Person {
    private double hourlyPayRate = 0;

    public Worker(String ID, String fName, String lName, String title, int YOB, double hourlyPayRate) {
        super(ID, fName, lName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "ID='" + this.getID() + '\'' +
                ", fName='" + this.getfName() + '\'' +
                ", lName='" + this.getlName() + '\'' +
                ", title='" + this.getTitle() + '\'' +
                ", YOB=" + this.getYOB() +
                ", hourlyPayRate=" + hourlyPayRate +
                "} ";
    }

    public double calculateWeeklyPay(int hoursWorked){
        double weeklyPay = 0;
        if (hoursWorked <= 40){
            weeklyPay = hoursWorked * hourlyPayRate;
        } else {
            weeklyPay = (40 * hourlyPayRate) + (hoursWorked - 40) * (hourlyPayRate * 1.5);
        }
        return weeklyPay;
    }

    public String displayWeeklyPay(double hoursWorked){
        double weeklyPay = 0;
        double overtimePay = 0;
        double totalPay = 0;
        if (hoursWorked <= 40){
            weeklyPay = hoursWorked * hourlyPayRate;
            return "Regular pay hours:   " + hoursWorked +
                    "\nRegular pay total:   " + weeklyPay +
                    "\nTotal combined pay:  " + weeklyPay;
        } else {
            weeklyPay = 40 * hourlyPayRate;
            overtimePay = (hoursWorked - 40) * (hourlyPayRate * 1.5);
            totalPay = weeklyPay + overtimePay;
            return "Regular pay hours:   " + 40 +
                    "\nRegular pay total:   " + weeklyPay +
                    "\nOvertime pay hours:  " + (hoursWorked-40) +
                    "\nOvertime pay total:  " + overtimePay +
                    "\nTotal combined pay:  " + totalPay;
        }
    }
}
