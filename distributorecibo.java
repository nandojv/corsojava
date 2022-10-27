package corsoiniziodacapo;


import java.util.ArrayList;
import java.util.Scanner;
public class distributorecibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int scegliprodotto=0;
ArrayList<String>distributore=new ArrayList();

String prodotto="cocacola";
String prodotto1="acqua";
String prodotto3="aranciata";
String prodotto4="kinder";
String prodotto5="patatine";
String prodotto6="salatini";
		
String moneta="1 euro";
String moneta1="2 euro";
String moneta2=" 3euro";

distributore.add(prodotto);
distributore.add(prodotto1);
distributore.add(prodotto3);
distributore.add(prodotto4);
distributore.add(prodotto5);
distributore.add(prodotto6);



	Scanner sp=new Scanner(System.in);
	
	System.out.println("seleziona prodotto:1cola,2acqua,3aranciata,4kinder,5patatine,6salatini");
	
	scegliprodotto=sp.nextInt();
	
	Scanner eu=new Scanner(System.in);
	
	System.out.println("inserire moneta:1 1euro,2euro,3euro");
	
	int Prodotto=sp.nextInt();
	
	// si doveva importare array
		
		if(Prodotto==1){
		System.out.println(prodotto +"  "+ moneta);
	}
		 if (Prodotto==2){
		
			 System.out.println(prodotto1 + "  "+ moneta1);
		
	}
	
	if(Prodotto==3){
		System.out.println(prodotto3+"  "+ moneta2);
		
	}
	
	if(Prodotto==4){
		System.out.println(prodotto4+"  "+ moneta1);
		
	
}
		
	if(Prodotto==5){
		System.out.println(prodotto5+"  "+ moneta2);
		

}
	if(Prodotto==6){
		System.out.println(prodotto6+"  "+ moneta1);
	}
	}// capire perche non va else
	
	}