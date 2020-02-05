package com.srikanth;
import java.util.Scanner;                       /*import Scanner class*/
public class App 
{
    public static void main( String[] args )
    {
       Scanner sc=new Scanner(System.in);       /*creates instance of Scanner class*/
       int n;
       System.out.println("Enetr no of Gifts");
       n=sc.nextInt();
       BirthdayGift a[]=new BirthdayGift[n];
       for(int i=0;i<n;i++)                          /*Reads input from keyboard*/
       {
    	   System.out.println("Enter sweet name and its weight in Gift"+(i+1));
    	   String b=sc.next();
    	   int c=sc.nextInt();
    	   System.out.println("Enter chocolate name and its weight in Gift"+(i+1));
    	   String d=sc.next();
    	   int e=sc.nextInt();
    	   System.out.println("Enter candies name and its weight in Gift"+(i+1));
    	   String f=sc.next();
    	   int g=sc.nextInt();
    	   a[i]=new BirthdayGift(b,c,d,e,f,g);
       }
       System.out.println("Choose options");
       System.out.println("1.Total weight of each Gift(sweet+chocolate+candies)");
       System.out.println("2.Find gifts corresponding to a specific range");
       int choice=sc.nextInt();
       switch(choice)
       {
              case 1:for(int i=0;i<n;i++)                        /*prints total weight of each gift*/
                    {
            	         System.out.print("Total weight in  gift:"+(i+1)+":");
            	         System.out.println(a[i].total);
                    }
                    break;
              case 2:System.out.println("choose options for specific range");
                     System.out.println("1.In total");
                     System.out.println("2.In sweets");
                     System.out.println("3.In chocolates");
                     System.out.println("4.In Candies");
                     System.out.println("Enter choice");
                     int c=sc.nextInt();
                     System.out.println("Enter range");
                     int d=sc.nextInt();
                     int e=sc.nextInt();
                     switch(c)
                     {
                            case 1:int x=0;                          /*prints weight of gift in given range*/
                            	 for(int i=0;i<n;i++)
                                 {
                            	      if(a[i].total>=d && a[i].total<=e)
                            	      {
                            	    	  x=1;
                            		       System.out.println("Gift"+(i+1)+":"+a[i].total);
                            	      }
                                 }
                            	 if(x==0)
                            	 {
                            		 System.out.println("There are no Gifts in specified range");
                            	 }
                                 break;
                            case 2:int xx=0;                           /*prints weight of sweets in given range*/
                                   for(int i=0;i<n;i++)
                                   {
                       	                if(a[i].getsweetweight()>=d && a[i].getsweetweight()<=e)
                       	                {
                       	                	    xx=1;
                       		                    System.out.println("In Gift"+(i+1)+a[i].getsweetname()+":"+a[i].getsweetweight());
                       	                }
                                    }
                                   if(xx==0)
                              	   {
                              		        System.out.println("There sre no sweets in specified range");
                              	    }
                                   break;
                            case 3:int xxx=0;                              /*prints weight of chocolates in given range*/
                                   for(int i=0;i<n;i++)
                                  {
                	                     if(a[i].getchocolateweight()>=d && a[i].getchocolateweight()<=e)
                	                     {
                	                    	     xxx=1;
                		                         System.out.println("In Gift"+(i+1)+a[i].getchocolatename()+":"+a[i].getchocolateweight());
                	                     }
                                  }
                                   if(xxx==0)
                              	   {
                              		 System.out.println("There are no chocolates in specified range");
                              	   }
                                  break;
                            case 4:int xxxx=0;                                /*prints weight of candies in given range*/
                                    for(int i=0;i<n;i++)
                                   {
                	                     if(a[i].getcandiesweight()>=d && a[i].getcandiesweight()<=e)
                	                     {
                	                    	     xxxx=1;
                		                         System.out.println("In Gift"+(i+1)+a[i].getcandiesname()+":"+a[i].getcandiesweight());
                	                     }
                                    }
                                    if(xxxx==0)
                               	    {
                               		        System.out.println("There are no candies in specified range");
                               	    }
                
                
                
                
                     }
                     break;
       }
       
       sc.close();
    }
}
