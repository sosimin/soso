package di_constructor;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DiMain {
	
	public DiMain(){
		
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("di_constructor/value_context.xml");
		
		//valueobject는 생성자DI방식이므로  빈객체를 생성하는 시점에 모든 의존객체가 주입됨..
		
		//ValueObject o = ctx.getBean("obj",ValueObject.class);
		
		ValueObjectProperty v = ctx.getBean("objp",ValueObjectProperty.class);
		// ValueObjectProperty v1 = (ValueObjectProperty)ctx.getBean("obj2");랑 같은 것
		v.output();
		
		
		
		
		
	//Spring DI로 만든 Connection
		
		SpringDBConnect db = ctx.getBean("conn",SpringDBConnect.class);
		if(db.getConn() != null){
			System.out.println("Connection이 정상 생성");
		}else{
			System.out.println("Connection error");
			
		}
		
	}
	//스프링이 제공한 외부 조립기
	
	public static void main(String [] args){
		new DiMain();
	}
	
	
	
	
}
