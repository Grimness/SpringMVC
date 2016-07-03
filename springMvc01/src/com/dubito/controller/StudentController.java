package com.dubito.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dubito.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	private static List<Student> studentList = new ArrayList<Student>();
	
	static{
		studentList.add(new Student(1, "张三", 20));
		studentList.add(new Student(2, "李四", 22));
		studentList.add(new Student(3, "王五", 23));
	}
	
	@RequestMapping("/list")
	public ModelAndView list(){
		ModelAndView view = new ModelAndView();
		view.addObject("studentList", studentList);
		view.setViewName("student/list");
		return view;
	}
	
	@RequestMapping("/presave")
	public ModelAndView persave(@RequestParam(value="id",required=false) String id){
		ModelAndView view = new ModelAndView();
		if(id != null){
			view.addObject("student", studentList.get(Integer.parseInt(id)-1));
			view.setViewName("student/update");
		}else{
			view.setViewName("student/add");
		}
		return view;
	}
	
	@RequestMapping("/save")
	public String save(Student student){
		if(student.getId() != 0){
			Student s = studentList.get(student.getId()-1);
			s.setId(student.getId());
			s.setName(student.getName());
			s.setAge(student.getAge());
		}else{
			studentList.add(student);
		}
		return "redirect:/student/list.do";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("id") int id){
		studentList.remove(id-1);
		return "redirect:/student/list.do";
	}
}
