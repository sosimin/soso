package aop_log;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class PrintLog {
	//★★★★★★★★★★★★★★★★★★★중요중요중요중요중요중요중요중요중요중요★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
	/*ProceedingJoinPoint일때 (Around를 사용할 때) 반환형이 proceed를 해주는...그친구를 반환해야함.
	 * Object형이어야함!!!!!!! */
	
	public Object checkLog(ProceedingJoinPoint point)throws Throwable{
		
		
		Calendar cal = Calendar.getInstance();
		Object className = point.proceed();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh:mm:ss");
		String str = sdf.format(cal.getTime());
		str +=", 호출된 메소드 : "+className;
		System.out.println(str);
		
		
		return className;
		
		
	}

}