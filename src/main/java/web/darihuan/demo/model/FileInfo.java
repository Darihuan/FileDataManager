package web.darihuan.demo.model;

import lombok.Getter;
import lombok.Setter;


public class FileInfo {
	private String name ;
	private String type ;
	private long size ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public FileInfo(String name,String type,long size) {
		this.name=name;
		this.type=type;
		this.size=size;
	}

}
