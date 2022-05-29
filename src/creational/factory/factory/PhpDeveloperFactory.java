package creational.factory.factory;

import creational.factory.entity.Developer;
import creational.factory.entity.PhpDeveloper;

public class PhpDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
