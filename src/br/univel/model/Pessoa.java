package br.univel.model;

import java.time.LocalDate;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Pessoa {
	public class Person {
		private final IntegerProperty id;
		private final StringProperty nome;
		private final StringProperty telefone;

		public Pessoa() {
			this(null, null);
		}

		public Person(String nome, String telefone, int id) {
			this.id = new SimpleIntegerProperty(id);
			this.nome = new SimpleStringProperty(nome);
			this.telefone = new SimpleStringProperty(telefone);

		}

		public int getFid() {
			return id.get();
		}

		public void setid(int id) {
			this.id.set(id);
		}

		public IntegerProperty idProperty() {
			return id;
		}

		public String getFirstName() {
			return nome.get();
		}

		public void setFirstName(String firstName) {
			this.nome.set(firstName);
		}

		public StringProperty firstNameProperty() {
			return nome;
		}

		public String getLastName() {
			return telefone.get();
		}

		public void setLastName(String lastName) {
			this.telefone.set(lastName);
		}

		public StringProperty lastNameProperty() {
			return telefone;
		}

	}

}
