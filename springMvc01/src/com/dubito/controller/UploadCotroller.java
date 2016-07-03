package com.dubito.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadCotroller {

	/*
	 * 文件上传
	 */
	@RequestMapping("/upload")
	public String uploadFile(@RequestParam("file1") MultipartFile file1,HttpServletRequest request) throws Exception{
		String path = request.getServletContext().getRealPath("/");
		System.out.println(path);
		file1.transferTo(new File(path+"upload/"+file1.getOriginalFilename()));
		return "redirect:success.html";
	}
	@RequestMapping("/upload2")
	public String uploadFile2(@RequestParam("file") MultipartFile[] files,HttpServletRequest request) throws Exception{
		String path = request.getServletContext().getRealPath("/");
		System.out.println(path);
		for (MultipartFile file : files) {
			file.transferTo(new File(path+"upload/"+file.getOriginalFilename()));
		}
		return "redirect:success.html";
	}
}
