import sys

N = int(sys.stdin.readline())
graph = {}


def postorder(start):
    if start == '.':
        return

    child = graph[start]

    postorder(child[0])
    postorder(child[1])
    print(start, end='')


def inorder(start):
    if start == '.':
        return

    child = graph[start]

    inorder(child[0])
    print(start, end='')
    inorder(child[1])


def preorder(start):
    if start == '.':
        return

    child = graph[start]

    print(start, end='')
    preorder(child[0])
    preorder(child[1])


for i in range(N):
    center, left, right = sys.stdin.readline().split()
    graph[center] = [left, right]

preorder('A')
print()
inorder('A')
print()
postorder('A')
