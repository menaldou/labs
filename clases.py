class Student:

    def __init__(self, _id, _name, _age, _number):
        self.id = _id
        self.name = _name
        self.age = _age

        class CellPhone:
            def __init__(self,number):
                self.number = _number
    
    def __repr__(self):
        return 'Student({})'.format(self.__dict__)

    print(Student('L00358209','Aldo',26,'0998808598')).CellPhone