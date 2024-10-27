package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class Controllller {
	@Autowired
	collectrepo repo;

	
	@RequestMapping("/Collect")
	public String data() {
		return "Collect";
	}
	
	
	@PostMapping("/Collect")
    public String print(Collection coll, Model model) {
        repo.save(coll);
        
        // Pass attributes to the model
        model.addAttribute("id", coll.getId());
        model.addAttribute("name", coll.getName());
        model.addAttribute("points", coll.getPoints());
        repo.save(coll);
        return "Print";}
	
	@RequestMapping("/Collections")
	@ResponseBody
	public String rest() {
		return repo.findAll().toString();
	}
	 @PostMapping("/Collections")
	    public Collection createCollection(@RequestBody Collection coll) {
	        return repo.save(coll);  // Save the Collection entity and return it
	    }
	 @PutMapping("/Collections")
	 @ResponseBody
	 public Collection updateOrSaveCollection(@RequestBody Collection coll) {
	     return repo.save(coll);
	 }

	 @DeleteMapping("/Collections/{id}")
	 @ResponseBody
	 public void deleteCollection(@PathVariable("id") int id) {
	     
		 repo.deleteById(id);
	           
	        
	 }

	@RequestMapping("/Collections/{id}")
	@ResponseBody
	public String particularID(@PathVariable("id") int id) {
		return repo.findById(id).toString();
	}
	
	}
