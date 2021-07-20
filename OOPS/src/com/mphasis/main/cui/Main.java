package com.mphasis.main.cui;

import payroll.entities.*;

public class Main {
        public static  void  Display(Employee[] employees){
            Finance finance = new Finance();

            for(Employee employee: employees)
                finance.processSalary(employee);

        }

    public static void main(String[] args) {
	// write your code here
        HR hr=new HR();
        //Finance finance=new Finance();
        Employee[] employees= new Employee[3];
        employees[0]= hr.recruit('p');
        //finance.processSalary(employees[0]);
        employees[1]= hr.recruit('i');
         //finance.processSalary(employees[1]);
        employees[2]= hr.recruit('c');
        //finance.processSalary(employees[2]);
        //for(Employee employee: employees)
          //  finance.processSalary(employee);

       Display(employees);
        /*employees.netPay();
        employees = new Intern();
        employees.netPay();
        employees=new contract();

         */

    }
}
