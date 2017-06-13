package di_anno;

import java.util.List;

public class BoardVo {

	int serial;
	String wDate;
	String mDate;
	String worker;
	String subject;
	String content;
	int hit;
	int grp;
	String deep;
	List<String> attfile; // 서버에 저장된 파일명
	List<String> oriAttfile;
	public int getSerial() {
		return serial;
	}
	public void setSerial(int serial) {
		this.serial = serial;
	}
	public String getwDate() {
		return wDate;
	}
	public void setwDate(String wDate) {
		this.wDate = wDate;
	}
	public String getmDate() {
		return mDate;
	}
	public void setmDate(String mDate) {
		this.mDate = mDate;
	}
	public String getWorker() {
		return worker;
	}
	public void setWorker(String worker) {
		this.worker = worker;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public int getGrp() {
		return grp;
	}
	public void setGrp(int grp) {
		this.grp = grp;
	}
	public String getDeep() {
		return deep;
	}
	public void setDeep(String deep) {
		this.deep = deep;
	}
	public List<String> getAttfile() {
		return attfile;
	}
	public void setAttfile(List<String> attfile) {
		this.attfile = attfile;
	}
	public List<String> getOriAttfile() {
		return oriAttfile;
	}
	public void setOriAttfile(List<String> oriAttfile) {
		this.oriAttfile = oriAttfile;
	}
	
	
	
}
