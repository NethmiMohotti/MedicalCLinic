package com.company;

import java.util.ArrayList;
import java.util.List;

public class Doctor {

    private String name;
    private int doctorId;
    private String specialization;
    private List<AvailableTime> availableTimes;

    public Doctor(String name, int doctorId, String specialization, List<AvailableTime> availableTimes) {
        this.name = name;
        this.doctorId = doctorId;
        this.specialization = specialization;
        //this.availableTimes = availableTimes;
        // Initialize availableTimes to an empty list if null is passed
        this.availableTimes = (availableTimes != null) ? availableTimes : new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getDoctorId() {
        return doctorId;
    }
    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public List<AvailableTime> getAvailableTimes() {
        return availableTimes;
    }
    public void setAvailableTimes(List<AvailableTime> availableTimes) {
        this.availableTimes = availableTimes;
    }

    public void addAvailableTimes(AvailableTime slot) {
        try{
            this.availableTimes.add(slot);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public void removeAvailabilitySlot(AvailableTime slot) {
        this.availableTimes.remove(slot);
    }

    public void updateAvailabilitySlot(AvailableTime availableTime) {
        for (AvailableTime slot : availableTimes) {
            if (slot.equals(availableTime)) {
                slot.setDate(availableTime.getDate());
                slot.setAppointmentStart(availableTime.getAppointmentStart());
                slot.setAppointmentEnd(availableTime.getAppointmentEnd());
            }
        }
    }



}
