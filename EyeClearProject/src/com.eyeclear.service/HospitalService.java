package com.eyeclear.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HospitalService {
    public List<String> getHospitalsByLocality(String locality) {
        List<String> allHospitals = Arrays.asList(
            "Vision Care Hospital - Downtown",
            "Healthy Eyes Clinic - Uptown",
            "Clear View Center - Midtown"
        );
        return allHospitals.stream()
                .filter(hospital -> hospital.contains(locality))
                .collect(Collectors.toList());
    }
}
