/**
 * 
 */
package com.asm.pipeline;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author anupg
 * Oct 3, 2019 9:27:13 AM
 */
@CrossOrigin("*")
@Controller
@RequestMapping("api/v1/ethix/")
public class HelloController {
	
	@GetMapping("/getUserDetails/{username}")  // API_08
	@ResponseBody
	public String getUserDetails(@PathVariable("username") String username) {
		return "My Name is "+username;
	}

}
