package com.insurance;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.insurance.beans.Insurance;
import com.insurance.persist.DbOpreations;

public class Register  extends HttpServlet  {
	@Override
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		  doPost(req,res);
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		System.out.println("request reached");
		
	
		
		String cnum=req.getParameter("cnum");
		String ctype=req.getParameter("ctype");
		String dob=req.getParameter("dob");
		String mob=req.getParameter("mob");
		String address=req.getParameter("address");
		String name=req.getParameter("names");
		String password=req.getParameter("pass1");
		String email=req.getParameter("em");
		String city=req.getParameter("city");
		String nation=req.getParameter("nation");
		String paymentnum=req.getParameter("payment");
		
		System.out.println(cnum+" "+ctype+" "+dob+ " "+mob+" "+address+" "+name+" "+password+" "+email+" "+city+" "+nation+" "+paymentnum);
	
	
		
		Insurance in=new Insurance(cnum,ctype,dob,mob,address,name,password,email,city,nation,paymentnum); 
		PrintWriter pw=res.getWriter();
		DbOpreations dop=new DbOpreations();
		int id=dop.insert(in);
		if(id!=0) {
			pw.println("Your registration sucess ");
			pw.println("your registration id is :"+id);
		}
		else {
			pw.println("Your registration failed ");
			pw.println("register again here <br><a href='./register'>register</a>");
		}
}
}