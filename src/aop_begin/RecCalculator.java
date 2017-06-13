package aop_begin;

public class RecCalculator implements Calculator{

	@Override
	//자기 자신을 호출하는 재귀...재귀..호..출..함..수..?
	public long factorial(long num){
		if(num==0) return 1;
		else return num*factorial(num-1);
	}
}
