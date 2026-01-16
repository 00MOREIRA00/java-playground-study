# Arrays 

Um Array é uma estrutura de dados que armazenam uma sequencia de elementos de um mesmo tipo.

Em Java, um array tem:

* tamanho fixo
* Armazena valores do mesmo type 
* Cada posição é acessada por um indice 

### Como declarar ?

```java
    # Criando 
    String[] nomes;

    # Criando e declarando 
    String[] nomes = new String[5];
```

### Adicionando elementos 

```java
    nomes[0] = "Aluno 1";
    nomes[1] = "Aluno 2";
    
    # Adicionando na criação

    String[] nomes = new String["Aluno 1", "Aluno 2", "Aluno 3"];
```