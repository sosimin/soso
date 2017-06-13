package aop_log;

public class Search implements Log{

	@Override
	public String log(String name) {
		return name;
	}

	@Override
	public void log() {
		System.out.println("DB접근");
		
	}

}