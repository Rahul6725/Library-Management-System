package com.vvp.lib.view;

import com.vvp.lib.controller.Transaction;

import java.util.Scanner;

import com.vvp.lib.model.DAO;

public class LibView
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Transaction tr = new Transaction();
        DAO.initData();
                
        while(true)
        {
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-Library Management System-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.println("1). Search Book");
            System.out.println("2). Check Balance");
            System.out.println("3). Issue Book");
            System.out.println("4). Return Book");
            System.out.println("5). Exit");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1: 
                    tr.searchBook();
                    break;
                case 2:
                    tr.checkbalance();
                    break;
                case 3:
                    tr.issueBook();
                    break;
                case 4:
                    tr.returnBook();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
            
        }
        
    }

}