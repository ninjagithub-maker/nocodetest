import os

def recursive_function(n):
    if n > 0:
        print(f"Iteration {n}")
        recursive_function(n - 1)
    else:
        print("Base case reached")

recursive_function(5)