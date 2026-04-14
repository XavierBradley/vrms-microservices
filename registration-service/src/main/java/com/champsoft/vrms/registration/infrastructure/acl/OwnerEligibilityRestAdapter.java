package com.champsoft.vrms.registration.infrastructure.acl;

import com.champsoft.vrms.owners.application.service.OwnerEligibilityService;
import com.champsoft.vrms.registration.application.port.out.OwnerEligibilityPort;
import org.springframework.stereotype.Component;

@Component
public class OwnerEligibilityRestAdapter implements OwnerEligibilityPort {

    private final OwnerEligibilityService ownersEligibility;

    public OwnerEligibilityRestAdapter(OwnerEligibilityService ownersEligibility) {
        this.ownersEligibility = ownersEligibility;
    }

    @Override
    public boolean isEligible(String ownerId) {
        return ownersEligibility.isEligible(ownerId);
    }
}
