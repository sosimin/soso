package di_step3;
//외부조립기
//DI를 구현하기 위한 외부 조립기
//외부에서 객체를 생성한 후 반환해줌

public class Assembler {
	public MyDB get(){
		return new Oracle();
	}
}
