from multimethod import multimethod


class SpaceObject:
    pass


class Asteroid(SpaceObject):
    pass


class Spaceship(SpaceObject):
    pass


class Alien(SpaceObject):
    pass


class NasaSpaceship(Spaceship):
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

    @multimethod
    def collide(self, x: SpaceObject, y: SpaceObject):
        print("SpaceObject <--> SpaceObject")


asteroid1 = Asteroid()
asteroid2 = Asteroid()
spaceship1 = Spaceship()
spaceship2 = Spaceship()

alien1 = Alien()
alien2 = Alien()

nasa1 = NasaSpaceship()
nasa2 = NasaSpaceship()

universe = Universe()
print('Multimethods work properly:')
universe.collide(asteroid1, asteroid2)
universe.collide(asteroid1, spaceship2)
universe.collide(spaceship1, asteroid2)
universe.collide(spaceship1, spaceship2)
print()
print('Alien is an unknown SapceObject, both arguments are casted to it:')
universe.collide(alien1, asteroid2)
universe.collide(alien1, spaceship2)
universe.collide(spaceship1, alien2)
universe.collide(spaceship1, alien2)
print()
print('NasaSpaceship is an unknown specialisation of Spaceship, is casted to Spaceship:')
universe.collide(nasa1, asteroid2)
universe.collide(nasa1, spaceship2)
universe.collide(asteroid1, nasa2)
universe.collide(spaceship1, nasa2)
