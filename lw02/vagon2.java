public class vagon2 extends vagon {
	public void IzmenitxChisloMest(int NovoeChisloMest){
		ChisloMest=NovoeChisloMest;
		System.out.println(">>New number of places: " + ChisloMest+"; \n ");
		//return NovoeChisloMest;
	}
	
	public void ZanyatxMesto(int NomerMesta) {
	   if (Mesta[NomerMesta-1]==1) {
		   System.out.print(">>The place - "+ NomerMesta +" in railway carriage #"+ NomerEtogoVagona +" is already booked up to you; \n");
	   }
	    else if (Mesta[NomerMesta-1]==0) {
			Mesta[NomerMesta-1]=1; 
			System.out.print(">>You have reserved a "+ NomerMesta +" place in " + NomerEtogoVagona + " car; \n");
		}
	   // 1 - признак того, что место занято
	}
	
	public void VagonInfo(){
		 
		System.out.println(">>Information about free places in railway carriage "+ NomerEtogoVagona  +":");
		int summFree = 0;
		for (int i=0;i<ChisloMest;i++){
			if (Mesta[i]==0) summFree++;
		}
		System.out.println("	>>Summary free plases is: " + summFree + "; \n");

		for (int i=0;i<ChisloMest;i++)
			 if (Mesta[i]==0) System.out.print((i+1)+" ");
		System.out.println("\n");
	}   
	 
}