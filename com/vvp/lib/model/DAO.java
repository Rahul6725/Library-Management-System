package com.vvp.lib.model;

import com.vvp.lib.model.HardMedia;

public class DAO
{
        public static Student[] student = new Student[5];
        public static HardMedia[] hardMedia = new HardMedia[10];
        public static Staff[] staff = new Staff[2];
        public static void initData()
        {
        student[0] = new Student("Rahul Ghetia", "Computer Engineering", 123, "170470107016", 5);
        student[1] = new Student("Dhrumil Gohel", "Computer Engineering", 124, "170470107018", 5);
        student[2] = new Student("Harsh Vekariya", "Computer Engineering", 125, "170470107063", 5);
        student[3] = new Student("Mahesh Kumar", "Computer Engineering", 126, "170470107080", 5);   
        hardMedia[0] = new HardMedia("A1B3", "Lokesh", "General Publication", "How to get Rich", 200, 2);
        hardMedia[1] = new HardMedia("A1B4", "Mangesh", "Private Publication", "How to get Poor", 2000, 2);
        hardMedia[2] = new HardMedia("A2B3", "Ramesh", "General Publication", "How to be Tall", 10, 2);
        hardMedia[3] = new HardMedia("A2B4", "Loksesh", "Private Publication", "How to be dwarf", 100, 2);
        hardMedia[4] = new HardMedia("A3B3", "Rakesh", "General Publication", "How to get a girlfriend", 20120, 2);
        hardMedia[5] = new HardMedia("A3B4", "Raksesh", "Private Publication", "How to get away from girlfriend", 500, 2);
        hardMedia[6] = new HardMedia("A4B3", "Rajesh", "General Publication", "How to be sanskaari", 999, 2);
        hardMedia[7] = new HardMedia("A4B4", "Jignesh", "Private Publication", "How to drink alcohol", 99, 2);
        hardMedia[8] = new HardMedia("A5B3", "Jigar", "General Publication", "How to sell drugs", 8456, 2);
        hardMedia[9] = new HardMedia("A5B4", "Ramu", "Private Publication", "How to get a job", 20045, 2);
        staff[0] = new Staff("Nayan Kumar", "Computer Engineering", 223, 4);
        staff[1] = new Staff("Pramod Kumar", "Computer Engineering", 224, 6);
        System.out.println("Data has been created.");
        }   
}










