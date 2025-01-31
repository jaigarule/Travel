import java.util.*;

class TravelPlanner {
    private String destination;
    private String startDate;
    private String endDate;
    private String preferences;
    private double budget;

    public TravelPlanner(String destination, String startDate, String endDate, String preferences, double budget) {
        this.destination = destination;
        this.startDate = startDate;
        this.endDate = endDate;
        this.preferences = preferences;
        this.budget = budget;
    }

    public void generatePlan() {
        System.out.println("\nTravel Itinerary:");
        System.out.println("Destination: " + destination);
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);
        System.out.println("Preferences: " + preferences);
        System.out.println("Estimated Budget: $" + budget);

        fetchWeather();
        showMapLink();
    }

    private void fetchWeather() {
        System.out.println("Fetching weather information for " + destination + "...");
        System.out.println("(Use OpenWeatherMap API to get real data)");
    }

    private void showMapLink() {
        System.out.println("Google Maps: https://www.google.com/maps/search/?api=1&query=" + destination.replace(" ", "+"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Destination: ");
        String destination = scanner.nextLine();

        System.out.print("Enter Start Date (YYYY-MM-DD): ");
        String startDate = scanner.next();

        System.out.print("Enter End Date (YYYY-MM-DD): ");
        String endDate = scanner.next();
        scanner.nextLine();

        System.out.print("Enter Preferences (e.g., sightseeing, adventure, food): ");
        String preferences = scanner.nextLine();

        System.out.print("Enter Estimated Budget: ");
        double budget = scanner.nextDouble();

        TravelPlanner planner = new TravelPlanner(destination, startDate, endDate, preferences, budget);
        planner.generatePlan();
    }
}