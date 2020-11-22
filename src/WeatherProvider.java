public class WeatherProvider {
    private static WeatherProvider weatherProvider;
    private static String[] weather; //TODO разобраться с []

    private WeatherProvider() {
    }

    public static WeatherProvider getWeatherProvider() {
        if (weatherProvider == null)
            weatherProvider = new WeatherProvider();
        return weatherProvider;
    }

    public String getCurrentWeather(Coordinates coordinates) {
        return "";
    }
}
