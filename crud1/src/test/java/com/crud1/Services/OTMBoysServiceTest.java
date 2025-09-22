package com.crud1.Services;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.crud1.Model.OTMBoys;
import com.crud1.Repository.OTMRepo;
import com.crud1.Serviceimpl.OTMServiceimpl;

class OTMBoysServiceTest {

    @Mock
    private OTMRepo otmrepo; // your repository

    @InjectMocks
    private OTMServiceimpl otmService; // your service implementation

    private OTMBoys existingBoys;
    private OTMBoys updateBoys;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        // Existing record in DB
        existingBoys = new OTMBoys();
        existingBoys.setBid(1);
        existingBoys.setBname("John");
        existingBoys.setBage(20);
        existingBoys.setBjob("Student");
        existingBoys.setGirls_fk(new ArrayList<>());

        // New data to update
        updateBoys = new OTMBoys();
        updateBoys.setBid(1);
        updateBoys.setBname("Mike");
        updateBoys.setBage(25);
        updateBoys.setBjob("Engineer");
        updateBoys.setGirls_fk(new ArrayList<>());
    }

    // ------------------- Test normal update -------------------
    @Test
    void testUpdateBoysbyID_Success() {
        // Mock repo behavior
        when(otmrepo.findById(1)).thenReturn(Optional.of(existingBoys));
        when(otmrepo.save(any(OTMBoys.class))).thenAnswer(invocation -> invocation.getArgument(0));

        // Execute service
        OTMBoys result = otmService.updateBoysbyID(updateBoys);

        // Assertions
        assertNotNull(result);
        assertEquals("Mike", result.getBname());
        assertEquals(25, result.getBage());
        assertEquals("Engineer", result.getBjob());

        // Verify repo calls
        verify(otmrepo, times(1)).findById(1);
        verify(otmrepo, times(1)).save(existingBoys);
    }

    // ------------------- Test null input -------------------
    @Test
    void testUpdateBoysbyID_NullInput() {
        NullPointerException ex = assertThrows(NullPointerException.class, () -> {
            otmService.updateBoysbyID(null);
        });
        assertEquals("NO Record Found Give me the Correct Data", ex.getMessage());
    }

    // ------------------- Test record not found -------------------
    @Test
    void testUpdateBoysbyID_RecordNotFound() {
        when(otmrepo.findById(1)).thenReturn(Optional.empty());

        NullPointerException ex = assertThrows(NullPointerException.class, () -> {
            otmService.updateBoysbyID(updateBoys);
        });

        assertEquals("No Record Found Give The correct Record", ex.getMessage());
    }
}
