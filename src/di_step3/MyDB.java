package di_step3;

public interface MyDB {
	//abstract를 따로 써주지 않아도 interface안에 추상 메서드들은 자동으로 abstract가 생략돼있음.
	abstract public String getDB();//사용하려는 DB의 이름이 나오도록 강제로 틀을 만듦.
	
	
	
	
}
