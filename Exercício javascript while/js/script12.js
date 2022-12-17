var valor = 0;

while (valor >= 0) {
    var valor = parseInt(prompt("Digite um valor positivo inteiro (valor negativo para encerrar):"));
    if (valor > maior) {
        var maior = valor;
    } else {
        var menor = valor;
    }
}

alert("Maior numero "+ maior);
alert("Menor numero "+ menor);