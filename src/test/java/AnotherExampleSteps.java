import com.thoughtworks.gauge.Step;

public class AnotherExampleSteps {
    @Step("Say <message>")
    public void sayMessage(Object message) {
        System.out.println(message);
    }

    @Step("Test context step")
    public void contextStep() {
        System.out.println("--Context Step (Same as @BeforeTest)--");
    }

    @Step("Test tear down step")
    public void tearDownStep() {
        System.out.println("--Tear Down Step (Same as @AfterTest)--");
    }
}
