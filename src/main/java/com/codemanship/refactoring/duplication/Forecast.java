package com.codemanship.refactoring.duplication;

class Forecast {

    private final String periodName; // "morning", "afternoon", "evening", "night"
    private final double temperature;
    private final String condition;
    private final int windSpeed;

    public Forecast(String periodName, double temperature, String condition, int windSpeed) {
        this.periodName = periodName;
        this.temperature = temperature;
        this.condition = condition;
        this.windSpeed = windSpeed;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getCondition() {
        return condition;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public boolean isMorning() {
        return "morning".equals(periodName);
    }

    public boolean isAfternoon() {
        return "afternoon".equals(periodName);
    }

    public boolean isEvening() {
        return "evening".equals(periodName);
    }

    public boolean isNight() {
        return "night".equals(periodName);
    }
}
