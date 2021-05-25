package web.darihuan.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import web.darihuan.demo.model.FileInfo;
@Service
public class FileService {
	private String folder = "C:/Users/dmesa/desktop";
	
	public FileInfo upload(MultipartFile file) {
		String name=file.getName();
		String type=file.getContentType();
		Long size=file.getSize();
		FileInfo archivo=new FileInfo(name, type, size);
		
		return archivo ;
		
	}

}
