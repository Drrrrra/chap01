package controllers.study;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/study")
public class LimaController {

	/*
	 * 	Spring은 View 처리를 InternalResouceViewResolver 를 이용해서 jsp로 바로 보내서 꾸미는게 아니라, 
	 * 	다른 view 기술을 이용해서도 응답을 만들어 낼 수 있게 viewResolver들을 더 지원하고 있다.
	 * 
	 * 	뷰 처리 기술도 다양한데, 그 중에서 Tiles 라는 View Framework를 이용해서 응답을 만들어보자
	 * 
	 * 	tiles.apache.org
	 * 
	 *  tiles ? templating framework for modern Java applications.
	 *  the easiest and most elegant way to work alongside any MVC technology.
	 *  
	 *  Spring bean configuration에서 viewResolver 처리부분에 
	 *  TilesViewResolver 등록
	 *  tiles library 가 필요하다.
	 *  
	 */
	@RequestMapping("/31.do")
	public String study31Handle() {
		return "exam";
	}
	
	@RequestMapping("/32.do")
	public ModelAndView study32Handle(WebRequest wr) {
		wr.setAttribute("page1", "/WEB-INF/views/nav.jsp", WebRequest.SCOPE_SESSION);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("elTiles");
		mav.addObject("page2","/WEB-INF/views/welcome.jsp");
		mav.addObject("data", "View Temlate");
		
		return mav;
	}
}
