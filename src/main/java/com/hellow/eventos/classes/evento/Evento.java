package com.hellow.eventos.classes.evento;

import com.hellow.eventos.classes.endereco.Endereco;
import com.hellow.eventos.classes.tipo.Tipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity(name = "evento")
@Table(name = "evento")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Date data;
    private String descricao;
    private Integer lotacao;

    @ManyToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;
    @ManyToOne
    @JoinColumn(name = "tipo_id")
    private Tipo tipo;

}
