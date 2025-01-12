package com.java;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

class PrescriptionTest {

    @Test
    void testAddPrescription_Success() {
        // Creating a prescription object and setting valid attributes
        Prescription obj = new Prescription();
        obj.setFirstName("Smith");  // Valid: length is within 4-15 characters
        obj.setLastName("Jones");  // Valid: length is within 4-15 characters
        obj.setAddress("123 Main St, Suburb, Country yard newyork");  // Valid: length is at least 20 characters
        obj.setSphere(12);  // Valid: within the range -20.00 to +20.00
        obj.setCylinder(-1.5f);  // Valid: within the range -4.00 to +4.00
        obj.setAxis(90);  // Valid: within the range 0 to 180
        obj.setExaminationDate(new Date());  // Valid: current date
        obj.setOptometrist("William Brown");  // Valid: length is within 8-25 characters

        // Asserting that the method returns true (success)
        assertTrue(obj.addPrescription());  // Expected to be 'assertTrue' for a successful addition
    }
    @Test
    void testAddPrescription_Success01() {
        // Creating a prescription object and setting valid attributes
        Prescription obj = new Prescription();
        obj.setFirstName("Williams");  // Valid: length is within 4-15 characters
        obj.setLastName("Joseph");  // Valid: length is within 4-15 characters
        obj.setAddress("2832 Findley Avenue, Hunter, North Dakota, 58048, United States");  // Valid: length is at least 20 characters
        obj.setSphere(15);  // Valid: within the range -20.00 to +20.00
        obj.setCylinder(-2.5f);  // Valid: within the range -4.00 to +4.00
        obj.setAxis(90);  // Valid: within the range 0 to 180
        obj.setExaminationDate(new Date());  // Valid: current date
        obj.setOptometrist("Robert gillman");  // Valid: length is within 8-25 characters

        // Asserting that the method returns true (success)
        assertTrue(obj.addPrescription());  // Expected to be 'assertTrue' for a successful addition
    }
    
    @Test
    void testAddPrescription_FailureFirstNameTooShort() {
        // First Name is too short (less than 4 characters)
        Prescription obj = new Prescription();
        obj.setFirstName("Jak");  // Invalid: less than 4 characters
        obj.setLastName("wilson");  // Valid last name
        obj.setAddress("4485 Bastin Drive, Philadelphia, Pennsylvania, 19108, United States");  // Valid address
        obj.setSphere(1.5f);  // Valid sphere
        obj.setCylinder(-1.5f);  // Valid cylinder
        obj.setAxis(90);  // Valid axis
        obj.setExaminationDate(new Date());  // Valid date
        obj.setOptometrist("Angus Corones");  // Valid optometrist name

        // Asserting that the method returns false due to the short first name
        assertFalse(obj.addPrescription());
    }
    @Test
    void testAddPrescription_FailureFirstNameTooShort01() {
        // First Name is too short (less than 4 characters)
        Prescription obj = new Prescription();
        obj.setFirstName("Tay");  // Invalid: less than 4 characters
        obj.setLastName("Swift");  // Valid last name
        obj.setAddress("4485 Bastin Drive, Philadelphia, Pennsylvania, 19108, United States");  // Valid address
        obj.setSphere(2.5f);  // Valid sphere
        obj.setCylinder(-3.5f);  // Valid cylinder
        obj.setAxis(120);  // Valid axis
        obj.setExaminationDate(new Date());  // Valid date
        obj.setOptometrist("Johnson Adams");  // Valid optometrist name

        // Asserting that the method returns false due to the short first name
        assertFalse(obj.addPrescription());
    }
    
    @Test
    void testAddPrescription_FailureLastNameTooShort() {
        // Last Name is too short (less than 4 characters)
        Prescription obj = new Prescription();
        obj.setFirstName("Taylor");  // Valid first name
        obj.setLastName("swi");  // Invalid: less than 4 characters
        obj.setAddress("2636 Birch Street, Star City, Arkansas, 71667, United States");  // Valid address
        obj.setSphere(1.5f);  // Valid sphere
        obj.setCylinder(-1.5f);  // Valid cylinder
        obj.setAxis(90);  // Valid axis
        obj.setExaminationDate(new Date());  // Valid date
        obj.setOptometrist("Dr. Smith");  // Valid optometrist name

        // Asserting that the method returns false due to the short last name
        assertFalse(obj.addPrescription());
    }
    @Test
    void testAddPrescription_FailureLastNameTooShort01() {
        // Last Name is too short (less than 4 characters)
        Prescription obj = new Prescription();
        obj.setFirstName("Jaya");  // Valid first name
        obj.setLastName("kav");  // Invalid: less than 4 characters
        obj.setAddress("19 Washington Square N, New York, NY 10011, USA");  // Valid address
        obj.setSphere(2.5f);  // Valid sphere
        obj.setCylinder(-1.5f);  // Valid cylinder
        obj.setAxis(160);  // Valid axis
        obj.setExaminationDate(new Date());  // Valid date
        obj.setOptometrist("Owen Dibbs");  // Valid optometrist name

        // Asserting that the method returns false due to the short last name
        assertFalse(obj.addPrescription());
    }

