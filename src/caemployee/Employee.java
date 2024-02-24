/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caemployee;

/**
 *
 * @author ocean
 */
public class Employee {

    private String name;
    private String email;
    private int empNum;
    private static int nextEmpNum = 1;

    public Employee() {
        this.name = "Unknown";
        this.email = "unknown@example.com";
        this.empNum = nextEmpNum++;
        //Default values in constructor
    }

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
        this.empNum = nextEmpNum++;
        //Constructor with parameters
    }

    //Accessor methods
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getEmpNum() {
        return empNum;
    }

    public void setEmail(String email) {        //Setter method
        if (email.length() > 3) {
            this.email = email;
        } else {
            System.out.println("Incorrect imput. Email must be more than 3 characters long");
        }
    }

    public static int getNextEmpNum() {
        return nextEmpNum;
    }
}
