package SettingsClass;
public class ClientSettings {
    private Positions position;
    private Lights lights;

    public ClientSettings(Positions position, Lights lights) {
        this.position = position;
        this.lights = lights;
    }
    
    public ClientSettings(String settings) {
        String[] fields = settings.split("[;,]");
        this.position = Positions.valueOf(fields[0]);
        this.lights = Lights.valueOf(fields[1]);
    }

    public Positions getPosition() { return this.position; }

    public void setPosition(Positions pos) { this.position = pos; }
    
    public Lights getLights() { return this.lights; }

    public void setLights(Lights lights) { this.lights = lights; }

    public String toString() {
        return "\nPosition: " + position.toString() +
               "\nLights: " + lights.toString();
    }
}
