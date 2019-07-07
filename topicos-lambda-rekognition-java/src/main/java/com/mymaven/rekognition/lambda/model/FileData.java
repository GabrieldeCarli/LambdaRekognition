package com.mymaven.rekognition.lambda.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class FileData {

	private String bucket;
	private String name;
	private String contentType; 
  private String s3Uri;
  private Long sizeBytes;
  private String lastModified;
	
  public FileData(String bucket, String name, String contentType, String s3Uri, Long sizeBytes, String lastModified) {
		this.bucket = bucket;
    	this.name = name;
    	this.contentType = contentType;
		this.s3Uri = s3Uri;
		this.sizeBytes = sizeBytes;
		this.lastModified = lastModified;
	}

	public String getBucket() {
		return bucket;
	}

	public FileData setBucket(String bucket) {
		this.bucket = bucket;
		return this;
	}

	public String getName() {
		return name;
	}

	public FileData setName(String name) {
		this.name = name;
		return this;
	}

	public String getContentType() {
		return contentType;
	}

	public FileData setContentType(String contentType) {
		this.contentType = contentType;
		return this;
	}

	public String getS3Uri() {
		return s3Uri;
	}

	public FileData setS3Uri(String s3Uri) {
		this.s3Uri = s3Uri;
		return this;
	}

	public Long getSizeBytes() {
		return sizeBytes;
	}

	public FileData setSizeBytes(Long sizeBytes) {
		this.sizeBytes = sizeBytes;
		return this;
	}

	public String getLastModified() {
		return lastModified;
	}

	public FileData setLastModified(String lastModified) {
		this.lastModified = lastModified;
		return this;
	}
    
}
