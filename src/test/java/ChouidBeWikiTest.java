import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ChouidBeWikiTest {


     @Test
    void ShouidBeSoftAssertionsWiki() {
        //Открываем страницу wiki
        open("https://github.com/selenide/selenide/wiki");
        //Кликаем на Show 3 more pages…
        $(".wiki-more-pages-link button").click();
        //Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions. Откройте страницу SoftAssertions
        $$("[data-filterable-for=wiki-pages-filter] li a").findBy(text("SoftAssertions")).shouldHave(href("/selenide/selenide/wiki/SoftAssertions"))
                .click();
        //Открываем страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
         $$(".highlight.highlight-source-java").findBy(text("@ExtendWith({SoftAssertsExtension.class})\n" +
                 "class Tests {\n" +
                 "  @Test\n" +
                 "  void test() {\n" +
                 "    Configuration.assertionMode = SOFT;\n" +
                 "    open(\"page.html\");\n" +
                 "\n" +
                 "    $(\"#first\").should(visible).click();\n" +
                 "    $(\"#second\").should(visible).click();\n" +
                 "  }\n" +
                 "}")).shouldBe(visible);
        sleep(5000);


    }
}




