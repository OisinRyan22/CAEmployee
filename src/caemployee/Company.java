/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caemployee;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ocean
 */
public class Company {
    private String companyName;
    private ArrayList<Employee> staff;
    
    public Company() {    //Default constructor
        this.companyName = "Business Gnomes Ltd";
        this.staff = new ArrayList<>();
    }
    
    public Company(String companyName) {    //Overloaded constructor
        this.companyName = companyName;
        this.staff = new ArrayList<>();
    }
    
    public void addNewStaff(Employee emp) {     // Method adding employee to staff array
        staff.add(emp);
    }
    
    public int getStaffNum() {      //method for number of employees in staff array
        return staff.size();
    }
    
    public void listOfEmployees(int empNumThreshold) {
        System.out.println("Employees with empNum > " + empNumThreshold + ":");
        Iterator<Employee> itr = staff.iterator();
        while (itr.hasNext()) {
            Employee emp = itr.next();
            if (emp.getEmpNum() > empNumThreshold) {
                System.out.println(emp.getName());
            }
        }
        
    }
}
