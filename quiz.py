acerto = 0
erro = 0

def vV(resp):  # Verficação Verdadeiro
    global acerto, erro
    if resp == 1:
        acerto += 1
        print("Acertou!")
    elif resp == 2:
        erro += 1
        print("Errou!")
    else:
        print("Responda apenas com 1 ou 2")


def vF(resp):  # Verificação falso
    global acerto, erro
    if resp == 1:
        erro += 1
        print("Acertou!")
    elif resp == 2:
        acerto += 1
        print("Errou!")
    else:
        print("Responda apenas com 1 ou 2")
def vV(resp): #Verficação Verdadeiro
    global acerto, erro
    if resp == 1:
        acerto += 1
        print('Acertou!')
    elif resp == 2:
        erro += 1
        print('Errou!')
    else:
        print('Responda apenas com 1 ou 2')

def vF(resp): #Verificação falso
    global acerto, erro
    if resp == 1:
        erro += 1
        print('Acertou!')
    elif resp == 2:
        acerto += 1
        print('Errou!')
    else:
        print('Responda apenas com 1 ou 2')

print('HTML é uma linguagem de marcação?')
resp = int(input('1 = Verdadeiro, 2 = Falso: '))
vV(resp)

print('O personagem Chaves é de um seriado de mesmo nome?')
resp = int(input('1 = Verdadeiro, 2 = Falso: '))
vV(resp)

print("Os Emirados Árabes estão no continente:\n 1) Americano\n 2) asiatico\n 3) Europeu")


print('Qual a Capital dos Estados Unidos?')
print('1) Nova York')
print('2) Orlando')
print('3) Washington, D.C')
resp = int(input('Digite o número da sua escolha: '))
vME(resp)

print(f"Você acertou {acerto} perguntas e errou {erro}.")


# Questão 01
print("HTML é uma linguagem de marcação?")
resp = int(input("1 = Verdadeiro, 2 = Falso: "))
vV(resp)
print("")
# Questão 02
print("O personagem Chaves é de um seriado de mesmo nome?")
resp = int(input("1 = Verdadeiro, 2 = Falso: "))
vV(resp)
print("")
# Questão 03
print(
    "Os Emirados Árabes estão no continente:\n 1) Americano\n 2) asiatico\n 3) Europeu"
)
# Verificação
if resp == 1:
    erro += 1
    print("Errou!")
elif resp == 2:
    acerto += 1
    print("Acertou!")
elif resp == 3:
    erro += 1
    print("Errou!!")
elif resp > 3:
    print("Responda apenas de 1 a 3")
# Questão 04
print("")
print(
    "Qual a Capital dos Estados Unidos? \n 1) Nova York \n 2) Orlando \n 3) Washington, D.C"
)
if resp == 1:
    erro += 1
    print("Errou!")
elif resp == 2:
    erro += 1
    print("Errou!")
elif resp == 3:
    acerto += 1
    print("Acertou!")
elif resp > 3:
    print("Responda apenas de 1 a 3")
resp = int(input("Digite o número da sua escolha: "))
print("")
print("")

print(f"Você acertou {acerto} perguntas e errou {erro}.")
