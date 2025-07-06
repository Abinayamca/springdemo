package com.demo.pathdemo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.pathdemo.Model.PathModel;
import com.demo.pathdemo.Repository.PathRepo;

@Controller
public class PathController {
	
	@Autowired
	PathRepo repo;
	
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	
	@PostMapping("/submit")
	public String submit(PathModel stud)
	{
		System.out.println("Saving: " + stud.getName() + ", " + stud.getGrade());
		repo.save(stud);
		return "index";
	}
	
	/*@PostMapping("/add")
	public String add(@RequestBody PathModel stud)
	{
		repo.save(stud);
		return "Student details saved";
	}*/

	/*private List<PathModel> studentList = new ArrayList<>();

    @PostMapping
    public String addStudent(@RequestBody PathModel student) {
        studentList.add(student);
        return "Student added successfully!";
    }

    @GetMapping
    public List<PathModel> getAllStudents() {
        return studentList;
    }*/

	
}
