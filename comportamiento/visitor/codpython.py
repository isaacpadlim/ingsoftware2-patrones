class Visitor:
    def visit(self, element):
        pass

class Element:
    def accept(self, visitor):
        pass

class Book(Element):
    def accept(self, visitor):
        visitor.visit(self)

class PriceVisitor(Visitor):
    def visit(self, element):
        print("Calculando precio del libro")

book = Book()
visitor = PriceVisitor()
book.accept(visitor)