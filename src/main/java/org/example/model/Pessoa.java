package org.example.model;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Pessoa {

    private String cpf;
    private String nome;
    private LocalDate nascimento;

}