package com.vvp.lib.model;


public class Student extends User
{
    public String enrollmentNumber;
    public int semester;
    public int userBalance = 5;
    public String[] issuedBook = new String[5];
    Student(String nam, String brnch, int id, String enrollmentNo, int semstr)
    {
        super(nam, brnch, id);
        enrollmentNumber = enrollmentNo;
        semester = semstr;
        
    }
    
}