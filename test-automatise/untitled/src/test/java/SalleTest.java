import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SalleTest {
    private Salle salle;
    private WebDriver driver;

    @BeforeAll
    void init() {
        salle = new Salle();
        salle.setup();
        driver = salle.getDriver();
    }

    @BeforeEach
    void openPage() {
        driver.get("http://localhost:3000/");
    }

    @AfterAll
    void cleanup() {
        salle.tearDown();
    }

    // Cas 1 : Ajout d’une tâche
}