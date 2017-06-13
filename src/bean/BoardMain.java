package bean;

import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardMain {

	public static void prn(DBConnect db){
		System.out.println(db.getConn());
	}
	public static void main(String [] arg){
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("bean/board_context.xml");
		
		BoardDao dao = ctx.getBean("dao",BoardDao.class);
		
		BoardVo v = new BoardVo();
		v.setSerial(102);
		BoardVo vo = dao.view(v);
		
		if(vo != null){
			System.out.println("순번 : " + vo.getSerial());
			System.out.println("제목 : " + vo.getSubject()); 
			System.out.println("작성자  : " + vo.getWorker());
			System.out.println("내용  : " + vo.getContent());
			System.out.println("조회수  : " + vo.getHit());
		
			
			
		}else{
			System.out.println("data not found...");
		}
	}
}
