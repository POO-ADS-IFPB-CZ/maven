package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.example.model.Pessoa;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Main {
    static void main() {

        Gson gson = new Gson();
        Set<Pessoa> pessoas = new HashSet<>();

        pessoas.add(new Pessoa("111.111.111-01","João",
                LocalDate.now()));
        pessoas.add(new Pessoa("222.222.222-02", "Maria",
                LocalDate.now()));
        pessoas.add(new Pessoa("333.333.333-03", "Pedro",
                LocalDate.now()));

        String json = gson.toJson(pessoas);
        System.out.println(json);

        Type tipoColecao = new TypeToken<HashSet<Pessoa>>(){}.getType();
        Set<Pessoa> pessoas2 = gson.fromJson(json, tipoColecao);
        System.out.println(pessoas2);

    }
}
