from .plugins import ma
from .models import Book, Author


class SimpleBookSerializer(ma.ModelSchema):
    publication_date = ma.DateTime(format='%Y-%m-%d')

    class Meta:
        model = Book
        fields = ('_id', 'name', 'publication_date')


class BookSerializer(ma.ModelSchema):
    author = ma.Nested('SimpleAuthorSerializer')
    publication_date = ma.DateTime(format='%Y-%m-%d')

    class Meta:
        model = Book
        fields = ('_id', 'name', 'publication_date', 'author', 'author_id')


class SimpleAuthorSerializer(ma.ModelSchema):
    birth_date = ma.DateTime(format='%Y-%m-%d')

    class Meta:
        model = Authorfields = ('name', 'dni', 'birth_date')


class AuthorSerializer(ma.ModelSchema):
    books = ma.Nested('SimpleBookSerializer', many=True)
    bith_date = ma.DateTime(format='%Y-%m-%d')

    class Meta:
        model = Author
        fields = ('_id', 'name', 'dni', 'birth_date', 'books')
