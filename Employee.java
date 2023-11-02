/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testemployeesecb;

/**
 *
 * @author Admin
 */
public class Employee 
{
    public String empName;
    public String empID;
    public Date dob;
    public Date doj;
    public Employee(String en, String id, Date db, Date dj)
    {
        this.empName=en;
        this.empID=id;
        this.dob=db;
        this.doj=dj;
    }
    public void printEmpInfo()
    {
        System.out.printf("Emp ID: %S\nEmp Name: %S\nDOB: %s\nDOJ:%s\n\n",this.empID,this.empName,this.dob,this.doj);
    }
}