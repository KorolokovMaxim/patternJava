package creational.abstractfactory;

import creational.abstractfactory.abstractFactoryImpl.Developer;
import creational.abstractfactory.abstractFactoryImpl.ProjectManager;
import creational.abstractfactory.abstractFactoryImpl.ProjectTeamFactory;
import creational.abstractfactory.abstractFactoryImpl.Tester;
import creational.abstractfactory.website.WebsiteTeamFactory;

public class AuctionSiteProject {

    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();
        System.out.println("Creating auction website...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
