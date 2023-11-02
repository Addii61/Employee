/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testemployeesecb;

/**
 *
 * @author Admin
 */
public class TestEmployeeSecB 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Date dob=new Date(12,11,1980);
        Date doj=new Date(22,4,2000);
        Employee e=new Employee("Ahmed Ali", "44(44)4", dob, doj);
        e.printEmpInfo();
        
        
        Employee1 e1=new Employee1("Ijaz Ahmed", "555(55)4", 12,11,1980, 22,4,2000);
        e1.printEmpInfo();
        //System.out.println(dob);
    }
    
}