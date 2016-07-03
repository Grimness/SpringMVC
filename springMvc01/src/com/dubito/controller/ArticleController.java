package com.dubito.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dubito.model.Article;

@Controller
@RequestMapping("/article")
public class ArticleController {

	@RequestMapping("/list")
	public String helloWorld(Model model){
		return "article/list";
	}
	
	@RequestMapping("/details/{id}")
	public ModelAndView details(@PathVariable("id") int id){
		ModelAndView view = new ModelAndView();
		if(id == 1){
			view.addObject("article", new Article("文章一", "文章一的内容"));
		}else if(id == 2){
			view.addObject("article", new Article("文章二", "文章二的内容"));
		}
		view.setViewName("article/details");
		return view;
	}
	
}
