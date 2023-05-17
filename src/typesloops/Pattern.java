package typesloops;
//THIS CLASS IS EXPLAINS ABOUT STAR PATTERN BY USING FOR LOOP
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("practice of star pattern");// downward star pattern
for (int row=1;row<=8;row++) {
	for(int column=8;column>=row;column--) {
		System.out.print("*");
	}
	System.out.println();
}


/////////////////////////////////////////////////////////
for(int i =1;i<=8;i++) {                     // print pyramid star pattern
	 for(int k=1;k<=8-i+1;k++) {
	System.out.print(" ");
	}
	for(int j=1; j<=i;j++) {
		
	System.out.print("  *");
	}
	System.out.println();
}
//////////////////////////////////////////////////////////////////




for(int i =1;i<=8;i++) {                      // print left angle star pattern
	 for(int k=1;k<=8-i+1;k++) {
	System.out.print(" ");
	}
	for(int j=1; j<=i;j++) {
		
	System.out.print("*");
	}
	System.out.println();
}











	}
	
}


