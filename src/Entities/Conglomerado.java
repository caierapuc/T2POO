package Entities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Conglomerado {
	private ArrayList<Usina> usinas;

	public Conglomerado(){
		this.usinas = new ArrayList<Usina>();
	}

	public boolean cadastraUsina(Usina usina) {
		boolean success = false;

		if (usina != null){
			if (this.usinas.contains(usina))
				return success;
			this.usinas.add(usina);
			success = true;
		}
		return success;
	}

	public Usina pesquisaUsina(String nome) {
		Usina obj = null;

		for (Usina usina: usinas){
			if (obj == null){
				if (usina.getNome().equals(nome))
					obj = usina;
			}
		}

		return obj;
	}

	public ArrayList<Usina> listaTodasUsinas() {
		if (this.usinas.size() > 0)
			return (ArrayList<Usina>)this.usinas.clone();
		return null;
	}

	public double consultaPreco(String nome) {
		double preco = -1.0;

		for (Usina usina: usinas){
			if (preco == -1.0){
				if (usina.getNome().equals(nome))
					preco = usina.calculaPrecoMWh();
			}
		}

		return preco;
	}

	public boolean salvaDadosArquivo(String nomeArquivo) throws IOException {
        String separador = System.getProperty("file.separator");
		File file = new File(new File("").getAbsolutePath() + separador + "out" + separador + nomeArquivo + ".csv");

		if (file.exists());
			file.delete();
		file.createNewFile();

		try (FileWriter fw = new FileWriter(file)) {
			for (Usina obj: this.usinas){
				fw.append(obj.geraResumo());
			}
			fw.close();
		}

		if (file.exists())
			return true;
		return false;
	}

}
