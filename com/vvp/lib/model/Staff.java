package com.vvp.lib.model;

public class Staff extends User
{
    int experience;
    Staff(String nam, String brnch, int id, int experince)
    {
        super(nam, brnch, id);
        experience = experince;
    }


}