package com.agencia_Viagens.Cadastro.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Bilhete implements Serializable {	
	
	
	private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private long id;
		
		private String localsaida;
		
		private String localchegada;
		
		private double valor;
		
		@OneToMany
		private List<Cadastro> cadastro;
		
		public Bilhete(){
		}

		public Bilhete(long id, String localsaida, String localchegada, double valor) {
			super();
			this.localsaida = localsaida;
			this.localchegada = localchegada;
			this.valor = valor;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getLocalsaida() {
			return localsaida;
		}

		public void setLocalsaida(String localsaida) {
			this.localsaida = localsaida;
		}

		public String getLocalchegada() {
			return localchegada;
		}

		public void setLocalchegada(String localchegada) {
			this.localchegada = localchegada;
		}

		public double getValor() {
			return valor;
		}

		public void setValor(double valor) {
			this.valor = valor;
		}

		@Override
		public int hashCode() {
			return Objects.hash(id);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Bilhete other = (Bilhete) obj;
			return id == other.id;
		}

		@Override
		public String toString() {
			return "Bilhete [id=" + id + ", localsaida=" + localsaida + ", localchegada=" + localchegada + ", valor="
					+ valor + "]";
		}
		
}