    @Test
    void testAddPrescription_FailureAddressTooShort() {
        // Address is too short (less than 20 characters)
        Prescription obj = new Prescription();
        obj.setFirstName("John");  // Valid first name
        obj.setLastName("Bosco");  // Valid last name
        obj.setAddress("Australia");  // Invalid: less than 20 characters
        obj.setSphere(-1.5f);  // Valid sphere
        obj.setCylinder(-1.5f);  // Valid cylinder
        obj.setAxis(90);  // Valid axis
        obj.setExaminationDate(new Date());  // Valid date
        obj.setOptometrist("Lucas Krefft");  // Valid optometrist name

        // Asserting that the method returns false due to the short address
        assertFalse(obj.addPrescription());
    }
    @Test
    void testAddPrescription_FailureAddressTooShort01() {
        // Address is too short (less than 20 characters)
        Prescription obj = new Prescription();
        obj.setFirstName("Joshua");  // Valid first name
        obj.setLastName("Kirkwood");  // Valid last name
        obj.setAddress("Church street");  // Invalid: less than 20 characters
        obj.setSphere(-3.5f);  // Valid sphere
        obj.setCylinder(-1.5f);  // Valid cylinder
        obj.setAxis(90);  // Valid axis
        obj.setExaminationDate(new Date());  // Valid date
        obj.setOptometrist("George Sanger");  // Valid optometrist name

        // Asserting that the method returns false due to the short address
        assertFalse(obj.addPrescription());
    }

    @Test
    void testAddPrescription_FailureInvalidSphere() {
        // Sphere value is out of the valid range (-20.00 to +20.00)
        Prescription obj = new Prescription();
        obj.setFirstName("John");  // Valid first name
        obj.setLastName("Robert");  // Valid last name
        obj.setAddress("36 East 8th Street, New York, NY 10003, United States");  // Valid address
        obj.setSphere(25.0f);  // Invalid: greater than 20.0
        obj.setCylinder(-1.5f);  // Valid cylinder
        obj.setAxis(110);  // Valid axis
        obj.setExaminationDate(new Date());  // Valid date
        obj.setOptometrist("Aidan Lefroy");  // Valid optometrist name

        // Asserting that the method returns false due to the invalid sphere value
        assertFalse(obj.addPrescription());
    }
    
    @Test
    void testAddPrescription_FailureInvalidSphere01() {
        // Sphere value is out of the valid range (-20.00 to +20.00)
        Prescription obj = new Prescription();
        obj.setFirstName("Ryan");  // Valid first name
        obj.setLastName("Brookman");  // Valid last name
        obj.setAddress("13 Washington Square S, New York, NY 10012, USA");  // Valid address
        obj.setSphere(36.0f);  // Invalid: greater than 20.0
        obj.setCylinder(-1.5f);  // Valid cylinder
        obj.setAxis(110);  // Valid axis
        obj.setExaminationDate(new Date());  // Valid date
        obj.setOptometrist("Riley MacRory");  // Valid optometrist name

        // Asserting that the method returns false due to the invalid sphere value
        assertFalse(obj.addPrescription());
    }
    
    @Test
    void testAddPrescription_FailureInvalidOptometristName() {
        // Optometrist's name is too short (less than 8 characters)
        Prescription obj = new Prescription();
        obj.setFirstName("Jacob");  // Valid first name
        obj.setLastName("Loder");  // Valid last name
        obj.setAddress("22 Washington Square N, New York, NY 10011, USA");  // Valid address
        obj.setSphere(1.5f);  // Valid sphere
        obj.setCylinder(-1.5f);  // Valid cylinder
        obj.setAxis(90);  // Valid axis
        obj.setExaminationDate(new Date());  // Valid date
        obj.setOptometrist("Newton");  // Invalid: less than 8 characters

        // Asserting that the method returns false due to the short optometrist name
        assertFalse(obj.addPrescription());
    }
    
