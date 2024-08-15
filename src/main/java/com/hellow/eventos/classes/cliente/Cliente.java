package com.hellow.eventos.classes.cliente;

import com.hellow.eventos.classes.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "cliente")
@Table(name = "cliente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    private String nome;

    private String sobrenome;

    private Integer cpf;

    private Integer telefone;

    private String email;

    @ManyToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco_id;
}
