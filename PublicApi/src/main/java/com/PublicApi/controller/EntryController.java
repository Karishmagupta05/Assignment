package com.PublicApi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.PublicApi.dto.EntityDto;
import com.PublicApi.model.Entry;
import com.PublicApi.model.Result;

@RestController
public class EntryController {

	@Autowired
	RestTemplate restTemplate;
	
	
	@GetMapping("/entries/{category}")
	public List<EntityDto> getEntries(@PathVariable("category") String category){
		
		
		Result result=restTemplate.getForObject("https://api.publicapis.org/entries", Result.class);
		
		List<Entry> entry=result.getEntries();
		
		List<EntityDto> dto=new ArrayList<>();
		
		for(Entry e:entry) {
			
			if(e.getCategory().equals(category)) {
				
				dto.add(new EntityDto(e.getApi(),e.getCategory()));
				
				
			}
			
		}
		return dto;

		
	}
	
	@PostMapping("/entries")
	public ResponseEntity<String> saveEntries(@RequestBody Entry entry){
		
		
		Entry e1=restTemplate.getForObject("https://api.publicapis.org/entries", Entry.class);
		return null;
		
		//List<Entry> entries=e1.get
	//	return restTemplate;
		
		
	}
	
	
	
	
}









