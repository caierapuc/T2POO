import java.util.Scanner;
import Entities.Conglomerado;
import Entities.Usina;
import Entities.UsinaNaoRenovavel;
import Entities.UsinaRenovavel;
import Enums.*;

public class ACMEEnergy {
	private Conglomerado conglomerado;
	private Scanner sc;

	public ACMEEnergy() {
		this.conglomerado = new Conglomerado();
		this.sc = new Scanner(System.in);
	}

	public void inicializa() {
		conglomerado.cadastraUsina(new UsinaRenovavel("Tauá", 1000, 249.84, Fontes.SOLAR));
		conglomerado.cadastraUsina(new UsinaRenovavel("Parque Eólico de Osório", 300, 244.43, Fontes.EOLICA));
		conglomerado.cadastraUsina(new UsinaRenovavel("Usina Hidroelétrica Belo Monte", 11233, 206.03, Fontes.HIDRICA));

		conglomerado.cadastraUsina(new UsinaNaoRenovavel("Angra 2", 1350, 349.15, Combustiveis.NUCLEAR));
		conglomerado.cadastraUsina(new UsinaNaoRenovavel("Usina GNA I", 1338.3, 1338.78, Combustiveis.CARVAO));
		conglomerado.cadastraUsina(new UsinaNaoRenovavel("Usina Fictícia", 5000, 100, Combustiveis.PETROLEO));
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

			while (!aux.matches("[0-4]")) {
				System.out.print("Opção inválida, tente novamente: ");
				aux = sc.nextLine();
			}

			opcao = Integer.parseInt(aux);

			switch (opcao) {
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
		} while (opcao != 0);
		sc.close();
	}

	private void cadastrarNovaUsina() {
		try {
			String aux = "";

			System.out.print("\n\nEsolha o tipo de usina (1 - Renovável/2 - Não Renovável): ");
			aux = sc.nextLine();

			while (!aux.matches("[1-2]")) {
				System.out.print("Opção inválida, tente novamente: ");
				aux = sc.nextLine();
			}

			int opcao = Integer.parseInt(aux);

			System.out.print("Insira o nome da Usina: ");
			String nome = sc.nextLine();

			while (nome.length() <= 0){
				System.out.print("O nome da usina é obrigatório! Tente novamente: ");
				nome = sc.nextLine();
			}

			if (conglomerado.pesquisaUsina(nome) != null){
				System.out.println("\nUsina repetida.\n");
				return;	
			}

			System.out.print("Insira o custo do MWh da Usina: ");
			aux = sc.nextLine();

			while (!aux.matches("\\d{0,10}\\.\\d{1,2}|\\d+")) {
				System.out.print("Opção inválida, tente novamente: ");
				aux = sc.nextLine();
			}
			double custoMHw = Double.parseDouble(aux);

			System.out.print("Insira a produção de MWh da Usina: ");
			aux = sc.nextLine();

			while (!aux.matches("\\d{0,10}\\.\\d{1,2}|\\d+")) {
				System.out.print("Opção inválida, tente novamente: ");
				aux = sc.nextLine();
			}
			double producaoMWh = Double.parseDouble(aux);

			if (opcao == 1) {
				System.out.println("Selecione a fonte da Usina:");
				System.out.println("[1] Solar.");
				System.out.println("[2] Eólica.");
				System.out.println("[3] Hídrica.");

				aux = sc.nextLine();

				while (!aux.matches("[1-3]")) {
					System.out.print("Opção inválida, tente novamente: ");
					aux = sc.nextLine();
				}

				switch (aux) {
					case "1":
						conglomerado.cadastraUsina(new UsinaRenovavel(nome, producaoMWh, custoMHw, Fontes.SOLAR));
						break;
					case "2":
						conglomerado.cadastraUsina(new UsinaRenovavel(nome, producaoMWh, custoMHw, Fontes.EOLICA));
						break;
					case "3":
						conglomerado.cadastraUsina(new UsinaRenovavel(nome, producaoMWh, custoMHw, Fontes.HIDRICA));
						break;
					default:
						System.out.println("Não foi possível identificar o tipo de fonte, tente novamente!");
				}
			}
			else {
				System.out.println("Selecione o combustível da Usina:");
				System.out.println("[1] Petróleo.");
				System.out.println("[2] Carvão.");
				System.out.println("[3] Nuclear.");

				aux = sc.nextLine();

				while (!aux.matches("[1-3]")) {
					System.out.print("Opção inválida, tente novamente: ");
					aux = sc.nextLine();
				}

				switch (aux) {
					case "1":
						conglomerado.cadastraUsina(new UsinaNaoRenovavel(nome, producaoMWh, custoMHw, Combustiveis.PETROLEO));
						break;
					case "2":
						conglomerado.cadastraUsina(new UsinaNaoRenovavel(nome, producaoMWh, custoMHw, Combustiveis.CARVAO));
						break;
					case "3":
						conglomerado.cadastraUsina(new UsinaNaoRenovavel(nome, producaoMWh, custoMHw, Combustiveis.NUCLEAR));
						break;
					default:
						System.out.println("Não foi possível identificar o tipo de combustível, tente novamente!");
				}
			}
		}
		catch (Exception e) {
			System.out.println("Algum erro foi encontrado! Entre em contato com o suporte técnico");
			System.out.println(e.getMessage());
		}
	}

	private void pesquisarUmaUsina() {
		try {

		} catch (Exception e) {

		}
	}

	private void listaTodasUsinas() {
		try {
			System.out.println();

			if (conglomerado.listaTodasUsinas() != null){
				for (Usina obj: conglomerado.listaTodasUsinas()){
					System.out.println(obj.geraDescricao() + "\n");
				}
			}
			else {
				System.out.println("Nenhuma usina cadastrada.");
			}
		} catch (Exception e) {
			System.out.println("Algum erro foi encontrado! Entre em contato com o suporte técnico");
			System.out.println(e.getMessage());
		}
	}

	private void consultaPrecoMWh() {
		try {
			System.out.print("Insira o nome da Usina: ");
			String nome = sc.nextLine();

			while (nome.length() <= 0){
				System.out.print("O nome da usina é obrigatório! Tente novamente: ");
				nome = sc.nextLine();
			}

			double preco = conglomerado.consultaPreco(nome);

			if (preco == -1) 
				System.out.println("\nNenhuma Usina foi localizada com esse nome.");
			else
				System.out.println("\nO preço do MWh dessa usina é: R$" + preco);

		} catch (Exception e) {

		}
	}

	private void salvarDadosArquivo() {
		try {

		} catch (Exception e) {

		}
	}
}
