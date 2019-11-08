from multimethod import multimethod


class SpaceObject:
    pass


class Asteroid(SpaceObject):
    pass


class Spaceship(SpaceObject):
    pass


class Universe:
    @multimethod
    def collide(self, x: Asteroid, y: Asteroid):
        print("Asteroid <--> Asteroid")

    @multimethod
    def collide(self, x: Asteroid, y: Spaceship):
        print("Asteroid <--> Spaceship")

    @multimethod
    def collide(self, x: Spaceship, y: Asteroid):
        print("Spaceship <--> Asteroid")

    @multimethod
    def collide(self, x: Spaceship, y: Spaceship):
        print("Spaceship <--> Spaceship")


asteroid1 = Asteroid()
asteroid2 = Asteroid()
spaceship1 = Spaceship()
spaceship2 = Spaceship()

universe = Universe()

universe.collide(asteroid1, asteroid2)
universe.collide(asteroid1, spaceship2)
universe.collide(spaceship1, asteroid2)
universe.collide(spaceship1, spaceship2)
