package org.sahil.springswagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Api("this is the only controller")
public class HelloController {

	@ApiResponse(code = 200, message = "This endpoint returns Hello")
	@RequestMapping(value = "/hello")
	public ResponseEntity<String> hello(){
		return new ResponseEntity<>("Hello", HttpStatus.OK);
	}
}
