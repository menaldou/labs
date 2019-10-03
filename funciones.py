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
