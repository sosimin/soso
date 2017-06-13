package mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//Model 파라미터 : 컨트롤러의 처리 결과를 뷰에 전달할 때 사용

@Controller
public class HelloController {

	@RequestMapping("/bbb")//요청 url 중 /hello 경로가 표시 됐을때. 메소드명과 url 경로명은 상관 없음~~~~★★
	public String Hello(Model model, @RequestParam(value="name", required=false)String name){
		
		model.addAttribute("greeting","안녕하세요." + name);//setAttribute (어떤 영역에 올린다)
		return "hello";//view의 이름 (view는 /hello안에 있음)
	}
	
	
	
		//http://localhost:7080/1701-spring/abc?name=gg
		// /abc가 경로임@@ return begin으로 치면 begin폴더에 begin.jsp로 실행하면됨 (파일명begin을 return하는거임) 
		@RequestMapping("/abc")//요청 url 중 /abc 경로가 표시 됐을때.
		public String abc(Model model, @RequestParam(value="name", required=false)String name){
			
			model.addAttribute("greeting","아농.아농아농" + name);
			return "hello";//view의 이름 (view는 /hello안에 있음) hello.jsp
		}
}
