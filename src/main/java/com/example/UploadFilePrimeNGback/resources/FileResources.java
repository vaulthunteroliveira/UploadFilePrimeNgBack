package com.example.UploadFilePrimeNGback.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.UploadFilePrimeNGback.util.Disco;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/arquivos")
public class FileResources {
	
	@Autowired
	private Disco disco;
	
	@PostMapping
	public void upload(@RequestParam("file") MultipartFile[] fileList) {
		
		for (MultipartFile multipartFile : fileList) {
			disco.salvarArquivo(multipartFile);			
		}
	}

}
