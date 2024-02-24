/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caemployee;

import java.util.ArrayList;

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
    
    public void addNewStaff(Employee emp) {
        staff.add(emp);
    }
    
}
