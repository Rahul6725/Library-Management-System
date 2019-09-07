package com.vvp.lib.model;

import com.vvp.lib.model.User;

public class HardMedia extends Media
{
    private double price;
    HardMedia(String iSBN, String authr, String publicaton, String titel, double priec, int bokCount)
    {
        super(iSBN, authr, publicaton, titel, bokCount);
        setPrice(priec);
    }
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}