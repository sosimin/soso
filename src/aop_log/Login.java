package aop_log;

public class Login implements Log{
	
	
	String name = null;
	public Login() {
	}
	public Login(String name) {
		this.name = name;
	}
	@Override
	public String log(String name) {
		return name;
	}
	@Override
	public void log() {
		System.out.println(name+"님이 로그인 되었습니다.");
		
	}
	

}