names = ['Fransisco', 'Adrian', 'Carlos']

ages = [18, 50, 15]

#print('I have this names: {} with this ages: {}'.format(names,ages))
#names.append('Christian')
#names.extend(['Christian','Ivan'])
#ivan = names.pop()

names.insert(1,'Ivan')
print(names)

#ESTRUCTURAS DE CONTROL
name = 'Aldo1'

if name == 'Aldo':
    print(True)
elif name == 'Aldo1':
    print('Your name is {}'.format(name))

else:
    print(False)

#for
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

#while
names = ['Fransisco', 'Adrian', 'Carlos']
while names:
    print(names.pop())

#funciones
names = ['Fransisco', 'Adrian', 'Carlos']
ages = [18, 50, 15]

str_ages = list(map(str,ages))

print(ages)
print(str_ages)

def pretty_print_list(input_ist: list): #typehinting
    print(' -> '.join(input_ist))

pretty_print_list(names)
pretty_print_list(str_ages)

proc_list =[pretty_print_list,print]

proc_list[0](names)
proc_list[0](str_ages)
proc_list[1](str_ages)
#proc_list[2](str_ages)

#clases
class Student:

    def __init__(self, _id, _name, _age, _cell_number):
        self.id = _id
        self.name = _name
        self.age = _age

        class CellPhone:
            def __init__(self,number):
                self.number = number
    
    def __repr__(self):
        return 'Student({})'.format(self.__dict__)

    print(Student('L00358209','Aldo',26,'0998808598')).CellPhone

#paquetes
from funciones import pretty_print_list

pretty_print_list(['1','2'])

#compresion de listas
squared_nums=[num**2 for num in range(10)]
print(squared_nums)

student = {
    'name': "Aldo",
    'age': 26
}

print(student)

#Expresiones Ternarias

a= 20 if squared_nums[0]==0 else 10 if squared_nums[0]==0 else 5

#funciones de orden superior

def printer(print_func, input_list)

#nombre,cedula,carrera.fechanacimiento


