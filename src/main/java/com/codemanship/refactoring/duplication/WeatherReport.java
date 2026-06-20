package com.codemanship.refactoring.duplication;

import java.util.List;

class WeatherReport {

    void formatDailyReport(List<Forecast> forecasts, List<String> output) {

        for (Forecast forecast : forecasts) {

            if (forecast.isMorning()) {
                String label = "Morning: ";
                String line = label + forecast.getTemperature() + "°C, "
                        + forecast.getCondition() + ", wind " + forecast.getWindSpeed() + "km/h";
                output.add(line);
            }

            if (forecast.isAfternoon()) {
                String label = "Afternoon: ";
                String line = label + forecast.getTemperature() + "°C, "
                        + forecast.getCondition() + ", wind " + forecast.getWindSpeed() + "km/h";
                output.add(line);
            }

            if (forecast.isEvening()) {
                String label = "Evening: ";
                String line = label + forecast.getTemperature() + "°C, "
                        + forecast.getCondition() + ", wind " + forecast.getWindSpeed() + "km/h";
                output.add(line);
            }

            if (forecast.isNight()) {
                String label = "Night: ";
                String line = label + forecast.getTemperature() + "°C, "
                        + forecast.getCondition() + ", wind " + forecast.getWindSpeed() + "km/h";
                output.add(line);
            }
        }
    }
}
