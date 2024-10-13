package patterns.prototype;

import patterns.prototype.models.*;

public class Entrypoint {
    public static void main(String[] args) {
        TestScenario baseScenario = new TestScenario("Functional Test", 5, "Development");
        ScenarioGenerator generator = new ScenarioGenerator(baseScenario);

        for (int i = 0; i < 5; i++) {
            TestScenario randomScenario = generator.generateRandomScenario();
            System.out.println(randomScenario);
        }
    }
}
