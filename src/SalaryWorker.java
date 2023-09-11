public class SalaryWorker extends Worker {
    private double annualSalary = 0;

    public SalaryWorker(String ID, String fName, String lName, String title, int YOB, double hourlyPayRate, double annualSalary) {
        super(ID, fName, lName, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public String toString() {
        return "SalaryWorker{" +
                "ID='" + this.getID() + '\'' +
                ", fName='" + this.getfName() + '\'' +
                ", lName='" + this.getlName() + '\'' +
                ", title='" + this.getTitle() + '\'' +
                ", YOB=" + this.getYOB() +
                ", hourlyPayRate=" + this.getHourlyPayRate() +
                ", annualSalary=" + annualSalary +
                "} ";
    }

    public double calculateWeeklyPay(int hoursWorked){
        return Double.parseDouble(String.format("%.2f",annualSalary/52));
    }

    public String displayWeeklyPay(double hoursWorked){
        return "Note: This is just a fraction of the annual salary" +
                "\nWeekly pay is: " + String.format("%.2f", annualSalary/52);
    }


}
