package cn.jxufe.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/base")
public class IndexController {

	@RequestMapping(value="/index" ,method = RequestMethod.GET)
	public String list(HttpServletRequest request){
		Logger log = Logger.getLogger(IndexController.class);
		log.info("---------index------------------");
		return "index";
	}


	@RequestMapping(value="/login" ,method = RequestMethod.GET)
	@ResponseBody
	public String login(HttpServletRequest request){
		Logger log = Logger.getLogger(IndexController.class);
		log.info("------------login---------------");
		return "nihao";
	}
	
}