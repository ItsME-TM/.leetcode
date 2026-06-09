class MyStack:
    def __init__(self):
        self.q = []

    def push(self, x):
        self.q.append(x)
        for _ in range(len(self.q) - 1):
            self.q.append(self.q.pop(0))

    def pop(self):
        return self.q.pop(0)

    def top(self):
        return self.q[0]

    def empty(self):
        return len(self.q) == 0
    
if __name__ == "__main__":
    stack = MyStack()
    stack.push(1)
    stack.push(2)
    print(stack.top()) # returns 2
    print(stack.pop()) # returns 2
    print(stack.empty()) # returns False