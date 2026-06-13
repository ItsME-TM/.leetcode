class MyQueue:
    def __init__(self):
        self.stackIn = []
        self.stackOut = []

    def push(self, x: int) -> None:
        self.stackIn.append(x)
    
    def pop(self) -> int:
        self.peek()
        return self.stackOut.pop()
    
    def peek(self) -> int:
        if not self.stackOut:
            while self.stackIn:
                self.stackOut.append(self.stackIn.pop())
        return self.stackOut[-1]

    def empty(self) -> bool:
        return not self.stackIn and not self.stackOut
    
if __name__ == "__main__":
    obj = MyQueue()
    obj.push(1)
    obj.push(2)
    print(obj.peek()) # returns 1
    print(obj.pop())  # returns 1
    print(obj.empty()) # returns False