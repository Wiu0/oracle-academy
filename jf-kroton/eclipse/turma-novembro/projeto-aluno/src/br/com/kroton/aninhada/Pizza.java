package br.com.kroton.aninhada;

public class Pizza {
	
	private boolean queijo;
	private boolean calabresa;
	private int tamanho;

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (calabresa ? 1231 : 1237);
		result = prime * result + (queijo ? 1231 : 1237);
		result = prime * result + tamanho;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pizza other = (Pizza) obj;
		if (calabresa != other.calabresa)
			return false;
		if (queijo != other.queijo)
			return false;
		if (tamanho != other.tamanho)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pizza [queijo=" + queijo + ", calabresa=" + calabresa + ", tamanho=" + tamanho + "]";
	}

	private Pizza() {
		
	}
	
	public boolean isQueijo() {
		return queijo;
	}
	public void setQueijo(boolean queijo) {
		this.queijo = queijo;
	}
	public boolean isCalabresa() {
		return calabresa;
	}
	public void setCalabresa(boolean calabresa) {
		this.calabresa = calabresa;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public static class Builder{
		
		private boolean queijo = false;
		private boolean calabresa = false;
		private int tamanho = 0;
		
		public void adicionaQueijo() {
			queijo = true;
		}
		
		public void adicionaCalabresa() {
			calabresa = true;
		}
		
		public void tamanhoGrande() {
			tamanho = 18;
		}
		
		public void tamanhoPequeno() {
			tamanho = 18;
		}
		
		public Pizza build() {
			Pizza p = new Pizza();
			p.setCalabresa(calabresa);
			p.setQueijo(queijo);
			p.setTamanho(tamanho);
			return p;
		}
	}
}
