package comportamiento.iterator;

import java.util.Iterator;
import java.util.List;

public class codjava {
    
}

class NumberIterator implements Iterator<Integer> {
    private List<Integer> numbers;
    private int index = 0;

    public NumberIterator(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public boolean hasNext() {
        return index < numbers.size();
    }

    public Integer next() {
        return numbers.get(index++);
    }
}

