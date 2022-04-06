class Telephone:
    def __init__(self):
        self.__numero_serle="44262566" 
        self._code_pin="1234"
        self.modele="Nokia 6800"
        self.numero="0606060"

    def _chercheReseau(self):
        print("Bienvenue dans le monde merveilleux")

    def _recupMessage(self):
        print("pas de message")

    def allumer(self,codepin):
        if self._code_pin==codepin:
            print("code pin oui")
            self._chercheReseau()
            self._recupMessage()
        else:
            print("Mauvais code Pin")


nokia = Telephone()
nokia.allumer('1233')
nokia.allumer('1234')
