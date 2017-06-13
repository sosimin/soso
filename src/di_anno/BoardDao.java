package di_anno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;

public class BoardDao {
	Connection conn;
	
	@Autowired
	public BoardDao(DBConnect db){
		//di 이전
		/*this.conn = new DBConnect().getConn();*/
		
		//di 이후
		this.conn = db.getConn();
		
	}
	
	public BoardVo view(BoardVo v){
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql ="";
		BoardVo vo = new BoardVo();
		
		try{
			sql = "select * from board where serial=?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, v.getSerial());
			rs = ps.executeQuery();
			
			if(rs.next()){
				vo.setSerial(rs.getInt("serial"));
				vo.setmDate(rs.getString("mdate"));
				vo.setWorker(rs.getString("worker"));
				vo.setSubject(rs.getString("subject"));
				vo.setContent(rs.getString("content"));
				vo.setHit(rs.getInt("hit"));
				
			}
			
		}catch(Exception ex){
			vo=null;
			ex.printStackTrace();
		}
		
		return vo;
	}
}
