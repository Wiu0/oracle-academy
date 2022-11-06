package desafio.nivel_hardcore.sorteio;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

	private List<String> recheio;
	private String tamanho;
	
	
	private Pizza(List<String> recheio, String tamanho) {
		this.recheio = recheio;
		this.tamanho = tamanho;
	}

	
	static class Builder {
		List<String> recheio = new ArrayList<>();
		String tamanho;
		
		public Builder comRecheio(String recheio) {
			this.recheio.add(recheio);
			return this;
		}
		
		public Builder pequena() {
			tamanho = "pequena";
			return this;
		}
		
		public Builder media() {
			tamanho = "media";
			return this;
		}
		
		public Builder grande() {
			tamanho = "grande";
			return this;
		}
		
		public Pizza build() {
			return new Pizza(recheio, tamanho);
		}
	}
	
	@Override
	public String toString() {
		return tamanho + " recheios: " + recheio;
	}
	
	public static void main(String[] args) {
		Pizza p = new Pizza.Builder()
		.pequena()
		.comRecheio("queijo")
		.comRecheio("calabresa")
		.build();
		
		System.out.println(p);
	}
}
