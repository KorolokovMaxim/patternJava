package creational.abstractfactory.website;

import creational.abstractfactory.abstractFactoryImpl.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project");
    }
}
