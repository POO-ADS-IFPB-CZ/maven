package org.example.model;

import lombok.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Pessoa {

    private @NonNull String cpf;
    private @NonNull String nome;
    private @NonNull LocalDate nascimento;

}