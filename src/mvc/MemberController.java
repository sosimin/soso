package mvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {
	MemberDao dao;

	public MemberController() {

	}

	public MemberController(MemberDao dao) {
		this.dao = dao;
	}
	//요청정보가 value값으로 들어왔을때 view를 실행
	//메소드의 형태가 get이나 post일때 실행
	@RequestMapping(value="member/view.do", method={RequestMethod.GET, RequestMethod.POST})
	public String view(MemberVo vo) {
		MemberVo v = dao.view(vo);
		vo.setUserpwd(v.getUserpwd());
		return "view"; // member 폴더 안의 view.jsp에 결과가 표시된다
	}
	
	//form의 action태그를 타고 input.do가 들어오므로 method타입은 POST만 @@@
	
	@RequestMapping(value="member/input.do", method={RequestMethod.POST})
	//input 매개변수에 들어오는 값은 input.jsp의 userid와 userpwd가 들어옴
	//  input.jsp의 name값은(userid,userpwd) MemberVo의 변수명과 같아야 함.
	public Object input(MemberVo vo){//반환 타입은 Object형으로
		/*ModelAndView mv = new ModelAndView();
		
		return mv; 가 원형이고 메소드 반환유형은 Object type..(ModelAndView로 해도되는데 걍 object로함)*/
		ModelAndView mv = new ModelAndView();
		int r = dao.input(vo);
		
		String msg = ""	;
		if(r>0) msg = "회원가입을 축하합니다~^^.";
		else msg = "회원가입 중 오류 발생..다시시도해주세요.";
		
		mv.addObject("msg",msg); //map구조 key값, value 값
		mv.setViewName("input_result"); //msg 값이 input_result로 값이 넘어감
		
		
		return mv;
	}
	
	@RequestMapping(value="member/list.do",method={RequestMethod.POST,RequestMethod.GET})
	   public Object list(MemberVo vo){ //userid만 들어옴(setter 실행.)
	      ModelAndView mv = new ModelAndView();
	      List<MemberVo> list = new ArrayList<MemberVo>();
	      list = dao.list(vo);
	      mv.addObject("list",list);
	      mv.setViewName("list");//mv.setViewName("파일명") 보여줄 파일명....
	      
	      return mv; 
	   }
	
	@RequestMapping(value="member/modify.do",method={RequestMethod.POST,RequestMethod.GET})
	   public Object modify(MemberVo vo){ //userid만 들어옴(setter 실행.)
		ModelAndView mv = new ModelAndView();
		int r = dao.modify(vo);
		
		mv.setViewName("modify"); //msg 값이 input_result로 값이 넘어감
		
		
		return mv;
	}
	
	@RequestMapping(value="member/delete.do",method={RequestMethod.POST,RequestMethod.GET})
	   public Object delete(MemberVo vo){ //userid만 들어옴(setter 실행.)
		ModelAndView mv = new ModelAndView();
		int r = dao.delete(vo);
		
		mv.setViewName("list"); //msg 값이 input_result로 값이 넘어감
		
		
		return mv;
	}
}