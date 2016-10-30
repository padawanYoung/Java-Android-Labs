public class lw03 {
	
public static void main(String[] args) {
	double[] A = new double [100];
	for (int i = 0;i<100;i++){
		A[i]=i;
	}
	var02 t=new matematica();
	System.out.println(t.logika(3,90,8));
	t.poka(100);
	t.massivy(A,30,60);
}
}