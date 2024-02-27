/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caemployee;

/**
 *
 * @author ocean
 */
//Github Link https://github.com/OisinRyan22/CAEmployee
public class Manager extends Employee {

    private String username;
    private String password;

    public Manager(String name, String email, String username, String password) {
        super(name, email);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {           //Username getter method
        return username;
    }

    public void setUsername(String username) {          //Username setter method
        this.username = username;
    }

    public String getPassword() {           //password getter method
        return password;
    }

    public void setPassword(String password) {          //password setter method
        this.password = password;

    }
}
