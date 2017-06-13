package begin;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String [] arg){
		
		/*
		 * 스프링의 환경 설정 파일인 app_context.xml을 
		 * 사용함으로써 같은 의미로 처리 됨.
		 * 
		 * Greeter g = new Greeter();
		g.setFormat("%s, 안녕");
		*/
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("begin/app_context.xml");
		Greeter g  = ctx.getBean("greeter",Greeter.class);
		String msg = g.greet("스프링");
		System.out.println(msg);
		ctx.close();
	}
}
