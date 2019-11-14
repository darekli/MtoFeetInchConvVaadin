package mf;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.tabs.Tab;

public interface QuickReturn {

    default Button addButtonBack() {
        Button buttonBack = new Button("Back");
        buttonBack.addClickListener(buttonClickEvent ->
                buttonBack.getUI().ifPresent(ui -> ui.navigate("main")));
        return buttonBack;
    }
}
