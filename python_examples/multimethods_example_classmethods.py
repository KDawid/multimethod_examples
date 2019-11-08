from multimethod import multimethod


class SpaceObject:
    @multimethod
    def collide(self, x):
        print("SpaceObject <--> SpaceObject")

    @multimethod
    def collide(self, x: 'Asteroid'):
        print("SpaceObject <--> Asteroid")

    @multimethod
    def collide(self, x: 'Spaceship'):
        print("SpaceObject <--> Spaceship")


class Asteroid(SpaceObject):
    @multimethod
    def collide(self, x):
        print("Asteroid <--> SpaceObject")

    @multimethod
    def collide(self, x: 'Asteroid'):
        print("Asteroid <--> Asteroid")

    @multimethod
    def collide(self, x: 'Spaceship'):
        print("Asteroid <--> Spaceship")


class Spaceship(SpaceObject):
    @multimethod
    def collide(self, x):
        print("Spaceship <--> SpaceObject")

    @multimethod
    def collide(self, x: 'Asteroid'):
        print("Spaceship <--> Asteroid")

    @multimethod
    def collide(self, x: 'Spaceship'):
        print("Spaceship <--> Spaceship")


o1 = SpaceObject()
o2 = SpaceObject()
a1 = Asteroid()
a2 = Asteroid()
s1 = Spaceship()
s2 = Spaceship()

o1.collide(o2)
print()
o1.collide(a2)
o1.collide(s2)
print()
a1.collide(o2)
s1.collide(o2)
print()
a1.collide(a2)
a1.collide(s2)
s1.collide(a2)
s1.collide(s2)
