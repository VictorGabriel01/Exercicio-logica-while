while (opcao != "nao") {
    var comodo = prompt("Digite o nome do cômodo que deseja calcular a area: ");
    var largura = prompt("Digite o valor da largura do cômodo : ");
    var comprimento = prompt("Digite o valor do comprimento do cômodo : ");
    var area = comprimento*largura;
    alert("A area do(a) "+comodo+" é "+ area);
    var soma = soma + area
}
alert("A somatoria das area calculadas é "+ soma);