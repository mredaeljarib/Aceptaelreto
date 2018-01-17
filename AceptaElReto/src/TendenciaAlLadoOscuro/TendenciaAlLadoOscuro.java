/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TendenciaAlLadoOscuro;
import java.util.Scanner;
/**
 *
 * @author mohbre
 */
public class TendenciaAlLadoOscuro {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
		int cont = 0;
		int n=0;
		int v=0;
		int s=0;
		String r="";
		n=tec.nextInt();
		for(int i=0;i<n;i++){//pasamos a base 5
			v=tec.nextInt();
			r="";
			while(v>5){
				
				s=v%5;
				v=v/5;
				r=s+r;
				
			}
			r=v+r;
			//System.out.println(r);
			
			cont=0;//contamos los 4
			for(int q=0;q<r.length();q++){
				if('4'==r.charAt(q)){
					cont++;
				}
			}
			if(cont>1){
				System.out.println("SI");
			}
			else{
				System.out.println("NO");
			}
		}
    }
}
