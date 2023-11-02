/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testemployeesecb;

/**
 *
 * @author Admin
 */
public class Employee1 
{
    public String empName;
    public String empID;
    public Date dob;
    public Date doj;
    public Employee1(String en, String id, int db,int mb,int yb,int dj,int mj,int yj )
    {
        this.empName=en;
        this.empID=id;
       this.dob=new Date(db,mb,yb);
       this.doj=new Date(dj,mj,yj);
    }
    public void printEmpInfo()
    {
        System.out.printf("Emp ID: %S\nEmp Name: %S\nDOB: %s\nDOJ:%s\n\n",this.empID,this.empName,this.dob,this.doj);
    }
}