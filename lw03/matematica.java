public class matematica implements var02 {
    public double sum = 0 ;
	public double logika(double d1, double d2, double d3){ 
		// выбрать медиану из этих трех переменных
		if ((d1>=d2 && d2>=d3) || (d3>=d2 && d2<=d1)) {
			return d2;
		}
		if ((d2>=d1 && d1>=d3) || (d3>=d1 && d1>=d2)) {
			return d1;
		}
		if ((d2>=d3 && d3>=d1) || (d1>=d3 && d3>=d2)) {
			return d3;
		}
		return 0;
	}
	public void poka(double N){
		// Дано число N. Вывести наименьшее из целых чисел K, для которых 
		// сумма 1 + 2 + ... + K будет больше или равна N, и саму эту сумму.
		for (double i =0; i<N; i++){
			if ( (Math.round(i*(i+1))/2) >= N ){
			System.out.println(i + "-  Smallest integer K...; " + Math.round((i*(i+1))/2) + " - Summ");
			break;}
		}
	}
	public void massivy(double[] A, int K, int L) {
		// Найти сумму элементов массива A с номерами от K до L включительно.
		//if ((A.lenght()<= K) || (A.lenght()< L) || (K > L))) System.out.println("You enter wrong limits");
		//else {
			for (int i=K-1;i<=L-1;i++){
				sum += A[i];
			}
			System.out.println("sum in limit" + K + "-" + L +" = " + sum);
		//}
	}
}