package creational.abstractfactory;

import creational.abstractfactory.abstractFactoryImpl.Developer;
import creational.abstractfactory.abstractFactoryImpl.ProjectManager;
import creational.abstractfactory.abstractFactoryImpl.ProjectTeamFactory;
import creational.abstractfactory.abstractFactoryImpl.Tester;
import creational.abstractfactory.banking.BankingTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating bank system");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
