package typesloops;
//This class is explains about tables from11 to 20 with nested for loop
public class Forloop {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Creat Table from 11 to 20 with the help of for loop  ");

for(int i=1;i<=10;i++) {
	for(int k=11;k<=20;k++) {
	System.out.printf("%5d",i*k);
}
	System.out.println(" ");
}
	}
}

