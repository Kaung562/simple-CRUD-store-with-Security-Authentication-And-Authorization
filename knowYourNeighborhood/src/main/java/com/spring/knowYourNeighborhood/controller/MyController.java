package com.spring.knowYourNeighborhood.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.knowYourNeighborhood.Entity.Store;
import com.spring.knowYourNeighborhood.Entity.User;
import com.spring.knowYourNeighborhood.service.MyService;
import com.spring.knowYourNeighborhood.service.MyUserService;


@Controller
public class MyController {
    
	@Autowired
	MyService mySer;
	
	@Autowired
	MyUserService mservice;
	
	@GetMapping("/")
	public String home()
	{
		return "index";
	}
	//adding add code
	@GetMapping("/addStore")
	public String addStore(@ModelAttribute("storeData") Store store)
	{
		return "addStore";
	}
	//Adding Store
	@PostMapping("/saveData")
	public String savestore(@ModelAttribute("storeData") Store store) {
		System.out.println(store);
		mySer.savestore(store);
		return "redirect:/showall";
	}
	@GetMapping("/deletedata")
	public String deletedata(@RequestParam("shpid") Long shpid)
	{
		mySer.deletedata(shpid);
		return "redirect:/showall";
	}
	//showing Record from database
	@GetMapping("/showall")
	public  ModelAndView showDetail()
	{
		List<Store> storeobj = mySer.getAllData();
		System.out.println(storeobj);
		return new ModelAndView("storeDetail","storeD", storeobj); 
	}
	//To update the data
	@GetMapping("/edit/{shpid}")
	public  ModelAndView editDetail(@PathVariable("shpid") Long shpid)
	{
		Store storedata = mySer.findById(shpid);
		// Create a ModelAndView object and set the view name
        ModelAndView modelAndView = new ModelAndView("editStore");
        // Add the store data to the model
        modelAndView.addObject("shpE", storedata);
        return modelAndView; 
	}
	
	@GetMapping("/register")
	public String register(@ModelAttribute("userData") User us)
	{
		return "register";
	}
	
	@PostMapping("/saveUser")
	public String saveuser(@ModelAttribute("userData") User us) {
		System.out.println(us);
		mservice.addUser(us);
		return "redirect:/user";
	}
	
	@GetMapping("/admin")
	public String admin()
	{
		return "adminDashboard";
	}
	
	@GetMapping("/user")
	public String user()
	{
		return "userDashboard";
	}
 
}