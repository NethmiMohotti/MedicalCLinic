package com.company;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
	    //ensure that the Doctor and AvailableTime classes are in the same package
        Doctor doctorJohn = new Doctor("Dr. John Doe", 1, "Cardiologist", null);

        //create available time slots
        AvailableTime slot1 = new AvailableTime(LocalDate.of(2024, 8, 3), LocalTime.of(16, 0), LocalTime.of(23, 0));
        AvailableTime slot2 = new AvailableTime(LocalDate.of(2024, 8, 14), LocalTime.of(10, 30), LocalTime.of(11, 30));
        AvailableTime slot3 = new AvailableTime(LocalDate.of(2024, 8, 22), LocalTime.of(11, 30), LocalTime.of(12, 30));


        //add the available time slots to the doctor's availability slots
        doctorJohn.addAvailableTimes(slot1);
        doctorJohn.addAvailableTimes(slot2);
        doctorJohn.addAvailableTimes(slot3);

        //display the doctor's details
        System.out.println("Doctor: " + doctorJohn.getName());
        System.out.println("Specialization: " + doctorJohn.getSpecialization());
        System.out.println("Availability Slots: ");
        for (AvailableTime slot : doctorJohn.getAvailableTimes()) {
            System.out.println("Date: " + slot.getDate() + " Start: " + slot.getAppointmentStart() + " End: " + slot.getAppointmentEnd());
        }


    }
}
