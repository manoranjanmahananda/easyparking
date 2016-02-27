/**
 * 
 */
package com.easyparking.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.easyparking.entity.User;
import com.easyparking.service.RegisterationService;

/**
 * @author Apple
 *
 */
@Controller
@RequestMapping("/register") 
public class RegisterController {
	
	@Autowired
	public  RegisterationService registerationService;
	
	@RequestMapping(method = RequestMethod.GET)
	 public String registerUser(Map<String, Object> model) {  
		User userForm=new User();
		model.put("userForm", userForm);
       
        return "userRegisteration";
    }
	@RequestMapping(method = RequestMethod.POST)
    public String processRegistration(@ModelAttribute("userForm") User user,
            Map<String, Object> model) {
		try{
			if(user != null){
				user.setCreatedAt(new Date());
				user.setCreatedBy(user.getEmail());
				user.setUpdatedAt(new Date());
				user.setUpdatedBy(user.getEmail());
				registerationService.registerUser(user);
			}
			System.out.println("userEmail: " + user.getEmail());
			System.out.println("username: " + user.getName());
			System.out.println("Mobile: " + user.getMobileNo());
	        return "registrationSuccess";
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return "userRegisteration";
    }
}
