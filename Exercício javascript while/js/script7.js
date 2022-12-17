var valor2 = 1;
var valor3 = 1;
var valor1 = 1;
var contador = 3;
while (contador < 18) {
    var valor3 = valor1 + valor2;
    alert(valor3)
    var valor1 = valor2;
    var valor2 = valor3;
    contador++; 
}