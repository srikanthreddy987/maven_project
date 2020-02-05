package com.srikanth;

public abstract class Sweet {                            /*abstract class for sweets*/
	static String type="Sweets";
	public abstract void SetSweetname(String a);
	public abstract String GetSweetname();
}

class Sweet1 extends Sweet implements Interface{          /*sweet1 class extends sweet implements Interface*/
	String name;
	int weight;
	Sweet1()
	{
		name="";
		weight=0;
	}
	Sweet1(String a,int b)
	{
		this.name=a;
		this.weight=b;
	}
	public void SetSweetname(String a)
	{
		this.name=a;
	}
	public void SetWeight(int b)
	{
		this.weight=b;
	}
	public String GetSweetname()
	{
		return name;
	}
	public int GetWeight()
	{
		return weight;
	}
}