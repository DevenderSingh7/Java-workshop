package payroll.entities;

public class Parmanent extends Employee {

    @Override
    public String netPay() {
        System.out.println("parmanent employee salary");

        return null;
    }
    public  void transportation(){
        System.out.println("Transportation provided");
    }


}
