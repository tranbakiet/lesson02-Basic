package kiet.dev;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {	
	   int a,b,c ;  
	   a =Nhapsonguyen("Nhap he so a : ");
	   b =Nhapsonguyen("Nhap he so b : ");
	   c =Nhapsonguyen("Nhap he so c : ");
	   GPTB2 (a,b,c);
	}
	
	public static int Nhapsonguyen(String str) {
		int x;
		Scanner sc=new Scanner (System.in);
        System.out.println(str);
        x=sc.nextInt();
        return x;
	}
	
	public static void GPTB2 (int a, int b, int c) { 
		if(a==0) {
			if(b==0){
				if(c==0)
					System.out.println("Phuong trinh vo so nghiem");
					else
					System.out.println("Phuong trinh vo nghiem");
			        }
					else 
				    System.out.println("PT co 1 nghiem duy nhat la x ="+(-c/b));
		        }
					else
		        {
					double x1;
					double x2;
					double delta=Math.pow(b, 2)-4*a*c;
					if (delta<0)
				    System.out.println("Phuonng trinh vo nghiem");
					else if (delta>0)
			    {
					x1=(-b+Math.sqrt(delta)/(2*a));
					x2=(-b-Math.sqrt(delta)/(2*a)); 
	                System.out.println("x1= "+x1); 
	                System.out.println("x2= "+x2); 	
	            } 
	            else
	                System.out.println("phuong trinh co nghiem kep x1=x2="+(-b/2*a)); 
	           } 
        }
}