package com.hellow.eventos.classes.endereco;

import com.hellow.eventos.classes.tipo.Tipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "endereco")
@Table(name = "endereco")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer endereco_id;
    private String logradouro;
    private String nome;
    private Integer numero;
    private String  cep;
    private String bairo;
    private String cidade;
    private String estado;
    private String pais;
    private String complemento;

    @ManyToOne
    @JoinColumn(name = "tipo_id")
    private Tipo tipo;
}
