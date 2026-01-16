package playground;

import java.util.ArrayList;

public class Arrays {
    public static void arrays(){
        String[] nomes = {"Aluno 1", "Aluno 2"};

        System.out.println(nomes[0]);
        System.out.println(nomes[1]);

        ArrayList<String> pessoas = new ArrayList<>();
        pessoas.add("Aluno 1 do Array List");
        pessoas.add("Aluno 2 Array List");

        System.out.println(pessoas.get(0));
        System.out.println(pessoas.get(1));
    }
}
