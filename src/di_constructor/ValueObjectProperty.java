package di_constructor;

public class ValueObjectProperty {
	
	private int sdan;
	private int edan;
	
	
	
	public ValueObjectProperty(){

	}
	
	public void setSdan(int sdan) {
		this.sdan = sdan;
	}
	public void setEdan(int edan) {
		this.edan = edan;
	}
	
	public void output(){
		
		for(int r=sdan; r<=edan; r++){
		for(int i=1; i<10; i++){
			String temp = String.format("%d * %d = %d \n", r, i , (r*i));
			System.out.println(temp);
			
		}
	}
	}
}
