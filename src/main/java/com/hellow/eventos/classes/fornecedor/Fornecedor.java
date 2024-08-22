package com.hellow.eventos.classes.fornecedor;

import com.hellow.eventos.classes.endereco.Endereco;
import com.hellow.eventos.classes.tipo.Tipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "fornecedor")
@Table(name = "fornecedor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Fornecedor {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    private String nome;

    private String cnpj;

    private boolean ativo;

    @ManyToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;
    @ManyToOne
    @JoinColumn(name = "tipo_id")
    private Tipo tipo;

}
