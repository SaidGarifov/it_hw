public class ItemStorage<T> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public ItemStorage(int fraction){
        setValue(value);
    }

    public void compareWith(T otherValue){
        if (value == null || otherValue == null){
            System.out.println("Опачки! Ревизия невозможна, объект не найден");
        } else if (value.equals(otherValue)) {
            System.out.println("Значения идентичны. Контроль качества пройден");
        }
        if (value==otherValue){
            System.out.println("Значения идентичны. Контроль качества пройден");
        }
    }
}
