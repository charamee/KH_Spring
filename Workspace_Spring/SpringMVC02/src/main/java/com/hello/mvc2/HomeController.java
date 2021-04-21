package com.hello.mvc2;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hello.mvc2.dto.AddressDto;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home"; //리턴해주는애가 바로 view name 
	}
	
	@RequestMapping(value="/command.do", method= RequestMethod.GET)
	public String getCommand(Model model, @RequestParam("name") String name,String addr,HttpServletRequest request) {
		
		String phone = request.getParameter("phone");
		//jsp로 들어오는 쿼리스트링의 값이 name, addr, phone그대로 들어온다면 @requestparam 생략 가능하다  
		model.addAttribute("dto",new AddressDto(name,addr,phone));
		
		return "get"; //리턴해주는애가 바로 view name 
	}
	
	@RequestMapping(value = "/command.do",method = RequestMethod.POST)
	public String postCommand(Model model, @ModelAttribute AddressDto dto) { //addriessDto에 있는 setter와 들어오는 값의 이름이 같다면 @ModelAttribute 생략 가능하다
		
		model.addAttribute("dto", dto);
		return "post";  //리턴해주는애가 바로 view name 
	}
	
	@RequestMapping("/void.do")
	public void voidPage(Model model) {
		model.addAttribute("message","viewname 안써도 넘어갑니다..!!!!!");
		//return 을 안써주면 매핑의 url 이름을 찾아준다 
	}
	
	
	
	
	
	
	
	
	
	
}





















