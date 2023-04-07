package net.dv8tion.jda.api.events.entitlement;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.entitlement.Entitlement;
import org.jetbrains.annotations.NotNull;

public class EntitlementCreateEvent extends GenericEntitlementEvent
{
    public EntitlementCreateEvent(@NotNull JDA api, long responseNumber, @NotNull Entitlement entitlement)
    {
        super(api, responseNumber, entitlement);
    }
}
