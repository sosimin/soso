package di_constructor;

public class ValueObject {

	public ValueObject(int dan){
	
		for(int i = 1; i<10; i++){
			String temp = String.format("%d * %d = %d \n", dan, i , (dan*i));
			System.out.println(temp);
		}
	}
}
