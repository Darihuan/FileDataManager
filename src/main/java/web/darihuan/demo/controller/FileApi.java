package web.darihuan.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import web.darihuan.demo.model.FileInfo;
import web.darihuan.demo.service.FileService;
@RestController
@RequestMapping(path="/api/file")
public class FileApi {
	FileService fileservice;
	public FileApi(FileService fileservice) {
		this.fileservice=fileservice;
	}
	
	
	
	
	@PostMapping(path="/upload")
	public FileInfo upload(@RequestParam("file") MultipartFile file) {
		String name=file.getOriginalFilename();
		String type=file.getContentType();
		long size=file.getSize();
		FileInfo archivo=new FileInfo(name, type, size);
		return archivo;
		
	}

}
