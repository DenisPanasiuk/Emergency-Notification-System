package com.denys_panasiuk.emergency_notification_system.view;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "homepage", layout = MainLayoutView.class)
public class HomepageView extends VerticalLayout {
    private Button sentEmergencyNotificationButton = new Button("Send emergency");
    private Button addNewContactButton = new Button("Add contact");
    private H1 mainDescriptionText = new H1("If you are in emergency press the button to inform your contacts!");

    public HomepageView() {
        setSizeFull();
        configureHomepageView();
        configureHomepageLogic();

        add(
                getContent()
        );
    }

//---------------------------Configuration---------------------------\\

    private void configureHomepageLogic() {
        addNewContactButton.addClickListener(buttonClickEvent -> UI.getCurrent().navigate("/addContact"));
    }

    private void configureHomepageView() {

    }

//---------------------------Get content---------------------------\\

    private Component getContent() {
        VerticalLayout content = new VerticalLayout(mainDescriptionText, sentEmergencyNotificationButton, addNewContactButton);
        content.setAlignItems(Alignment.CENTER);
        content.setHeightFull();
        return content;
    }
}
