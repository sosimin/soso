package di_step1;



/* DI형태의 구조물이 만들어지지 않는 상태로
 * 서로 다른 환경에서는 코드를 그 때 그 때 다시 디버깅해야 함 (msSql쓰면 msSql에 따른..각각 따로 디버깅..)
 * */
public class DiMain {


	public static void main(String[] arg){
		//A는 mysql을 사용
		MySql sql = new MySql();
		String db=sql.getAgent();
		System.out.println(db);
		
		//B는 Oracle 사용
		Oracle sql2 = new Oracle();
		String db2 = sql2.getName();
		System.out.println(db2);
		
		//C mssql
		MsSql sql3 = new MsSql();
		String db3 = sql3.getVender();
		System.out.println(db3);
		
		
	}
}
