package osgi.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import osgi.web.beans.UserInfo;

@Controller
@RequestMapping("/say")
public class SayHello {
	
	//private UserInfo userInfo;
	
	@RequestMapping("/hello")
	@ResponseBody
	public String sayHello() {
		
		
		return "hello_view1";
	}
	
	@RequestMapping("/hi")
	@ResponseBody
	public UserInfo sayHi() {
		
		
		return new UserInfo();		
		//return "hi";
	}


}
