package mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//Model 파라미터 : 컨트롤러의 처리 결과를 뷰에 전달할 때 사용

@Controller //@Controller가 있어야 컨트롤러 기능을 하는거임~~!!!~~!!!_!_!_!@)@)@)
public class BeginController {

	@RequestMapping("/hello")//요청 url 중 /hello 경로가 표시 됐을때.
	public String Hello(Model model, @RequestParam(value="name", required=false)String name){ //required=true면 value값이 들어오지 않으면 오류남 
		
		model.addAttribute("greeting","안녕하세요." + name);//setAttribute (어떤 영역에 올린다)
		return "begin";//view의 이름 (view는 /hello안에 있음)
	}
	
	
	
		//http://localhost:7080/1701-spring/abc?name=gg
		// /abc가 경로임@@ return begin으로 치면 begin폴더에 begin.jsp로 실행하면됨 (파일명begin을 return하는거임) 
		@RequestMapping("/bbb")//요청 url 중 /bbb 경로가 표시 됐을때.
		// ★★★ @RequestParam(value="id"면 /bbb?id=ㅇㅇㅇ 이렇게 쳐야함★★★
		public String abc(Model model, @RequestParam(value="id", required=false)String name){
			
			model.addAttribute("greeting","아농." + name);
			return "begin";//view의 이름 (view는 /hello안에 있음) hello.jsp
		}
		
		
		//http://localhost:7080/1701-spring/abc?name=gg
		// /abc가 경로임@@ return begin으로 치면 begin폴더에 begin.jsp로 실행하면됨 (파일명begin을 return하는거임) 
		@RequestMapping("/ff")//요청 url 중 /ff 경로가 표시 됐을때.
		//★★★ @RequestParam(value="name"이면 /ff?name=ㅎㅎㅎ 이렇게 쳐야함~~ ★★★
		public String showHello(Model model, @RequestParam(value="name", required=false)String name){//string name은 파라미터의 name값을 갖는다
			model.addAttribute("greeting","하이하이룽" + name);
			return "begin";//view의 이름 (view는 /hello안에 있음) hello.jsp
		}
		
	

		
}
