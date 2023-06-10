package com.denys_panasiuk.emergency_notification_system.view;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.theme.lumo.LumoUtility;

public class MainLayoutView extends AppLayout {
    public MainLayoutView(){
        createHeader();
        createDrawer();
    }

    private void createHeader() {
        H3 logo = new H3("Emergency Notification System");
        logo.addClassNames(
                LumoUtility.FontSize.LARGE,
                LumoUtility.Margin.XSMALL);

        Button logout = new Button("Log out", event -> System.out.println("There will be logout method"));

        var header = new HorizontalLayout(new DrawerToggle(), logo, logout);

        header.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.CENTER);
        header.expand(logo);
        header.setWidthFull();
        header.addClassNames(
                LumoUtility.Padding.Vertical.NONE,
                LumoUtility.Padding.Horizontal.SMALL);

        addToNavbar(header);
    }

    private void createDrawer() {
        VerticalLayout listOfViews = new VerticalLayout(new RouterLink("Your contacts", UserContactView.class));
        addToDrawer(listOfViews);
        setDrawerOpened(false);
    }
}
