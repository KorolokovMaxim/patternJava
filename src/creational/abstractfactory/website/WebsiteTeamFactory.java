package creational.abstractfactory.website;

import creational.abstractfactory.abstractFactoryImpl.Developer;
import creational.abstractfactory.abstractFactoryImpl.ProjectManager;
import creational.abstractfactory.abstractFactoryImpl.ProjectTeamFactory;
import creational.abstractfactory.abstractFactoryImpl.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
