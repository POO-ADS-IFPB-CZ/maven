package org.example;

import org.example.model.Pessoa;
import java.time.LocalDate;

public class Main {
    static void main() {
        Pessoa pessoa = new Pessoa("111.111.111-01",
                "João", LocalDate.now());
        pessoa.setCpf("222.222.222-02");

    }
}
