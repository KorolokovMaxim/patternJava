package creational.factory.factory;

import creational.factory.entity.CppDeveloper;
import creational.factory.entity.Developer;

public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
