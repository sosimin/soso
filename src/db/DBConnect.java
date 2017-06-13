package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	Connection conn;
	
	String driver ;  //각 db제조사에서 제공하는 상수
	//String url = "jdbc:oracle:thin:@서버주소:포트번호:SID"; 연결하려고 하는 db서버 주소
	String url ;
	String user;
	String pwd ;


	public Connection getConn() {
		
		try{
			Class.forName(driver).newInstance();
			conn = DriverManager.getConnection(url, user, pwd);
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		return conn;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	

}
