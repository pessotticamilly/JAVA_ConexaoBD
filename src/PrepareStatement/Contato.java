package PrepareStatement;

import java.util.Objects;

public class Contato {
    Integer id, idade;
    String nome, email, telefone;

    public Contato(Integer id, String nome, Integer idade, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
    }

    public Contato(String nome, int idade, String email, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "\nContato {" +
                "id=" + id +
                ", nome='" + nome +
                ", idade=" + idade +
                ", email='" + email +
                ", telefone='" + telefone +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(idade, contato.idade) && Objects.equals(nome, contato.nome) && Objects.equals(email, contato.email) && Objects.equals(telefone, contato.telefone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idade, nome, email, telefone);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
