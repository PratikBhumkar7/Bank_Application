package com.controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.dao.DBApplication;
import com.dao.RegisterDao;
import com.model.Register;
import com.model.Temporary;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("saveserv1");
		String s1=request.getParameter("account_no");
		String s2=request.getParameter("firstname");
		String s3=request.getParameter("lastname");
		String s4=request.getParameter("mobile_no");
		String s5=request.getParameter("username");
		String s6=request.getParameter("password");
		System.out.println("saveserv2");
		
		Register r=new Register();
		System.out.println("saveserv3");
		r.setAccount_no(s1);
		r.setFirstname(s2);
		r.setLastname(s3);
		r.setMobile_no(s4);
		r.setUsername(s5);
		r.setPassword(s6);
		
		/*String firstname=request.getParameter("F_name");
		String lastname=request.getParameter("L_name");
		String father_name=request.getParameter("Father_name");
		String mother_name=request.getParameter("Mother_name");
		String occuption=request.getParameter("Occuption");
		String dob=request.getParameter("DOB");
		String mobile_no=request.getParameter("Mobile_no");
		String email_id=request.getParameter("Email_id");
		String amount=request.getParameter("amount");
		String gender=request.getParameter("Gender");
		String house_no=request.getParameter("House_no");
		String street=request.getParameter("Street");
		String city=request.getParameter("City");
		String pincode=(request.getParameter("Pincode"));
		String state=request.getParameter("State");
		String Adhar_no=(request.getParameter("Adhar_no"));
		String  PAN_no=(request.getParameter("PAN_no"));
		String Account_no=(request.getParameter("Account_no"));
		
		Temporary t=new Temporary();
		t.setFirstname(firstname);
		t.setLastname(lastname);
		t.setFather_name(father_name);
		t.setMother_name(mother_name);
		t.setDob(dob);
		t.setGender(gender);
		t.setMobile_no(mobile_no);
		t.setOccuption(occuption);
		t.setEmail_id(email_id);
		t.setAmount(amount);
		t.setHouse_no(house_no);
		t.setStreet(street);
		t.setCity(city);
		t.setPincode(pincode);
		t.setState(state);
		t.setAdhar_no(Adhar_no);
		t.setPan_no(PAN_no);
		t.setAccount_no(Account_no);*/
		
		
		
		System.out.println("saveserv4");
		
		RegisterDao db=new RegisterDao();
		List<Register> lst=new LinkedList<Register>();
		lst.add(r);
		/*List<Temporary> lst1=new LinkedList<Temporary>();
		lst1.add(t);*/
		System.out.println("test1");
		int i=db.saveData(lst);
		
		System.out.println("test2 i value"+i);
		if(i>0)
		{
			System.out.println("test3");
			response.sendRedirect("Login.jsp");
		}
		else{
			response.sendRedirect("ErrorPage.jsp");
		}
		System.out.println("test4");
		
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
