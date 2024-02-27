/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caemployee;

/**
 *
 * @author ocean
 */
public class CAEmployee {

    /**
     * @param args the command line arguments
     */
    //Github Link https://github.com/OisinRyan22/CAEmployee
    public static void main(String[] args) {
        
        Employee emp1 = new Employee("Joe Bloggs", "jb@gmail.com");
        Employee emp2 = new Employee("Ann Banana", "ab@gmail.com");
        Employee emp3 = new Employee("Tom Thumb", "tt@gmail.com");
        //List of employee objects
        
        Employee[] projectGroup = {emp1, emp2, emp3};  //Delaring arrays
        
        System.out.println("nextEmpNum value: " + Employee.getNextEmpNum()); //output of nextEmpNum value
        
        int m = 2; // variable m for comparison
        
        //Employees with empNum > m
        System.out.println("Employees with empNum > " + m + ":");
        for (Employee emp : projectGroup) {
            if (emp.getEmpNum() > m) {
                System.out.println(emp.getName());
            }
            }
        }
    }
