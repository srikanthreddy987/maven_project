package com.srikanth;

public class BirthdayGift{
	  Sweet1 m;
	  Chocolate1 n;
	  Candies1 o;
	  int total;
      
      BirthdayGift(String a,int b,String c,int d,String e,int f)
      {
    	  total=b+d+f;
    	  m=new Sweet1(a,b);
    	  n=new Chocolate1(c,d);
    	  o=new Candies1(e,f);
    	  
      }
      void setsweetname(String a)
      {
    	  m.SetSweetname(a);
      }
      String getsweetname()
      {
    	  return m.GetSweetname();
    	  
      }
      void setsweetweight(int b)
      {
    	  m.SetWeight(b);
      }
      int getsweetweight()
      {
    	  return m.GetWeight();
      }
      void setchocolatename(String a)
      {
    	  n.SetChocolatename(a);
      }
      String getchocolatename()
      {
    	  return n.GetChocolatename();
    	  
      }
      void setchocolateweight(int b) 
      {
    	   n.SetWeight(b);
      }
      int getchocolateweight()
      {
    	  return n.GetWeight();
      }
      void setcandiesname(String a)
      {
    	  o.SetCandiesname(a);
      }
      String getcandiesname()
      {
    	  return o.GetCandiesname();
    	  
      }
      void setcandiesweight(int b)
      {
    	  o.SetWeight(b);
      }
      int getcandiesweight()
      {
    	  return o.GetWeight();
      }
}
