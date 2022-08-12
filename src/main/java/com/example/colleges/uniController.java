package com.example.colleges;

import java.net.URI;
import org.springframework.beans
	.factory.annotation.Autowired;
import org.springframework.http
	.ResponseEntity;
import org.springframework.web.bind
	.annotation.GetMapping;
import org.springframework.web.bind
	.annotation.PostMapping;
import org.springframework.web.bind
	.annotation.RequestBody;
import org.springframework.web.bind
	.annotation.RequestMapping;
import org.springframework.web.bind
	.annotation.RestController;
import org.springframework.web.servlet
	.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(path = "/universities")
public class uniController {

	@Autowired
 private UniDao uniDao;
 @GetMapping(
		path = "/",
		produces = "application/json")

	public Universities getUniversities()
	{

		return uniDao
			.getAllUnis();
	}

	 
 @PostMapping(
		path = "/",
		consumes = "application/json",
		produces = "application/json")

	public ResponseEntity<Object> addUni(
		@RequestBody Uni uni)
	{

		Integer id
			= uniDao
				.getAllUnis()
				.getUniList()
				.size()
			+ 1;

		uni.setId(id);

		uniDao
			.addUni(uni);

		URI location
			= ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(
					uni.getId())
				.toUri();

		   return ResponseEntity
			.created(location)
			.build();
	}
}

