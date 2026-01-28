from __future__ import annotations
from typing import List


class Component:
    def operation(self) -> str:
        raise NotImplementedError


class Leaf(Component):
    def __init__(self, name: str) -> None:
        self.name = name

    def operation(self) -> str:
        return self.name


class Composite(Component):
    def __init__(self, name: str) -> None:
        self.name = name
        self.children: List[Component] = []

    def add(self, component: Component) -> None:
        self.children.append(component)

    def operation(self) -> str:
        results = [child.operation() for child in self.children]
        return f"{self.name}({', '.join(results)})"


if __name__ == "__main__":
    root = Composite("root")
    root.add(Leaf("A"))

    branch = Composite("branch")
    branch.add(Leaf("B"))
    branch.add(Leaf("C"))

    root.add(branch)

    print(root.operation())  # root(A, branch(B, C))