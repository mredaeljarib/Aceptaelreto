package OrganizandoLosHangares;

import java.util.Scanner;

public class OrganizandoLosHangares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tec= new Scanner(System.in);

		int n=1;
		
		int v=0;
		
		int s=0;
		int s1=0;
		while(n!=0){
			n=tec.nextInt();
			if(n==0){
				
			}
			else{
				
				for(int q=0;q<n;q++){
					
					v=tec.nextInt();
					s=s+v;
					
					
				}
				
				n=tec.nextInt();
				
				for(int q=0;q<n;q++){
					
					v=tec.nextInt();
					s1=s1+v;
					
				}
				
				if(s>=s1){
					System.out.println("SI");
				}
				else{
					System.out.println("NO");
				}				
				s=s1=0;
			}
			
		}
		
	}

}
