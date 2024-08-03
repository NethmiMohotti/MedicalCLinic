package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class AvailableTime {
    private LocalDate date;
    private LocalTime appointmentStart;
    private LocalTime appointmentEnd;

    public AvailableTime(LocalDate date, LocalTime appointmentStart, LocalTime appointmentEnd) {
        this.date = date;
        this.appointmentStart = appointmentStart;
        this.appointmentEnd = appointmentEnd;
    }

    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getAppointmentStart() {
        return appointmentStart;
    }
    public void setAppointmentStart(LocalTime appointmentStart) {
        this.appointmentStart = appointmentStart;
    }

    public LocalTime getAppointmentEnd() {
        return appointmentEnd;
    }
    public void setAppointmentEnd(LocalTime appointmentEnd) {
        this.appointmentEnd = appointmentEnd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AvailableTime that = (AvailableTime) o;
        return date.equals(that.date) &&
                appointmentStart.equals(that.appointmentStart) &&
                appointmentEnd.equals(that.appointmentEnd);
    }

    @Override
    public int hashCode() {
//        int result = date.hashCode();
//        result = 31 * result + appointmentStart.hashCode();
//        result = 31 * result + appointmentEnd.hashCode();
        return Objects.hash(date, appointmentStart, appointmentEnd);
    }

    @Override
    public String toString() {
        return "AvailableTime{" +
                "date=" + date +
                ", appointmentStart=" + appointmentStart +
                ", appointmentEnd=" + appointmentEnd +
                '}';
    }

}
