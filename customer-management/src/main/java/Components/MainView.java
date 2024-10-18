package Components;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.stereotype.Component;

@Route("")// This maps the view to the root URL
@Component
public class MainView extends VerticalLayout {

    public MainView() {
        H1 helloMessage = new H1("Hello, Vaadin!");  // A simple text
        add(helloMessage);  // Adds the component to the layout
    }
}