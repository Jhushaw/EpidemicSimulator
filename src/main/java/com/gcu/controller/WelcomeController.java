package com.gcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This controller is used to handle the initial landing page.
 * @author Jacob, Sal
 *
 */
@Controller
@RequestMapping("/")
public class WelcomeController {

	/**
	 * Handles initial landing page request.
	 * @param model
	 * @return view index
	 */
	@GetMapping("/")
	public String printWelcome(Model model) {
		model.addAttribute("welcomeMessage", "Welcome to EpidemicSimulator!");
		return "index";
	}
	
	@GetMapping("/sim")
	public String loadSim(Model model) {
		model.addAttribute("welcomeMessage", "Welcome to EpidemicSimulator!");
		return "Simulation";
	}
	

}