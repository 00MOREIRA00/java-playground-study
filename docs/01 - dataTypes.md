# Data Types (Tipos de Dados)

Os **tipos de dados** definem **qual tipo de informação uma variável pode armazenar** em Java.  
Eles também determinam **quanto espaço será usado na memória** e **quais operações podem ser realizadas** sobre esses dados.

Em Java, os tipos de dados são divididos em **dois grandes grupos**:
- **Tipos Primitivos**
- **Tipos de Referência**

---

## Tipos Primitivos

Os **tipos primitivos** armazenam **valores simples diretamente na memória**.  
Isso significa que a variável contém o **valor em si**, e não um endereço para outro local.

Eles são usados para representar informações básicas, como números, caracteres e valores lógicos.

### Tipos primitivos existentes em Java

#### `byte`
- Armazena **números inteiros pequenos**
- Usado quando se deseja economizar memória
- Intervalo aproximado: -128 até 127

---

#### `short`
- Armazena **números inteiros**
- Possui mais espaço que o `byte`
- Intervalo maior, mas ainda limitado

---

#### `int`
- Armazena **números inteiros**
- É o tipo inteiro mais utilizado no dia a dia
- Ideal para contadores, idades, quantidades, etc.

---

#### `long`
- Armazena **números inteiros grandes**
- Usado quando o valor ultrapassa o limite do `int`
- Muito comum em cálculos financeiros e grandes contagens

---

#### `float`
- Armazena **números decimais**
- Possui menor precisão
- Geralmente usado quando a precisão não é crítica

---

#### `double`
- Armazena **números decimais com maior precisão**
- Mais usado que o `float`
- Ideal para cálculos matemáticos e científicos

---

#### `char`
- Armazena **um único caractere**
- Representa letras, números ou símbolos
- Baseado na tabela Unicode

---

#### `boolean`
- Armazena **valores lógicos**
- Pode ser apenas:
    - `true` (verdadeiro)
    - `false` (falso)

---

📌 **Características dos tipos primitivos**
- Armazenam valores simples
- Ocupam espaço fixo na memória
- Não possuem métodos
- São mais rápidos de acessar

---

## Tipos de Referência

Os **tipos de referência** não armazenam o valor diretamente.  
Eles armazenam **uma referência (endereço)** para um objeto que está localizado em outro lugar da memória.

Isso permite trabalhar com **estruturas mais complexas**, que podem conter vários dados e comportamentos.

### Exemplos de tipos de referência e o que eles armazenam

#### `String`
- Armazena **texto**
- Pode conter uma sequência de caracteres
- Exemplo de uso: nomes, frases, mensagens

---

#### Arrays
- Armazenam **uma coleção de valores do mesmo tipo**
- Os valores ficam organizados em posições (índices)
- Muito usados para listas simples

---

#### Classes
- Representam **modelos de objetos**
- Podem armazenar dados (atributos) e comportamentos (métodos)
- São a base da Programação Orientada a Objetos

---

#### Interfaces
- Definem **contratos**
- Especificam quais métodos uma classe deve implementar
- Não armazenam dados diretamente

---

#### Collections
- Armazenam **grupos de objetos**
- São mais flexíveis que arrays
- Exemplos comuns: listas, conjuntos e mapas

---

📌 **Características dos tipos de referência**
- Armazenam referências para objetos
- Podem representar estruturas complexas
- Possuem métodos
- Podem ser compartilhados entre variáveis

---

## Resumo Geral

| Categoria | O que é armazenado |
|---------|------------------|
| Tipo Primitivo | O valor diretamente |
| Tipo de Referência | Uma referência para um objeto na memória |

---

