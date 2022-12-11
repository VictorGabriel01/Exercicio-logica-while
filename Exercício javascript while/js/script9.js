while (contadora < 10) {
    var valor = parseInt(prompt("Digite um valor:"));
    var soma = soma + valor;
    contadora++;
}
var media = soma / 10;
alert("A somatoria de todos os valores digitado é: "+ soma+ "e a media dessa somatoria é: "+ media);