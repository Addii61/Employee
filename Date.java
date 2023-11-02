/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testemployeesecb;

/**
 *
 * @author Admin
 */
public class Date 
{
    private int day;
    private int month;
    private int year;
    public Date(int d, int m, int y)
    {
        this.day=d;
        this.month=m;
        this.year=y;
    }
    @Override
    public String toString()
    {
        return String.format("%02d / %02d / %04d", this.day,this.month,this.year);
        
    }
    
}