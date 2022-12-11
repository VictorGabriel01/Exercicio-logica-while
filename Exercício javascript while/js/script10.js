var contadora = 49;
while (contadora < 70) {
    contadora++;
    if (contadora % 2 == 0) {
        var soma = soma+contadora;
        alert(contadora);
    }
}
alert("A soma dos numeros pares de 50 a 70 é: " + soma);