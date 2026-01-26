# Geral — Estrutura Básica do Java

Este arquivo tem como objetivo armazenar regras e conceitos fundamentais do Java, servindo como material de apoio durante os estudos.

O Java é uma linguagem orientada a objetos, o que significa que todo o código é organizado em classes, e a execução acontece através de métodos.

Em projetos Java, teremos muitas classes e muitos métodos, porém existem algumas regras importantes que devem ser seguidas.

---

## 1. Classes e Arquivos `.java`

### Regra
Um arquivo `.java` pode conter várias classes, porém:
- Apenas uma classe pode ser public
- O nome do arquivo deve ser o mesmo nome da classe public

### Exemplo válido
Arquivo: Usuario.java

    public class Usuario {
        String nome;
    }

    class Endereco {
        String cidade;
    }

Correto: apenas Usuario é public e o arquivo se chama Usuario.java.

### Exemplo inválido

    public class Usuario {
    }

    public class Endereco {
    }

Erro: não é permitido mais de uma classe public no mesmo arquivo.

---

## 2. Método main (Ponto de Entrada do Programa)

### Regra
Todo programa Java precisa de um método main com a seguinte assinatura fixa:

    public static void main(String[] args)

Essa assinatura não pode ser alterada.

### Motivo
A JVM (Java Virtual Machine) procura exatamente esse método para iniciar a execução do programa.

### Exemplos inválidos

    static void main(String[] args) { }        // não é public
    public void main(String[] args) { }        // não é static
    public static int main(String[] args) { }  // não é void
    public static void start(String[] args) { } // nome incorreto

---

## 3. Nome da Classe com main

### Regra
A classe que contém o método main não precisa se chamar Main.

### Exemplo válido

    public class Aplicacao {
        public static void main(String[] args) {
            System.out.println("Programa iniciado");
        }
    }

O Java não se importa com o nome da classe, apenas com a existência do método main.
O nome Main é apenas uma convenção, não uma regra.

---

## 4. Outros Métodos na Classe que Possui o main

### Regra
A classe que contém o método main é uma classe comum e pode conter:
- Outros métodos
- Atributos
- Métodos public, private, protected

### Exemplo

    public class Programa {

        public static void main(String[] args) {
            iniciarSistema();
            mostrarMensagem();
        }

        public static void iniciarSistema() {
            System.out.println("Sistema iniciado");
        }

        public static void mostrarMensagem() {
            System.out.println("Bem-vindo!");
        }
    }

Isso é totalmente válido.

---

## 5. Vários Métodos main no Projeto

### Regra
Um projeto Java pode ter várias classes com método main.

### Exemplo

    public class MainApp {
        public static void main(String[] args) {
            System.out.println("Executando MainApp");
        }
    }

    public class Teste {
        public static void main(String[] args) {
            System.out.println("Executando Teste");
        }
    }

Isso é permitido.

### Como é escolhido qual main será executado?

O Java não escolhe automaticamente.
Quem escolhe é:
- A IDE (IntelliJ, Eclipse, VS Code)
- Ou o comando utilizado no terminal

Exemplo no terminal:

    java MainApp

Executa o main da classe MainApp.

    java Teste

Executa o main da classe Teste.

Apenas uma classe é executada por vez.

---

## 6. Boa Prática (Não é Regra)

Embora seja permitido ter lógica dentro do main, a boa prática é:
- O main apenas inicia o sistema
- A lógica fica em outras classes

### Exemplo recomendado

    public class Main {
        public static void main(String[] args) {
            Sistema sistema = new Sistema();
            sistema.iniciar();
        }
    }

    public class Sistema {
        public void iniciar() {
            System.out.println("Sistema rodando...");
        }
    }

---

## Resumo Geral

- Um arquivo .java pode ter várias classes
- Apenas uma classe pode ser public
- O método main tem assinatura fixa
- A classe com main não precisa se chamar Main
- Um projeto pode ter vários métodos main
- Apenas um main é executado por vez
- Separar responsabilidades é boa prática
