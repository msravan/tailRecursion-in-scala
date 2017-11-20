# Tail Recursion in scala:


If a function calls itself as it's last action, the function's stack frame can be reused. This is known as Tail recursion. Tail recursion functions are iterative process.

In general, if the last action of a function consists of calling a function (which may be the same), one stack frame would be sufficient for both the functions.
Such type of calls are called tail calls.

This is to provide an example that any recursion in scala can be turned into a tail recursion. There are two programs on how to caluculate the factorial if a number, first prigram shows how to calluclate factorial using recursion.
Second program shows the tail recursion version of how to calluculate the factorial.
