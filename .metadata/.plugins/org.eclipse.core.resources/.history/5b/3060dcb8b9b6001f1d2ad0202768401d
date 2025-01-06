package com.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RemarkTest {

    @Test
    void testAddRemark_Success() {
        // Testing a valid remark with the correct remark type "Client"
        Prescription obj = new Prescription();
        assertTrue(obj.addRemark("This is a valid client remark.", "Client"));  // Valid remark and type
    }
    
    void testAddRemark_Success01() {
        // Testing a valid remark with the correct remark type "Client"
        Prescription obj = new Prescription();
        assertTrue(obj.addRemark("This is short for oculus dexter, and is your right eye", "Client"));  // Valid remark and type
    }

    @Test
    void testAddRemark_FailureTooShort() {
        // Testing failure when the remark has less than 6 words
        Prescription obj = new Prescription();
        assertFalse(obj.addRemark("Myopia", "Optometrist"));  // Invalid: fewer than 6 words
    }
    
    @Test
    void testAddRemark_FailureTooShort01() {
        // Testing failure when the remark has less than 6 words
        Prescription obj = new Prescription();
        assertFalse(obj.addRemark("Hypermetropia", "Optometrist"));  // Invalid: fewer than 6 words
    }

    @Test
    void testAddRemark_FailureInvalidType() {
        // Testing failure when the remark type is invalid
        Prescription obj = new Prescription();
        assertFalse(obj.addRemark("Unable to see anything which is more than 2meters", "Unknown"));  // Invalid: remark type not "Client" or "Optometrist"
    }
    
    @Test
    void testAddRemark_FailureInvalidType01() {
        // Testing failure when the remark type is invalid
        Prescription obj = new Prescription();
        assertFalse(obj.addRemark("This is short for oculus sinister, and is your left eye", "Doctor"));  // Invalid: remark type not "Client" or "Optometrist"
    }
    
    @Test
    void testAddRemark_FailureTooManyWords() {
        // Testing failure when the remark exceeds the 20-word limit
        Prescription obj = new Prescription();
        assertFalse(obj.addRemark("Client prefers lightweight frames for comfort; advise using polycarbonate lenses for durability and UV protection, especially when client is doing any outdoor activities", 
            "Client"));  // Invalid: more than 20 words
    }
    
    @Test
    void testAddRemark_FailureTooManyWords01() {
        // Testing failure when the remark exceeds the 20-word limit
        Prescription obj = new Prescription();
        assertFalse(obj.addRemark(
            "Client reports occasional eye strain after prolonged screen time; recommend blue light filtering lenses and regular breaks during digital device use", 
            "Optometrist"));  // Invalid: more than 20 words
    }

    @Test
    void testAddRemark_FailureFirstCharacterNotUppercase() {
        // Testing failure when the first word of the remark does not start with an uppercase letter
        Prescription obj = new Prescription();
        assertFalse(obj.addRemark("using the eye drops twice a day", "Client"));  // Invalid: first word does not start with an uppercase letter
    }
    
    @Test
    void testAddRemark_FailureFirstCharacterNotUppercase01() {
        // Testing failure when the first word of the remark does not start with an uppercase letter
        Prescription obj = new Prescription();
        assertFalse(obj.addRemark("avoid driving at night due to glare issues", "Optometrist"));  // Invalid: first word does not start with an uppercase letter
    }

    @Test
    void testAddTwoValidRemarks() {
    	Prescription obj = new Prescription();
        assertTrue(obj.addRemark("This is the First valid test case for remark", "Client"));
        assertTrue(obj.addRemark("Consider blue light-blocking lenses due to prolonged screen exposure", "Optometrist"));
    }
    
    @Test
    void testAddTwoValidRemarks01() {
    	Prescription obj = new Prescription();
        assertTrue(obj.addRemark("This is the second valid test case for remark", "Client"));
        assertTrue(obj.addRemark("Recommend lubricating eye drops for dry eyes", "Optometrist"));
    }

    @Test
    void testAddRemark_SuccessWithOptometrist() {
        // Testing a valid remark with the correct remark type "Optometrist"
        Prescription obj = new Prescription();
        assertTrue(obj.addRemark("Revisit in 6 months for a check-up", "Optometrist"));  // Valid remark and type
    }
    
    @Test
    void testAddRemark_SuccessWithOptometrist01() {
        // Testing a valid remark with the correct remark type "Optometrist"
        Prescription obj = new Prescription();
        assertTrue(obj.addRemark("Schedule a follow-up to monitor any changes in vision", "Optometrist"));  // Valid remark and type
    }

}
