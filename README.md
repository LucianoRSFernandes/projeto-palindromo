# Projeto Palíndromo

Um palíndromo é uma palavra, frase, número ou outra sequência de caracteres que lê o mesmo de trás para frente, ou seja, de forma idêntica. Espaços e pontuações são geralmente ignorados e letras maiúsculas ou minúsculas são consideradas iguais.

## Como o programa funciona

**main Método:**

Cria um objeto *Scanner* para ler a entrada do usuário.

Solicita que o usuário digite uma palavra ou frase.

Chama o método *isPalindrome* para verificar se a entrada é um palíndromo.

Imprime o resultado apropriado para o usuário.

**isPalindrome Método:**

*Limpeza da String:*

    *text.toLowerCase():* Converte toda a string de entrada para letras minúsculas. Isso garante que a comparação de caracteres seja insensível a maiúsculas e minúsculas (por exemplo, 'A' é tratado como 'a').

    *.replaceAll("[^a-z0-9]", ""):* Remove todos os caracteres que não são letras (a-z) ou números (0-9). Isso significa que espaços, pontuações, etc., são ignorados na verificação do palíndromo. A expressão regular [^a-z0-9] significa "qualquer coisa que NÃO seja uma letra minúscula ou um dígito".

*Array de Caracteres:*

    *cleanText.toCharArray():* Converte a string limpa (sem maiúsculas, minúsculas, espaços ou pontuações) em um array de caracteres. Isso facilita o acesso a caracteres individuais por índice.

*Verificação com Dois Ponteiros:*

    *left e right:* Duas variáveis de inteiro são usadas como ponteiros. left começa no início do array de caracteres (índice 0) e right começa no final do array (charArray.length - 1).

    *while (left < right):* O loop continua enquanto o ponteiro esquerdo for menor que o ponteiro direito. Isso garante que você não ultrapasse o ponto médio da string.

    *if (charArray[left] != charArray[right]):* Dentro do loop, os caracteres nos índices left e right são comparados. Se eles não forem iguais, a string não é um palíndromo, e o método retorna false imediatamente.

    *left++ e right--:* Se os caracteres forem iguais, os ponteiros são movidos um passo em direção ao centro da string. left avança e right retrocede.
    
    *Retorno true:* Se o loop for concluído sem encontrar caracteres diferentes, significa que todos os caracteres correspondentes eram iguais, e a string é um palíndromo. Nesse caso, o método retorna true.

Este programa é robusto o suficiente para lidar com frases com espaços, pontuações e diferentes casos, seguindo a definição comum de palíndromo.


## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
