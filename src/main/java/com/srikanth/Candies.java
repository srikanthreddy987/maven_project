package com.srikanth;

public abstract class Candies {                               /*abstract class for candies1*/
	static String type="Candies";
	public abstract void SetCandiesname(String a);
	public abstract String GetCandiesname();
}

class Candies1 extends Candies implements Interface{       /*candies1 class extends candies implements Interface*/
	String name;
	int weight;
	Candies1()
	{
		name="";
		weight=0;
	}
	Candies1(String a,int b)
	{
		this.name=a;
		this.weight=b;
	}
	public void SetCandiesname(String a)
	{
		this.name=a;
	}
	public void SetWeight(int b)
	{
		this.weight=b;
	}
	public String GetCandiesname()
	{
		return name;
	}
	public int GetWeight()
	{
		return weight;
	}
}
