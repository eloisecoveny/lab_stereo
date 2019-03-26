package components;

public enum RecordSpeed {
    THIRTY_THREE(33),
    FOURTY_FIVE(45),
    SEVENTY_EIGHT(78);

    private final int speed;

    RecordSpeed(int speed){
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
