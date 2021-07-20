package payroll.entities;

public class HR {
    public Employee recruit(char empType){
        if(empType =='I' || empType == 'i')
            return new Intern();
        else if(empType == 'P' || empType =='p')
            return new Parmanent();
        else if(empType=='C' || empType =='c')
            return new contract();

        return null;
    }
}
