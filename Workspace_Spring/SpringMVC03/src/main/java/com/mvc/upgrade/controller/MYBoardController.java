package com.mvc.upgrade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.upgrade.model.biz.MyBoardBiz;
import com.mvc.upgrade.model.dto.MYBoardDto;

@Controller
public class MYBoardController {
	@Autowired
	private MyBoardBiz biz; 
	
	@RequestMapping("/list.do")
	public String selectList(Model model) {
		
		model.addAttribute("list", biz.selectList());
		return "myboardlist";
	}
	
	@RequestMapping("/writeform.do")
	public String insertform(Model model ) {
		//model.addAttribute("dto", biz.insert(dto));
		return "myinsert";
	}
	@RequestMapping(value="writeres.do",method=RequestMethod.POST)
	public String insertRes(MYBoardDto dto) {
		if(biz.insert(dto)>0) {
			return "redirect:list.do"; 
		}
		return "redirect:writeform.do";
	}
	
	
	@RequestMapping("/select.do")
	public String selectOne(Model model, int myno) {
		model.addAttribute("dto", biz.selectOne(myno));
		return "myselect";
	}
	
	
	@RequestMapping("/updateform.do")
	public String updateform(Model model, int myno) {
		model.addAttribute("dto", biz.selectOne(myno));
		return "myupdate";
	}
	//model을 안해주면 select할 글 (원래글)이 안가져와진다..  전달할 애가 있을 때 model에 담아서 가자! 
	
	@RequestMapping("/updateres.do")
	public String updateRes(MYBoardDto dto) {
		if(biz.update(dto)>0) {
			return "redirect:select.do?myno="+dto.getMyno();
		}
		return "redirect:updateform.do";
	}
	@RequestMapping("/delete.do")
	public String delete(Model model, int myno) {
		model.addAttribute("dto", biz.delete(myno));
		return "redirect:list.do";
	}

}
