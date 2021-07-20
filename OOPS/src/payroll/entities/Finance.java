package payroll.entities;

public class Finance {
    public void  processSalary(Employee employee){
        if(employee!=null)
            System.out.println( employee.netPay() );

        
    }
}