    @Test
    void testAddPrescription_FailureInvalidOptometristName01() {
        // Optometrist's name is too short (less than 8 characters)
        Prescription obj = new Prescription();
        obj.setFirstName("John");  // Valid first name
        obj.setLastName("gillman");  // Valid last name
        obj.setAddress("100 Bleecker St, New York, NY 10013, USA");  // Valid address
        obj.setSphere(15);  // Valid sphere
        obj.setCylinder(-3.5f);  // Valid cylinder
        obj.setAxis(100);  // Valid axis
        obj.setExaminationDate(new Date());  // Valid date
        obj.setOptometrist("Norman");  // Invalid: less than 8 characters

        // Asserting that the method returns false due to the short optometrist name
        assertFalse(obj.addPrescription());
    }

    @Test
    void testAddPrescription_ValidChildPrescription() {
        // Creating a prescription object and setting valid attributes
        Prescription obj = new Prescription();
        obj.setFirstName("Samuel");  // Valid: length is within 4-15 characters
        obj.setLastName("Rubinstein");   // Valid: length is within 4-15 characters
        obj.setAddress("636 Greenwich St, New York, NY 10014, US");  // Valid: length is at least 20 characters
        obj.setSphere(-0.50f);  // Valid: within the range -20.00 to +20.00
        obj.setCylinder(0.00f);  // Valid: within the range -4.00 to +4.00
        obj.setAxis(180);        // Valid: within the range 0 to 180
        obj.setExaminationDate(new Date());  // Valid: current date
        obj.setOptometrist("Henry Nowland");  // Valid: length is within 8-25 characters

        // Asserting that the method returns true (success)
        assertTrue(obj.addPrescription());  // Expected to be true for a successful addition
    }
    
    @Test
    void testAddPrescription_ValidChildPrescription01() {
        // Creating a prescription object and setting valid attributes
        Prescription obj = new Prescription();
        obj.setFirstName("James");  // Valid: length is within 4-15 characters
        obj.setLastName("Rodd");   // Valid: length is within 4-15 characters
        obj.setAddress("133 Macdougal St, New York, NY 10012, USA");  // Valid: length is at least 20 characters
        obj.setSphere(-12.50f);  // Valid: within the range -20.00 to +20.00
        obj.setCylinder(0.00f);  // Valid: within the range -4.00 to +4.00
        obj.setAxis(180);        // Valid: within the range 0 to 180
        obj.setExaminationDate(new Date());  // Valid: current date
        obj.setOptometrist("Dylan Garden");  // Valid: length is within 8-25 characters

        // Asserting that the method returns true (success)
        assertTrue(obj.addPrescription());  // Expected to be true for a successful addition
    }

    @Test
    void testAddPrescription_FailureInvalidCylinder() {
        // Cylinder value is out of the valid range (-4.00 to +4.00)
        Prescription obj = new Prescription();
        obj.setFirstName("John");  // Valid first name
        obj.setLastName("Doe");  // Valid last name
        obj.setAddress("853 Broadway, New York, NY 10003, USA");  // Valid address
        obj.setSphere(1.5f);  // Valid sphere
        obj.setCylinder(5.0f);  // Invalid: greater than 4.0
        obj.setAxis(90);  // Valid axis
        obj.setExaminationDate(new Date());  // Valid date
        obj.setOptometrist("William cox");  // Valid optometrist name

        // Asserting that the method returns false due to the invalid cylinder value
        assertFalse(obj.addPrescription());
    }
    @Test
    void testAddPrescription_FailureInvalidCylinder01() {
        // Cylinder value is out of the valid range (-4.00 to +4.00)
        Prescription obj = new Prescription();
        obj.setFirstName("John");  // Valid first name
        obj.setLastName("Doe");  // Valid last name
        obj.setAddress("610 E 20th St, New York, NY 10009, USA");  // Valid address
        obj.setSphere(1.5f);  // Valid sphere
        obj.setCylinder(8.0f);  // Invalid: greater than 4.0
        obj.setAxis(165);  // Valid axis
        obj.setExaminationDate(new Date());  // Valid date
        obj.setOptometrist("Isaac Ardill");  // Valid optometrist name

        // Asserting that the method returns false due to the invalid cylinder value
        assertFalse(obj.addPrescription());
    }

}
