package com.ust.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Springexample2Controller {
	
	@Autowired
	EmpService empservice;
	@RequestMapping("/")
	public String index() {
		return "index.html";
	}
	@GetMapping("/home")
	public String viewHomePage(Model model) {
		model.addAttribute("listEmployees",empservice.getEmployees());
		return "home";
		
	}
	@GetMapping("newempform")
	public String showEmployeeForm(Model model) {
		Emp employee= new Emp();
		model.addAttribute("employee",employee);
		return "newempform";
		
	}
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("employee") Emp employee ) {
		empservice.saveEmployee(employee);
		return "redirect:/";
		
		
	}
	@GetMapping("/showFormForUpdate/{id}")
	
	public String showUpdateForm(@PathVariable (value="id") long id, Model model) {
		Emp employee = empservice.getEmployeeById(id);
		model.addAttribute("employee",employee);
		return "update";
	} 
@GetMapping("/deleteEmployee/{id}")
	
	public String deleteForm(@PathVariable (value="id") long id) {
		Emp employee = empservice.getEmployeeById(id);
		this.empservice.deleteEmployeeById(id);
		return "redirect:/";
	}
	

}
