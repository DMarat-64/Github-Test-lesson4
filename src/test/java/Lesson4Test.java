import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class Lesson4Test {
     @Test
    void SoftAssertionsTest() {
        //открыть главную страницу Github
        open("https://github.com/");
        //Найти в поисковике Selenide
        $("[placeholder='Search or jump to...']"). click();
        $("#query-builder-test").setValue("selenide").pressEnter();
        //Открыть страницу selenide
        $$("[data-testid=results-list]").first().$("a").click();
         //Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();
        $("#repository-container-header").shouldHave(text("selenide / selenide"));
        sleep(5000);

     }

}


