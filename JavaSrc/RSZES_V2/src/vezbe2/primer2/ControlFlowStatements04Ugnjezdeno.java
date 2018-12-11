package vezbe2.primer2;

public class ControlFlowStatements04Ugnjezdeno {

	public static void main(String[] args) {
		//UGNJEZDENE KONSTRUKCIJE
		//prolazi u petlji se mogu preskakati naredbom continue, 
		//a moze se i izaci naredbom break
		for(int i = 0; i < 10; i++){
			if (i==7){
				break;
			}
			if (i == 2)
				continue;
			
			System.out.println("Broj je:" + i);
		}
	}
}
