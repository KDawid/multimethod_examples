from multipledispatch import dispatch


class SpaceObject:
    pass


class Asteroid(SpaceObject):
    pass


class Spaceship(SpaceObject):
    pass


@dispatch(SpaceObject, SpaceObject)
def collide(x, y):
    print("object <--> object")


@dispatch(Asteroid, Asteroid)
def collide(x, y):
    print("Asteroid <--> Asteroid")


@dispatch(Asteroid, Spaceship)
def collide(x, y):
    print("Asteroid <--> Spaceship")


@dispatch(Spaceship, Asteroid)
def collide(x, y):
    print("Spaceship <--> Asteroid")


@dispatch(Spaceship, Spaceship)
def collide(x, y):
    print("Spaceship <--> Spaceship")


asteroid1 = Asteroid()
asteroid2 = Asteroid()
spaceship1 = Spaceship()
spaceship2 = Spaceship()

collide(asteroid1, asteroid2)
collide(asteroid1, spaceship2)
collide(spaceship1, asteroid2)
collide(spaceship1, spaceship2)