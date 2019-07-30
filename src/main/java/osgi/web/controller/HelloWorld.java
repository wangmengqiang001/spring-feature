package osgi.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloWorld implements Controller {

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		  String userName = request.getParameter("user");
	      String result = "";
	      if (userName != null)
	      {
	        result = "Hello, " + userName + "!";
	      }

	      ModelAndView view = new ModelAndView("hello_view");
	      view.addObject("greeting", result);
	      return view;
	}

}
