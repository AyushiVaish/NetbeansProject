/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.io.*;

/**
 *
 * @author USER
 */
public class StudentBean implements Serializable{
    private String firstName = null;
    private String lastName = null;
    private Integer age = 0;
    public StudentBean()
    {
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public Integer getAge ()
    {
        return age;
        
    }
    public void setFirstName (String fn)
    {
        firstName=fn;
        
    }
    public void setLastName(String ln)
    {
        lastName = ln;
    }
    public void setAge(Integer a)
    {
        age = a;
    }
}
