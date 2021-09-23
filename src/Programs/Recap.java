package Programs;

import java.util.Scanner;

public class Recap {
String var1;
Recap(String var1){
	this.var1=var1;
}
public void printinfo() {
	System.out.println(var1);
}
	public static void main(String[] args) {
    Recap rr= new Recap("shiva");
    rr.printinfo();
  
	}}