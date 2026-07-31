def fib(n):
    if n == 0 or n == 1:
        return n
    return 1 + n + fib(n-1)
fib(5)

print("Hola")
