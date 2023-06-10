package com.denys_panasiuk.emergency_notification_system.view;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "/clientContacts", layout = MainLayoutView.class)
public class UserContactView extends VerticalLayout {
    private H1 text = new H1("You are in UserContactView");

    UserContactView() {
        configureView();
        configureLogic();

        add(
                getContent()
        );
    }

//---------------------------Configuration---------------------------\\

    private void configureView() {

    }

    private void configureLogic() {

    }

//---------------------------Get content---------------------------\\

    private Component getContent() {
        VerticalLayout content = new VerticalLayout(text);
        return content;
    }
}
