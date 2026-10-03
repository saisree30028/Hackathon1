public class SolarEnergyMonitor {
    public static void main(String[] args) {

        int panelId = 101;
        double energyGenerated = 25.75;
        int numberOfPanels = 10;
        char systemStatus = 'A';

        System.out.println("Rooftop Solar Energy Details");
        System.out.println("Panel ID: " + panelId);
        System.out.println("Energy Generated: " + energyGenerated + " kWh");
        System.out.println("Number of Solar Panels: " + numberOfPanels);
        System.out.println("System Status: " + systemStatus);
    }
}