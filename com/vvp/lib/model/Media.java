package com.vvp.lib.model;

public class Media
{
    public String ISBN, author, publication, title; 
    public int bookCount;
    double price;
    Media(String iSBN, String authr, String publicaton, String titel, int bokCount)
    {
        ISBN = iSBN;
        author = authr;
        publication = publicaton;
        title = titel;
        bookCount = bokCount;
    }
}