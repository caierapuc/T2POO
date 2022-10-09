import Exceptions.InvalidOptionException;

public class Main {

	public static void main(String[] args) throws InvalidOptionException {
		ACMEEnergy acmeEnergy = new ACMEEnergy();

		acmeEnergy.inicializa();
		acmeEnergy.executa(); 
	}

}
