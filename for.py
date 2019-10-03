
names = ['Fransisco', 'Adrian', 'Carlos']
ages = [18, 50, 15]

#for i in range(10):
 #   print(i)    

for name_age in zip(names,ages):
    print(name_age)


#empaquetado de valores
age1, age2, age3, = ages

print('{} {} {}'.format(age1,age2,age3))

#desempauetado de valores
for name, age in zip(names,ages):
    print('{} -> {}'.format(name,age))


