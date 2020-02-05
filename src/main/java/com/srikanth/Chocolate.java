package com.srikanth;

public abstract class Chocolate {                          /*abstract class for chocolates*/
	static String type="Chocolate";
	public abstract void SetChocolatename(String a);
	public abstract String GetChocolatename();
}

class Chocolate1 extends Chocolate implements Interface{     /*chocolate1 class extends chocolate implements Interface*/
	String name; 
	int weight;
	Chocolate1()
	{
		name="";
		weight=0;
	}
	Chocolate1(String a,int b)
	{
		this.name=a;
		this.weight=b;
	}
	public void SetChocolatename(String a)
	{
		this.name=a;
	}
	public void SetWeight(int b)
	{
		this.weight=b;
	}
	public String GetChocolatename()
	{
		return name;
	}
	public int GetWeight()
	{
		return weight;
	}
}