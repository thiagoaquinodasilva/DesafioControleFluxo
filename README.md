# Desafio Controle de Fluxo

Este projeto é um exercício de programação em Java que visa praticar o uso de estruturas de controle de fluxo, como condicionais, laços e exceções. O projeto consiste em uma classe chamada Contador, que recebe dois números inteiros como parâmetros e imprime os números incrementados entre eles. Por exemplo, se os parâmetros forem 12 e 30, o programa deve imprimir:

```
Imprimindo o número 1
Imprimindo o número 2
...
Imprimindo o número 18
```

O programa também valida se o primeiro parâmetro é menor ou igual ao segundo, caso contrário, ele lança uma exceção customizada chamada ParametrosInvalidosException, que mostra a mensagem: "O segundo parâmetro deve ser maior que o primeiro". O programa usa um Scanner para ler os parâmetros do usuário pelo terminal e usa um bloco try-catch para tratar a exceção.

## Como executar

Para executar este projeto, você precisa ter instalado o Java Development Kit (JDK) na sua máquina. Você também pode usar um ambiente de desenvolvimento integrado (IDE) que suporte Java, como o Visual Studio Code. Siga os passos abaixo para executar o projeto:

- Clone ou baixe este repositório para a sua máquina.
- Abra o terminal e navegue até a pasta onde o projeto está salvo.
- Compile os arquivos Java usando o comando `javac *.java`. Isso vai gerar arquivos `.class` correspondentes aos arquivos `.java`.
- Execute o programa usando o comando `java Contador`. Isso vai iniciar o programa e pedir que você digite dois números inteiros como parâmetros para o método contar.
- Digite os números desejados e pressione Enter. O programa vai mostrar a impressão dos números incrementados ou a mensagem de erro da sua exceção customizada, dependendo dos valores que você digitou.

## Como contribuir

Este projeto é um exercício pessoal e não tem a intenção de receber contribuições externas. No entanto, se você tiver alguma sugestão ou feedback sobre o código, você pode abrir uma issue ou enviar um pull request. Eu ficarei feliz em ouvir a sua opinião. 😊
