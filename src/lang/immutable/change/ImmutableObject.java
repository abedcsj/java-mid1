package lang.immutable.change;

public class ImmutableObject {
    private int value;
    public ImmutableObject(int value){
        this.value=value;
    }

    public ImmutableObject add(int addValue){
        int result=value+addValue;
        return new ImmutableObject(result);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
