package com.example;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller 
public class DoorsController {
	
	DoorDAO doorDao = new DoorDAO();

	@GetMapping("/doors/{id}")
	public ModelAndView doorPageById(@PathVariable int id) throws ClassNotFoundException, SQLException {
		ModelAndView mav = new ModelAndView("single-door");
		
		Doors doors = doorDao.getById(id);
		mav.addObject("dr",doors);
		
		return mav;
	}
	
	@GetMapping("/doors")
	public ModelAndView getAllDoors() throws SQLException {
		ModelAndView mav = new ModelAndView("doors");
		ArrayList<Doors> door = doorDao.getAllDoors();
		mav.addObject("door", door);
		return mav;
	}
}
