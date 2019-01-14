package com.bridgelabz;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Add 
{
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public ModelAndView add(@RequestParam("a") int num1,@RequestParam("b") int num2)
	{   //,HttpServletRequest req , HttpServletResponse res
//		int num1 = Integer.parseInt(req.getParameter("a"));
//		int num2 = Integer.parseInt(req.getParameter("b"));
		int sum = num1 + num2;
		ModelAndView model = new ModelAndView();
		//model.setViewName("display.jsp");    //
		model.setViewName("display"); //if file is not in webapp folder and it is in web-inf folder then it is our responsibility 
										//to serch in inf folder for that in servlet configuration create method with return type 
										//InternalViewResolver and here dont give extension , only search file with display name
		model.addObject("result",sum);
		return model;
	}
}
