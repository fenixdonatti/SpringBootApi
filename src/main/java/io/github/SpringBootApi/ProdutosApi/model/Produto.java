package io.github.SpringBootApi.ProdutosApi.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Produto {

    private String id;
    private String nome;
    private String descricao;
    private Double preco;

    @Override
    public String toString() {
        return "Produto{id='" + id + "', nome='" + nome + "', descricao='" + descricao + "', preco=" + preco + "}";
    }

}
