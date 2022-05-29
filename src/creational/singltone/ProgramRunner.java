package creational.singltone;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProjectLogger().addLogInfo("First Log");
        ProgramLogger.getProjectLogger().addLogInfo("Second Log");
        ProgramLogger.getProjectLogger().addLogInfo("Third Log");

        ProgramLogger.getProjectLogger().showLogFIle();

    }
}
