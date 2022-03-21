package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {
	
	//using get method and hello-world as URI  
	@RequestMapping("/")
	public String hej() {
		return "Hej välkommen till kalkulatorn";
		
	}
	
	// Metod som plussar ihop två tal.
	
	public String Plus(String nr1, String nr2) {
		
		int num1 = Integer.parseInt(nr1);
		int num2 = Integer.parseInt(nr2);
		int summan = num1 + num2;
		
		return "Summan av " + num1 + " + " + num2 + " = " + String.valueOf(summan);	
		
	}
	
	// Metod som tar ett tal minus det andra.
	
	public String Minus(String nr1, String nr2) {
		
		int num1 = Integer.parseInt(nr1);
		int num2 = Integer.parseInt(nr2);
		int summan = num1 - num2;
		
		return "Summan av " + num1 + " - " + num2 + " = " + String.valueOf(summan);
		
	}
	
// Metdod som multiplicerar två tal.
	
public String Times(String nr1, String nr2) {
	
	int num1 = Integer.parseInt(nr1);
	int num2 = Integer.parseInt(nr2);
	int summan = num1 * num2;
	
	return "Summan av " + num1 + " * " + num2 + " = " + String.valueOf(summan);
	
   }

// Metoden Gör så att samtliga räknesätt använder samma path.
// Jag lägger till strängen "typ" där man väljer räknesätt.

@RequestMapping("/kalkylator")

public String CalculationType(String nr1, String nr2, String typ) {
	
	if(typ.equals("plus")) {
		return  Plus(nr1,nr2);
	}
	if(typ.equals("minus")) {
		return  Minus(nr1,nr2);
	}
	if(typ.equals("ganger")) {
		return  Times(nr1,nr2);
	}
	return "Ange giltigt räknesätt";
}

}


