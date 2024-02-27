/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caemployee;

import java.util.Scanner;

/**
 *
 * @author ocean
 */
//Github Link https://github.com/OisinRyan22/CAEmployee
public class ManagerConsole {

    private static final String UserName = "Gnomeo";
    private static final String Password = "smurf";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        //importing in scanner
        String inputUsername;
        String inputPassword;

        //user prompts 
        System.out.println("Manager Only Login");
        System.out.print("Enter Username: ");
        inputUsername = sc.nextLine();
        System.out.print("Enter Password: ");
        inputPassword = sc.nextLine();

        if (inputUsername.equals(UserName) && inputPassword.equals(Password)) {
            Company company = new Company();        //Checks if correct username and password are entered

            Employee emp1 = new Employee("Joe Bloggs", "jb@gmail.com");
            Employee emp2 = new Employee("Ann Banana", "ab@gmail.com");
            Employee emp3 = new Employee("Tom Thumb", "tt@gmail.com");
            company.addNewStaff(emp1);
            company.addNewStaff(emp2);
            company.addNewStaff(emp3);
            
            
            Employee newEmp = new Employee("James Hetfield", "jh@gmail.com");
            company.addNewStaff(newEmp);
            System.out.println("New staff added: " + newEmp.getName());
            //For adding new staff members

            company.listOfEmployees(0);

            System.out.println("Employed staff members: ");
            for (Employee emp : company.getStaff()) {
                System.out.println(emp.getName());
            }
        } else {
            System.out.println("Access denied. Username or password not found");   //error message for incorrect username and/or password
        }
    }
}
