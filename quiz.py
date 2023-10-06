acerto = int(0)
erro = int(0)
#Funções de verificação

#verdadeiro Ou falso
def vVF(resp):
    global acerto, erro
    if resp == 1:
        acerto = acerto + 1
        print('Acertou!')
    elif resp == 2:
        erro = erro + 1
        print('Errou!')
    else:
        print('Resposta inválida!')

print('HTML é uma linguagem de marcação? ')
resp = int(input('1 = Verdadeiro, 2 = Falso '))
vVF(resp)

print('O personagem Chaves é de um seriado de mesmo nome?')
resp = int(input('1 = Verdadeiro, 2 = Falso '))
vVF(resp)
print("Você acertou {} perguntas e errou {}".format(acerto, erro))

