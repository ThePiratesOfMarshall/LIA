public class PositionControl {
    String position;

    public PositionControl() {
        this.position = null;
    }

    public PositionControl(String position) {
        this.position = position;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String toString() {
        return "[Position]: " + "{ " + getPosition() + " }";
    }

}