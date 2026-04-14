package com.champsoft.vrms.registration.infrastructure.acl;

import com.champsoft.vrms.cars.application.service.VehicleEligibilityService;
import com.champsoft.vrms.registration.application.port.out.VehicleEligibilityPort;
import org.springframework.stereotype.Component;

@Component
public class VehicleEligibilityRestAdapter implements VehicleEligibilityPort {

    private final VehicleEligibilityService carsEligibility;

    public VehicleEligibilityRestAdapter(VehicleEligibilityService carsEligibility) {
        this.carsEligibility = carsEligibility;
    }

    @Override
    public boolean isEligible(String vehicleId) {
        return carsEligibility.isEligible(vehicleId);
    }
}
