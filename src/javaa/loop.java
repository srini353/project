package javaa;
import java.util.Scanner;
public class loop {
public static void main(String[] args) {
	int a,b,c,d,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	a = sc.nextInt();
	for(i=a; i>=20; i--) {
		System.out.println(i);
	}
	while(i<25) {
		System.out.println(i);
		i++;
	}
	do {System.out.println(i);
	i++;
	}while(i<=30);
	
}

}
