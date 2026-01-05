# Variáveis e Escopos

Neste material vamos entender o que são variáveis, quais são os tipos de variáveis em Java e como funciona o escopo, ou seja, onde cada variável pode ser acessada dentro do código.

---

## Variáveis

Variáveis são espaços na memória utilizados para armazenar valores que podem ser utilizados durante a execução de um programa.

Em Java, as variáveis são classificadas de acordo com onde são declaradas e por quanto tempo existem.

---

## Tipos de Variáveis

### Variáveis Locais

As variáveis locais são declaradas dentro de métodos, construtores ou blocos de código (if, for, while, etc).

- Existem apenas durante a execução do bloco
- São destruídas ao final da execução
- Não possuem valor padrão
- Precisam ser inicializadas antes do uso

```java
public static void exemplo() {
    int numero = 10;
}
```

---

### Variáveis de Instância

As variáveis de instância são declaradas dentro da classe, porém fora dos métodos.

- Pertencem a um objeto (instância)
- Cada objeto possui sua própria cópia
- Representam o estado do objeto
- Possuem valores padrão

```java
public class Pessoa {
    String nome;
    int idade;
}
```

---

### Variáveis Estáticas (de Classe)

As variáveis estáticas são declaradas utilizando a palavra-chave static.

- Pertencem à classe, não ao objeto
- Existe apenas uma única cópia
- São criadas quando a classe é carregada pela JVM
- O valor é compartilhado entre todas as instâncias

```java
public class Config {
    static String versao = "1.0";
}
```

---

## Constantes

Constantes são variáveis cujo valor não pode ser alterado após a sua definição.

Em Java, constantes são declaradas utilizando a palavra-chave final. Normalmente são combinadas com static para representar valores globais da classe.

- O valor não pode ser modificado
- Melhoram a legibilidade do código
- Evitam mudanças acidentais

```java
public class Config {
    static final String CAMPANHA = "Digital";
}
```

---

## Escopo

O escopo define onde uma variável pode ser acessada dentro do código.

Em Java, o escopo é delimitado pelos blocos de código, definidos pelas chaves `{ }`.

---

### Escopo de Bloco

Variáveis declaradas dentro de um bloco só podem ser acessadas dentro daquele bloco.

```java
if (true) {
    int valor = 5;
}
```

---

### Escopo de Método

Variáveis declaradas dentro de um método podem ser utilizadas em qualquer ponto dentro do método, desde que estejam dentro do mesmo bloco.

```java
public static void exemplo() {
    int numero = 10;
    System.out.println(numero);
}
```

---

### Escopo de Classe

Variáveis declaradas no nível da classe (variáveis de instância ou estáticas) podem ser acessadas pelos métodos da classe.

```java
public class Exemplo {
    int valorInstancia = 10;
    static int valorEstatico = 20;

    public void mostrar() {
        System.out.println(valorInstancia);
        System.out.println(valorEstatico);
    }
}
```

---

## Resumo

- Variáveis armazenam valores na memória
- O tipo da variável define seu tempo de vida
- O escopo define onde a variável pode ser acessada
- Blocos `{ }` delimitam o escopo em Java
