package Unit1;

//这里是使用Object类表示泛型的一种方法
public class MemoryCell {
    private Object stoerdValue;

    public void write(Object x) {
        stoerdValue = x;
    }

    public Object read() {
        return stoerdValue;
    }
}

class TestMemoryCell {
    public static void main(String[] args) {
        MemoryCell c = new MemoryCell();
        c.write(new Integer(123));
        Integer value = (Integer) c.read();
        System.out.println(value);

        c.write(new String("456789"));
        String stringValue = (String) c.read();
        System.out.println(stringValue);
    }
}
