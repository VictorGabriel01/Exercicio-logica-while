Algoritmo "EXERCICIO 9"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 26/09/2022
Var
   // Seção de Declarações das variáveis
   valor,soma,contador,media:real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   enquanto contador < 10 faca
      escreval("Digite um valor: ")
      leia(valor)
      soma<- soma + valor
      contador<- contador+ 1
   fimenquanto
   media<- soma / 10
   escreval("A somatoria de todos os valores digitado é: ",soma," e a media dessa somatoria é: ",media)
Fimalgoritmo