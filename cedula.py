def cedula_valida(ced):

valores = [ # variable que contiene un arreglo de los dígitos de la cédula
    int(ced[x]) # tomamos el dígito x y lo convertimos a entero
    * (2 - x % 2) # lo multiplicamos por 2 si es impar o por 1 si es par
    for x in range(9) ] # se aplica solo a los primeros 9 dígitos
# esto es equivalente a: [ ced[0] * 2, ced[1], ced[2] * 2, ..., ced[8] * 2 ]

suma = sum( # La suma de los dígitos
map(lambda x: x > 9 and x - 9 or x, # a cada dígito vamos a aplicar esta función
valores)) # que resta 9 si el dígito es mayor a 9

return (int(ced[9])
== 10 - # Restar de 10 el último dígito de la suma
int(str(suma)[-1:])) # Primero convertir la suma a string, tomar el
# último caracter y convertirlo de vuelta a entero

#Por ejemplo si utilizo la cédula 123456789? como ej estos serían los resultados parciales


valores => [ 2, 2, 6, 4, 10, 6, 14, 8, 18 ]
map(lambda x: x > 9 and x - 9 or x, valores) => [ 2, 2, 6, 4, 1, 6, 5, 8, 9 ]
suma => 43
int(str(suma)[-1:]) => 3
return => 7