package com.fedex.spring_fileUploadDownload;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class FileUploadExceptionAdvice extends RuntimeException {
	public FileUploadExceptionAdvice(String message) {
	        super(message);
	    }

	public FileUploadExceptionAdvice(String message, Throwable cause) {
	        super(message, cause);
	    }
}
