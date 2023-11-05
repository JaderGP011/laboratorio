preco = float(input("Qual o preço do ingresso?"))
est = input('Você é estudante?')
ing = 00.00
if est.casefold() == "sim":
    ing = (ing/100)*50
else: 
    print('')