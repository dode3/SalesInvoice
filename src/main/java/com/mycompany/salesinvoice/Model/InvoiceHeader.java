/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesinvoice.Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Kholoud
 */
public class InvoiceHeader {
private int invNum;
private String customerName;
private Date invDate;
private ArrayList<InvoiceLine> Invoices;  

    public InvoiceHeader(int invNum, String CustName, Date invDate) {
        this.invNum = invNum;
        this.customerName = CustName;
        this.invDate = invDate;
        //this.Invoices = new ArrayList<>(); //eager loading
    }

    public Date getInvDate() {
        return invDate;
    }

    public void setInvDate(Date invDate) {
        this.invDate = invDate;
    }

    public int getInvNum() {
        return invNum;
    }

    public void setInvNum(int invNum) {
        this.invNum = invNum;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String CustomerName) {
        this.customerName = CustomerName;
    }
@Override
public String toString ()
{
return ","+"Invoice header {"+"invNum"+invNum+",customer name="+customerName+",invDate="+invDate;
}

    public ArrayList<InvoiceLine> getInvoices() {
        if(Invoices == null)
           {Invoices = new ArrayList<>();}
        return Invoices;
    }

    public void setInvoices(ArrayList<InvoiceLine> Invoices) {
        this.Invoices = Invoices;
    }

    public double getInvTotal() {
double total = 0.0;
        for (InvoiceLine line : getInvoices()) {
            total += line.getLineTotal();
        }

        return total;   //ne7seb el total = nedrab number of things * price
    }
public void addInvLine(InvoiceLine line) {
        getInvoices().add(line);   //handeef el total value fe el array list
    }




    
}
