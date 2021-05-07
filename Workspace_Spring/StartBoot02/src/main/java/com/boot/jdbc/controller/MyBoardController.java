package com.boot.jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.jdbc.model.biz.MyBoardBiz;
import com.boot.jdbc.model.dto.MyDto;

@Controller
@RequestMapping("/myboard")
public class MyBoardController {

	@Autowired
	private MyBoardBiz biz; 
	
	@GetMapping("/list") //get 방식으로 넘어오는 애만 맵핑해주는것 requestMapping은 get과 post 둘다 (둘중 선택도 가능) 
	public String selectList(Model model) {
		model.addAttribute("list", biz.selectList());
		return "myboardlist";
	}
	@GetMapping("/myselect")
	public String selectOne(Model model, int myno) {
		model.addAttribute("dto", biz.selectOne(myno));
		return "myboardselect";
		
	}
	@GetMapping("/insertform")
	public String insert() {
		
		return "myinsert";
		
	}
	@PostMapping("/insertres")
	public String insertres(MyDto dto) {
		if(biz.insert(dto)>0) {
			return "redirect:/myboard/list";
		}
		return "redirect:/myboard/insertform";
		
	}
	@GetMapping("/updateform")
	public String update(Model model, int myno) {
		model.addAttribute("dto", biz.selectOne(myno));
		return "myupdate";
	}
	
	@PostMapping("/updateres")
	public String updateres(MyDto dto) {
		if(biz.update(dto)>0) {
			return "redirect:/myboard/updateform?myno="+dto.getMyno();
		}
		return "redirect:/myboard/updateform";
	}
	
	@GetMapping("/delete")
	public String delete(int myno) {
		if(biz.delete(myno)>0) {
			return "redirect:/myboard/list";	
		}
		return "redirect:/myboard/myselect?myno="+myno;
	}
	
}
