# 📦 Arrays em Java

Um array é uma estrutura de dados que armazena uma sequência de elementos do mesmo tipo.

Em Java, um array possui as seguintes características:
- Tamanho fixo (definido no momento da criação)
- Armazena valores do mesmo tipo
- Cada elemento é acessado por meio de um índice, que começa em 0

## Como declarar um Array

    String[] nomes;                 // Apenas declaração
    String[] nomes = new String[5]; // Declaração com tamanho definido

## Adicionando elementos ao Array

    nomes[0] = "Aluno 1";
    nomes[1] = "Aluno 2";

## Inicializando o Array já com valores

    String[] nomes = {"Aluno 1", "Aluno 2", "Aluno 3"};

## Percorrendo um Array

    for (int i = 0; i < nomes.length; i++) {
        System.out.println(nomes[i]);
    }

    for (String nome : nomes) {
        System.out.println(nome);
    }

## ArrayList em Java

O ArrayList é uma estrutura de dados semelhante ao array, porém com tamanho dinâmico.
Isso significa que é possível adicionar, remover e reorganizar elementos sem se preocupar com o tamanho.

## Como declarar um ArrayList

    import java.util.ArrayList;
    ArrayList<String> pessoas = new ArrayList<>();

## Adicionando elementos ao ArrayList

    pessoas.add("Aluno 1 do ArrayList");
    pessoas.add("Aluno 2 do ArrayList");

## Acessando elementos do ArrayList

    System.out.println(pessoas.get(0));
    System.out.println(pessoas.get(1));

## Removendo elementos do ArrayList

    pessoas.remove(0);

## Obtendo o tamanho do ArrayList

    System.out.println(pessoas.size());
