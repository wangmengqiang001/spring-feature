package osgi.web.controller;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import osgi.web.beans.UserInfo;

@Controller
@RequestMapping("/say")
public class SayHello {
	
	@Autowired
	@Qualifier("operator")
	private UserInfo user;
	
	@Autowired
	private UserInfo userinfo;
	
	@Inject
	@Named(value="operator")
	private UserInfo namedOperator;


	@RequestMapping("/")
	public ModelAndView helloWorld(@RequestParam(value="user",required=false,defaultValue="") String userName){
		  
	      String result = "";
	      if (userName != null)
	      {
	    	  if(!"".equals(userName)) {
	    		  result = "Hello, " + userName + "!";
	    	  }
	    	  else {
	    		  result ="Hello, userInfo:" + userinfo;
	    	  }
	      }else {
	    	  result ="Hello, user:" + userinfo; 
	      }

	      ModelAndView view = new ModelAndView("hello_view");
	      view.addObject("greeting", result);
	      return view;
	}
	
	@RequestMapping("/hello")
	@ResponseBody
	public String sayHello() {
		
		
		return "hello_view1";
	}
	
	@RequestMapping("/hi")
	@ResponseBody
	public UserInfo sayHi() {
		
		
		return user;		
		//return "hi";
	}
	
	@RequestMapping("/hinamed")
	@ResponseBody
	public UserInfo sayNamed() {
		
		
		return namedOperator;		
		//return "hi";
	}


}
