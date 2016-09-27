/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author LAB_TI
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAB_TI
 */
import java.io.Serializable;
public class Participant implements Serializable {
    private final String firstName;
    private final String lastName;
    private int age;

    public Participant(String firstName, String lastName,int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age=age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Participant{" + "firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + '}';
    }
    
    
    
    
    
}
