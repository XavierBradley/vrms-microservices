package com.champsoft.vrms.registration.infrastructure.acl;

import com.champsoft.vrms.agents.application.service.AgentEligibilityService;
import com.champsoft.vrms.registration.application.port.out.AgentEligibilityPort;
import org.springframework.stereotype.Component;

@Component
public class AgentEligibilityRestAdapter implements AgentEligibilityPort {

    private final AgentEligibilityService agentsEligibility;

    public AgentEligibilityRestAdapter(AgentEligibilityService agentsEligibility) {
        this.agentsEligibility = agentsEligibility;
    }

    @Override
    public boolean isEligible(String agentId) {
        return agentsEligibility.isEligible(agentId);
    }
}
