package SettingsClass;

public class TestSettings {
    public static void main(String[] args) {
        ClientSettings settings = new ClientSettings(Positions.LEFT, Lights.FLASH_ON);

        System.out.println(settings.toString());
    }
}
