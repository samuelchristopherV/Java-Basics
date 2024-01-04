package simpleprograminjava;

public class Loopsmethod {
public static void main(String[]args) {
	
	int i=0;
	while (i<=15) {
		System.out.println(i);
		i++;
		}
	int q=16;
	do {
		System.out.println(q);
		q++;
	}while(q<=15);
	for(int w=0;w<=17;w++) {
		System.out.println(w);
	}
	for(int h=0;h<=15;h++) {
		if (h==4) {
			break;
		}
		System.out.println(h);
	}
	for(int h=0;h<=15;h++) {
		if (h==4) {
			continue;
		}
		System.out.println(h);
	}
}
}
