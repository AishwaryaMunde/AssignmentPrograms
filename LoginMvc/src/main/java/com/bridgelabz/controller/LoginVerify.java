package com.bridgelabz.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.bridgelabz.dao.UserDatabseImpl;
import com.bridgelabz.utility.Encryption;

@Controller
public class LoginVerify 
{
	/**This method verify the user whether entered user is available in database or not
	 * if not then it return you to index page only
	 * @param request is HttpServletRequest used to fetch the data entered by user on web page
	 * @param response is HttpServletResponse to give the response to client
	 * @return view object that which view file to be shown after performing operation 
	 * @throws IOException it occur when any invalid input is entered
	 */
	@RequestMapping("/login")
	public ModelAndView checkUser(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException
	{		
		// fetching entered user name & password
		String userName = request.getParameter("userName");
		String password = request.getParameter("userPass");
		String encryptPassword = Encryption.getMd5(password); //encrypted password for more security
		System.out.println(userName+" "+password);
		UserDatabseImpl user = new UserDatabseImpl();
		ModelAndView view = new ModelAndView();
		//verify user name and password is valid or not 
		if(user.userVerify(userName,encryptPassword))
		{
			HttpSession session = request.getSession();		
			session.setAttribute("userName",userName);
			view.setViewName("welcome.jsp");
		}
		else
		{
			view.setViewName("index.jsp");   //if user is not available in database it keep you on same page ie. index page
		}
		return view;		
	}
}