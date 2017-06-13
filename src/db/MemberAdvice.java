package db;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.aspectj.lang.ProceedingJoinPoint;

public class MemberAdvice {

	
	public Object logCheck(ProceedingJoinPoint point)throws Throwable{
		Object result = point.proceed(); //dao.insert();
		Calendar now = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh:mm:ss");
		String str = sdf.format(now.getTime());
		String methodName = point.getSignature().getName();
		str+=", 호출된 메소드: " + methodName;
		System.out.println(str);
		return result;
	}
}
