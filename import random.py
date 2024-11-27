import random

for j in range(10):
    slovo = ''
    for i in range(3):
        spoluhlaska = random.choice('bcdfghjklmnpqrstvwxz')
        samohlaska = random.choice('aeiouy')
        slovo = slovo + spoluhlaska + samohlaska
    print(slovo)