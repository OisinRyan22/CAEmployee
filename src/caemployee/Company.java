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
//Github Link https://github.com/OisinRyan22/CAEmployee
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
//        System.out.println("New staff member added: " + emp.getName());
    }

    public ArrayList<Employee> getStaff() {      //method for number of employees in staff array
        return staff;
    }

    public void listOfEmployees(int empNumThreshold) {      //Method for giving employee list there employee number
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
