package com.vvp.lib.controller;
import java.util.Scanner;

import com.vvp.lib.model.*;

public class Transaction
{
    int u = 0;
    Scanner sc = new Scanner(System.in);
    public void checkbalance()
    {
        int i;
        System.out.print("Enter User ID here: ");
        int userID = sc.nextInt();
        boolean flag = false;
        for(i = 0;i < DAO.student.length; i++)
        {
            if(DAO.student[i].userId == userID)
            {
                flag = true;
                break;
            }
        }
        if(flag == false)
        {
            System.out.println("Invalid User ID. Insert correct User ID.");

        }
        else
        {
            System.out.println("User Found");
            System.out.println("Student Name: " + DAO.student[i].name);
            System.out.println("Student Branch: " + DAO.student[i].branch);
            System.out.println("Student semester: " + DAO.student[i].semester);
            System.out.println("Student Enrollment Number: " + DAO.student[i].enrollmentNumber);
            System.out.println("Your Available Balance: " + DAO.student[i].userBalance);
            for(int q = 0; q < DAO.student[i].issuedBook.length; q ++)
            {
                System.out.println(DAO.student[i].issuedBook[q]);
            }

        }  
    }
    public void issueBook()
    {
        Scanner sc = new Scanner(System.in);
        int h = 0;
        int p = 0;
        int k = 0;
        System.out.print("Enter User ID here: ");
        
        int userID = sc.nextInt();
        boolean flag = false;
        boolean bookflag = false;
        for(int i = 0; i < DAO.student.length; i++)
        {
            if(DAO.student[i].userId == userID)
            {
                flag = true;
                p = i;
                break;
            }
        }
        if(flag == false)
        {
            System.out.println("Invalid User ID. Insert correct User ID.");
        }
        else
        {
            System.out.println("User Found");
            System.out.println("Which book would you like to issue:");
            System.out.print("Enter ISBN number of that book: ");
            String iSBN = sc.next();
            for(int j = 0; j < DAO.hardMedia.length; j++)
            {
                if(DAO.hardMedia[j].ISBN.equals(iSBN))
                {
                    bookflag = true;
                    h = j;
                    k = j;
                    break;
                }
            }   
            if(bookflag == false)
            {
                System.out.println("Book not found. Please enter coorect ISBN.");
            }
            else
            {
                if(DAO.hardMedia[h].bookCount == 0)
                {
                    System.out.println("All Books have been issued");
                }
                else if(DAO.student[p].userBalance == 0)
                {
                    System.out.println("Your User Balance exceeds. you cannot issue book anymore. Return some books to gain balance");
                }
                else
                {
                    DAO.hardMedia[h].bookCount--;
                    DAO.student[p].userBalance--;
                    DAO.student[p].issuedBook[u] = DAO.hardMedia[k].ISBN;
                    u ++;
                    System.out.println("Book issued successfully!");
                }

            }
        }

    }
    public void returnBook()
    {
        Scanner sc = new Scanner(System.in);
        int h = 0;
        int p = 0;
        System.out.print("Enter User ID here: ");
        
        int userID = sc.nextInt();
        boolean flag = false;
        boolean bookflag = false;
        for(int i = 0; i < DAO.student.length; i++)
        {
            if(DAO.student[i].userId == userID)
            {
                flag = true;
                p = i;
                break;
            }
        }
        if(flag == false)
        {
            System.out.println("Invalid User ID. Insert correct User ID.");
        }
        else
        {
            System.out.println("User Found");
            System.out.println("Which book would you like to return:");
            System.out.print("Enter ISBN number of that book: ");
            String iSBN = sc.next();
            for(int j = 0; j < DAO.hardMedia.length; j++)
            {
                if(DAO.hardMedia[j].ISBN.equals(iSBN))
                {
                    bookflag = true;
                    h = j;
                    break;
                }
            }   
            if(bookflag == false)
            {
                System.out.println("Book not found. Please enter coorect ISBN.");
            }
            else
            {
                    DAO.hardMedia[h].bookCount++;
                    DAO.student[p].userBalance++;
                    System.out.println("Book returned successfully!");
            }
        }
    }
    public void searchBook()
    {
        int p = 0;
        int h = 0;
        System.out.print("Enter User ID here: ");
        
        int userID = sc.nextInt();
        boolean flag = false;
        boolean bookflag = false;
        for(int i = 0; i < DAO.student.length; i++)
        {
            if(DAO.student[i].userId == userID)
            {
                flag = true;
                p = i;
                break;
            }
        }
        if(flag == false)
        {
            System.out.println("Invalid User ID. Insert correct User ID.");
        }
        else
        {
            System.out.println("User Found");
            System.out.print("Enter ISBN here: ");
            String iSBN = sc.next();
            for(int j = 0; j < DAO.hardMedia.length; j++)
            {
                if(DAO.hardMedia[j].ISBN.equals(iSBN))
                {
                    bookflag = true;
                    h = j;
                    break;
                }
            }   
            if(bookflag == false)
            {
                System.out.println("Book not found. Please enter coorect ISBN.");
            }
            else if(DAO.hardMedia[h].bookCount == 0)
            {
                System.out.println("All books have already been issued.");
            }
            else
            {
                System.out.println("Book found.");
                System.out.println("Book Title: " + DAO.hardMedia[h].title);
                System.out.println("Book Author: " + DAO.hardMedia[h].author);
                System.out.println("Book Publlication: " + DAO.hardMedia[h].publication);
                System.out.println("Book Price: " + DAO.hardMedia[h].getPrice());
                System.out.println("Total Books Issued: " + (2 - DAO.hardMedia[h].bookCount) );
                System.out.println("Books Issued to:");
                for(int q = 0; q < (DAO.student.length - 1); q ++)
                {
                    for(int u = 0; u < DAO.student[p].issuedBook.length ; u ++)
                    {
                        if(DAO.student[q].issuedBook[u] == DAO.hardMedia[h].ISBN)
                            System.out.println(DAO.student[q].name);
                    }
                }               
            }
        }    
    }
}
