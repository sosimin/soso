package aop_log;

public class Logout implements Log{

	@Override
	public String log(String name) {
		return name;
	}

	@Override
	public void log() {
		System.out.println("로그아웃 되었습니다.");
		
	}
	

}