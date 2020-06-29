package com.newer.mg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dept")
public class DeptController {
	
	@Autowired
	DeptRepository deptRepository;
	
	@PostMapping
	public Dept create(@RequestBody Dept dept) {
		return deptRepository.save(dept);
	}

}
