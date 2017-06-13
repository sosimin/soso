package di_step2;



/* DI형태의 구조물이 만들어지지 않는 상태로
 * 서로 다른 환경에서는 코드를 그 때 그 때 다시 디버깅해야 함 (msSql쓰면 msSql에 따른..각각 따로 디버깅..)
 * */

//인터페이스 MYDB(부모)에 자식..(mssql, mysql, oracle의 내용을 담아서.... )

public class DiMain2 {
	public static void prn(MyDB db){
		System.out.println(db.getDB());
	}
	public static void main(String[] arg){
		//A는 mysql을 사용
		MyDB sql = new MySql();
		/*String db=sql.getDB();
		System.out.println(db);*/
		prn(sql);
		
		//B는 Oracle 사용
		MyDB sql2 = new Oracle();
		/*String db2 = sql2.getDB();
		System.out.println(db2);*/
		prn(sql2);
		
		//C mssql
		MyDB sql3 = new MsSql();
	/*	String db3 = sql3.getDB();
		System.out.println(db3);*/
		prn(sql3);
		
	}
}
