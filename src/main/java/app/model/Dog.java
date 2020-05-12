package app.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("put in a cage")
public class Dog extends Animal {
    @Override
    public String toString() {
        return "Im a Dog";
    }
}
