
	public abstract class Animal {

		private String tipo;
		abstract public void nomeAnimal(String nome);
		abstract public void  som(String emitirSom);
	
		
		public Animal(String tipo)
		{
			this.tipo = tipo;
		}
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

	}
