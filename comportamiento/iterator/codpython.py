class Iterator:
    def __init__(self, items):
        self.items = items
        self.index = 0

    def __next__(self):
        if self.index < len(self.items):
            value = self.items[self.index]
            self.index += 1
            return value
        raise StopIteration

items = [1, 2, 3]
iterator = Iterator(items)
for i in iterator:
    print(i)