acerto = 0 
erro = 0 
function Verdadeiro() {

let resp = document.querySelector("input#V, input#F")
let acerto
let erro
function calcularResultado() {
    const respostas = document.querySelector("input#V, input#F");
    let pontuacao = 0;

    for (const resposta of respostas) {
        if (resposta.value === "Paris" || resposta.value === "Júpiter") {
            pontuacao++;
        }
    }

    const resultado = document.getElementById('result');
    resultado.textContent = `Você acertou ${pontuacao} de ${respostas.length} perguntas.
}