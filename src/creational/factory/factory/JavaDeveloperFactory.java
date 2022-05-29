package creational.factory.factory;

import creational.factory.entity.Developer;
import creational.factory.entity.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
