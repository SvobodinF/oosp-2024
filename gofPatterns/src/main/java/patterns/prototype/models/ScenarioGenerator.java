package patterns.prototype.models;

import java.util.Random;

public class ScenarioGenerator {
    private TestScenario baseScenario;

    public ScenarioGenerator(TestScenario baseScenario) {
        this.baseScenario = baseScenario;
    }
    public TestScenario generateRandomScenario() {
        TestScenario clonedScenario = (TestScenario) baseScenario.clone();

        String[] scenarioNames = {"Load Test", "Stress Test", "Functional Test", "Security Test"};
        String[] environments = {"Production", "Development"};

        Random random = new Random();
        int newComplexityLevel = random.nextInt(10) + 1;
        String newScenarioName = scenarioNames[random.nextInt(scenarioNames.length)];
        String newEnvironment = environments[random.nextInt(environments.length)];

        clonedScenario.modifyScenario(newScenarioName, newComplexityLevel, newEnvironment);

        return clonedScenario;
    }
}
