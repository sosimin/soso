package db;

import java.sql.Connection;
import java.util.List;

public class MemberDao {

	Connection conn;
	
	public MemberDao(DBConnect db){
		this.conn = db.getConn();
		if(conn != null){
			System.out.println("DB 정상연결");
		}
		
	}
	
	public void insert(MemberVo vo){
		
		System.out.println("insert");
	}
	
	public void update(MemberVo vo){
		System.out.println("update");
	}
	
	public void delete(MemberVo vo){
		System.out.println("delete");
	}
	
	public MemberVo view(MemberVo vo){
		MemberVo v = null;
		System.out.println("view");
		return v;
	}
	
	public List<MemberVo> select(MemberVo vo){
		List<MemberVo>list = null;
		System.out.println("select");
		return list;
	}
}

