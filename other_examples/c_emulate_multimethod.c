// ONLINE COMILER LINK: https://www.onlinegdb.com/online_c_compiler

#include <stdio.h>

typedef void (*CollisionCase)(void);

void collision_AA(void) { printf("Asteroid <--> Asteroid\n"); };
void collision_AS(void) { printf("Asteroid <--> Spaceship\n"); };
void collision_SA(void) { printf("Spaceship <--> Asteroid\n"); };
void collision_SS(void) { printf("Spaceship <--> Spaceship\n"); };

typedef enum {
    asteroid = 0,
    spaceship,
    num_thing_types /* not a type of thing itself, instead used to find number of things */
} Thing;

CollisionCase collisionCases[num_thing_types][num_thing_types] = {
    {&collision_AA, &collision_AS},
    {&collision_SA, &collision_SS}
};

void collide(Thing a, Thing b) {
    (*collisionCases[a][b])();
}

int main()
{
    collide(asteroid, asteroid);
    collide(asteroid, spaceship);
    collide(spaceship, asteroid);
    collide(spaceship, spaceship);
    return 0;
}
