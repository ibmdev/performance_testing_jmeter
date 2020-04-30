package fr.jmeter.gs.components;

import fr.jmeter.gs.entities.User;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
@RepositoryEventHandler(User.class)
public class AddAuthToUser {

    @HandleBeforeCreate
    public void handleCreate(User user) {

        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        user.setFirstName(username);
    }
}
