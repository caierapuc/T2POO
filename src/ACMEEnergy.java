import java.util.Scanner;
import Entities.Conglomerado;

public class ACMEEnergy {
	private Conglomerado conglomerado;
	private Scanner sc;

	public ACMEEnergy(){
		this.conglomerado = new Conglomerado();
		this.sc = new Scanner(System.in);
	}

	public void inicializa() {

	}

	public void executa() {
		int opcao = 0;
            String aux = "";
            do {
                System.out.println("=========================================\n");
                System.out.println("Opcoes:");
                System.out.println("[1] Cadastrar nova usina.");
                System.out.println("[2] Pesquisar uma usina.");
                System.out.println("[3] Listar todas as usinas.");
                System.out.println("[4] Consulta o preço do MHh.");
                System.out.println("[5] Salvar usinas em arquivo.");
                System.out.println("[0] Sair.");
                System.out.print("Digite a opção desejada: ");
                aux = sc.nextLine();
                
                while (!aux.matches("[0-4]")){
                    System.out.print("Opção inválida, tente novamente: ");
                    aux = sc.nextLine();
                }
                
                opcao = Integer.parseInt(aux);
                
                switch(opcao) {
                    case 1:
                        this.cadastrarNovaUsina();
                        break;
                    case 2:
                        this.pesquisarUmaUsina();
                        break;
                    case 3:
                        this.listaTodasUsinas();
                        break;
                    case 4:
                        this.consultaPrecoMWh();
                        break;
					case 5:
						this.salvarDadosArquivo();
						break;
                    case 0:
                        break;
                    default:
                        System.out.println("Opcao inválida.");
                }
            }
            while(opcao != 0);
			sc.close();
	}

	private void cadastrarNovaUsina(){
		try {

		}
		catch (Exception e){

		}
	}

	private void pesquisarUmaUsina(){
		try {

		}
		catch (Exception e){
			
		}
	}
	
	private void listaTodasUsinas(){
		try {

		}
		catch (Exception e){
			
		}
	}

	private void consultaPrecoMWh(){
		try {

		}
		catch (Exception e){
			
		}
	}

	private void salvarDadosArquivo(){
		try {

		}
		catch (Exception e){
			
		}
	}
}
