package di_step3;



/* DI형태의 구조물이 만들어지지 않는 상태로
 * 서로 다른 환경에서는 코드를 그 때 그 때 다시 디버깅해야 함 (msSql쓰면 msSql에 따른..각각 따로 디버깅..)
 * */

//인터페이스 MYDB(부모)에 자식..(mssql, mysql, oracle의 내용을 담아서.... )
//★★객체생ㅅ어은 외부 조립기에 의해서 생성한 뒤  반환하는 목적
public class DiMain2 {
	public static void prn(MyDB db){
		System.out.println(db.getDB());
	}
	public static void main(String[] arg){
		Assembler asm = new Assembler();
		
		prn(asm.get());
		
		//B는 Oracle 사용
		//step2 MyDB sql2 = new Oracle();
		/*String db2 = sql2.getDB();
		System.out.println(db2);*/
		//step2prn(sql2);
		
		//C mssql
		//step2 MyDB sql3 = new MsSql();
	/*	String db3 = sql3.getDB();
		System.out.println(db3);*/
		//step2 prn(sql3);
		
	}
}
