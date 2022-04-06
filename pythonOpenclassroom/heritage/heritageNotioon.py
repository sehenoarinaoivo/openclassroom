class Shapes:
    def __init__(self):
        print ("je suis shapes")
    
class rectangle(Shapes):
    def __init__(self):
        Shapes.__init__(self)
        print ("je suis rectangle")

    def area(self):
        print ("recltangle area")


class circle(Shapes):
    def __init__(self):
        Shapes.__init__(self)
        print ("je suis circle")

    def area(self):
        print ("area circle")

##programme principale

shapes = []
shapes.append(rectangle())
shapes.append(circle())

for i in shapes:
    print(i.area())
