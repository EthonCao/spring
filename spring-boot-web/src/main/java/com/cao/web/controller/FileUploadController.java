package com.cao.web.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * 上传文件
 * @author Cao
 *
 */
@RestController
public class FileUploadController {
	/**
	 * 处理文件上传
	 * @param filename
	 * @return
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	@RequestMapping(value = "fileUploadController", method =RequestMethod.POST)
	public Map<String, Object> fileUpload(MultipartFile filename) throws IllegalStateException, IOException {
		System.out.println(filename.getOriginalFilename());
		Map<String, Object> map = new HashMap<String, Object>();
		filename.transferTo(new File("e:/" + filename.getOriginalFilename()));
		map.put("msg", "success");
		return map;
		
	}
}
