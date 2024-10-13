package patterns.prototype.models;

import patterns.prototype.interfaces.Prototype;

public class TestScenario implements Prototype {
    private String scenarioName;
    private int complexityLevel;
    private String environment;

    public TestScenario(String scenarioName, int complexityLevel, String environment) {
        this.scenarioName = scenarioName;
        this.complexityLevel = complexityLevel;
        this.environment = environment;
    }

    @Override
    public Prototype clone() {
        return new TestScenario(scenarioName, complexityLevel, environment);
    }

    public void modifyScenario(String newScenarioName, int newComplexityLevel, String newEnvironment) {
        this.scenarioName = newScenarioName;
        this.complexityLevel = newComplexityLevel;
        this.environment = newEnvironment;
    }

    @Override
    public String toString() {
        return "TestScenario{" +
                "scenarioName='" + scenarioName + '\'' +
                ", complexityLevel=" + complexityLevel +
                ", environment='" + environment + '\'' +
                '}';
    }
}
