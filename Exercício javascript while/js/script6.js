var base = parseInt(prompt("Digite o valor da base: "));
var expo = parseInt(prompt("Digite o valor do expoente: "));
var resultado =1;
var contador = 1;
while (contador < expo) {
    var resultado = resultado * base;
    contador++;
}
alert("O valor da potência é: "+ resultado);