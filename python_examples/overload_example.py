from multimethod import isa, overload


@overload
def func(obj: isa(str)):
    print(f'{obj} is a string')


@overload
def func(obj: str.isalnum):
    print(f'{obj} is alphanumeric')


@overload
def func(obj: str.isdigit):
    print(f'{obj} is digit')


def is_long(x):
    return len(x) > 10


@overload
def func(obj: is_long):
    print(f'{obj} is long')


print('Functions are tried from down to up, the first matching will be applied')
func('12345678912345')  # This string is long, the last function matches
func('123')  # This string is not long but the second from below matches
func('Cat33')  # Not digit but only alphanumeric characters, the third one from below matches
func('$5g b|!@')  # Special characters but still a string, first function matches
