package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("I have created a new file")
    public void iHaveCreatedANewFile() {
        System.out.println("I have created a new file");

    }

    @When("I save the file")
    public void iSaveTheFile() {
        System.out.println("I save the file");
    }

    @Given("I have created a new file {string} in file {string}")
    public void iHaveCreatedANewFileInFile(String scenario, String file) throws InterruptedException {
        System.out.format("Thread ID - %2d - %s from %s feature file.\n",
                Thread.currentThread().getId(), scenario,file);
        Thread.sleep(5000); // Simulate step taking 5 seconds

        System.out.format("END: Thread ID - %2d - %s at %d\n",
                Thread.currentThread().getId(), scenario, System.currentTimeMillis());
    }
}
