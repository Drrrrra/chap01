package controllers.study;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * 	Controller 클래스를 만들면서 요청 핸들 메서드에 설정할 수 있는 인자들
 *	지금까지 살펴본거 쓰는 방법을 익히고 살펴보자.
 *
 *	View 처리하는 방법부터 2개 살펴보자. 
 *  
 */
@Controller
@RequestMapping("/study")
public class CharlieController {

	@RequestMapping("/99.do")
	public String study99Handle(Map map) {
		// ViewResolver로  InternalResourceViewResolver를 등록시켜둔 상황이기 때문에
		// 리턴타입을 String으로 잡고, 뷰로 사용할 JSP위치 리턴시키면 DipatcherServlet이 
		// 해당 jsp로 forard 시켜준다.
		System.out.println("/99.do");
		map.put("no",45);
		return "/WEB-INF/views/default.jsp";
	}
	
	@RequestMapping("/98.do")
	public String study98Handle(Map map) {
		// 만약, redirect를 하고 싶다면 (다른 컨트롤러로 사용자를 보내고 싶다)
		// cf. 데이터 설정할 Map을 Inject받아서, 값 설정 후 redirect 처리하면,
		// 리다이렉트 시킬 때 설정할 파라미터로 붙여서 설정시켜준다.
		map.put("no",45);
		return "redirect:/index.do";	// 앞에 redirect : 붙이고 경로 설정
	}
}
