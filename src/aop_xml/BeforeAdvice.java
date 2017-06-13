package aop_xml;

import org.aspectj.lang.JoinPoint;

//사전처리(대상 객체의 메서드 호출 전에 공통 기능을 실행한다)
//mainxmlpojo에서 실행 .. 

public class BeforeAdvice {

	public Object before(JoinPoint point) throws Throwable{
		String methodName = point.getSignature().getName();//메소드 이름
		System.out.println(methodName + "calling....");
		
		return null;
	}
}
