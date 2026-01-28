class Game:
    def play(self):
        self.start()
        self.end()

    def start(self):
        pass

    def end(self):
        pass

class Football(Game):
    def start(self):
        print("Inicia el partido de fútbol")

    def end(self):
        print("Finaliza el partido")

game = Football()
game.play()