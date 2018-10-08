package controllers.study;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import models.IssueRepository;

@Controller
@RequestMapping("/study")
public class JulietController {
	
	@Autowired
	IssueRepository ir;
	
	@RequestMapping("/22.do")
	public void study22handle() {
		// System.out.println(ir.getAllIssue());
		// System.out.println(ir.getAllWithOpinionCount());
		List<Map> li = ir.getAllIssue();
		System.out.println(li);
	}
}
