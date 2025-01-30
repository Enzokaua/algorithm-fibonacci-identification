# Algoritmo de Busca no Fibonacci (Fibonacci Index Finder)

> Este repositório contém a implementação de um algoritmo que localiza o índice de um número na sequência de Fibonacci. O projeto foi desenvolvido para fins de estudo e prática de algoritmos matemáticos, com foco em compreensão e eficiência.

## 💻 Pré-requisitos

Para executar este projeto, certifique-se de ter as seguintes ferramentas configuradas no seu ambiente:

- **Java 21** ou superior;
- **Apache Maven** para gerenciamento de dependências e build do projeto;
- Editor ou IDE de sua escolha (IntelliJ IDEA, Eclipse, VS Code, etc.).

## 🚀 Sobre o projeto

A sequência de Fibonacci é uma sucessão de números em que cada número subsequente é a soma dos dois anteriores. Este projeto implementa um algoritmo que determina o índice de um número fornecido na sequência. Caso o número não faça parte da sequência, uma mensagem informativa será exibida.

### ✨ Funcionalidades

- Localizar o índice de um número na sequência de Fibonacci;
- Verificar se um número pertence ou não à sequência;
- Entrada customizável para qualquer número inteiro positivo;
- Mensagens informativas para números fora da sequência.

### 🛠️ Tecnologias Utilizadas

- **Java**: Linguagem de programação principal do projeto;
- **Apache Maven**: Ferramenta de build e gerenciamento de dependências;
- **Java Simple**: Estilo direto e simplificado para a implementação dos algoritmos.

## 📚 Como Funciona o Algoritmo

O algoritmo utiliza uma abordagem iterativa para gerar a sequência de Fibonacci até localizar o número desejado ou ultrapassá-lo:

1. Inicialize os dois primeiros números da sequência como 0 e 1.
2. Avance na sequência somando os dois números anteriores.
3. Compare o número gerado com o número fornecido:
   - Se forem iguais, o índice é retornado.
   - Se o número gerado for maior que o fornecido, conclui-se que o número não pertence à sequência.
4. Continue até encontrar o número ou ultrapassá-lo.

### Exemplo

**Entrada:** 21  
**Saída:** O número 21 está na posição 8 da sequência de Fibonacci.

**Entrada:** 10  
**Saída:** O número 10 não pertence à sequência de Fibonacci.

A complexidade do algoritmo é:
- **Tempo:** O(n), onde *n* é a posição do número na sequência.
- **Espaço:** O(1), pois utiliza apenas variáveis para armazenar valores intermediários.

## 🛠️ Configuração e Execução

1. Clone este repositório:
   ```bash
   git clone https://github.com/enzokaua/algorithm-fibonacci-identification.git
