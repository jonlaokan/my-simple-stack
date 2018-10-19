package deqo.jlao.mysimplestack;

public class Item {
    private int value;

    Item(int v) {
        setValue(v);
    }

    public int  getValue() {
        return value;
    }

    private void setValue(int value) {
        this.value = value;
    }
}
