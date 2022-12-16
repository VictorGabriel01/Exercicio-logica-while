var contadora = 1;
var soma = 0;

while (contadora < 501) {
    if (contadora  % 2 == 0) {
        var soma = soma+contadora;
    }
    contadora++;
}
document.write("A soma dos valores é "+ soma);