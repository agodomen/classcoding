package edu.muc.homework.exception;

/**
 * File Name : classcoding - edu.muc.homework.exception
 * CopyRright (c) 1949-xxxx:
 * File Number：
 * Author：gwd
 * Date：on 5/1/17
 * Modify：gwd
 * Time ：
 * Comment：
 * Description：
 * Version：
 */
public class Employee {

    protected String firstname;
    protected String lastname;

    @Override
    public String toString() {
        return lastname + " " + firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Employee() {

    }

    public Employee(String firstname, String lastname) {

        this.firstname = firstname;
        this.lastname = lastname;
    }

    public double earnings(){
        return 0;
    }
}

