package creational.abstractfactory.banking;

import creational.abstractfactory.abstractFactoryImpl.Developer;
import creational.abstractfactory.abstractFactoryImpl.ProjectManager;
import creational.abstractfactory.abstractFactoryImpl.ProjectTeamFactory;
import creational.abstractfactory.abstractFactoryImpl.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
