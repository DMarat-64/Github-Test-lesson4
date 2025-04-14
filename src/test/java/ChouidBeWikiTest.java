import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ChouidBeWikiTest {

        @Test
        void ShouidBeSoftAssertionsWiki(){
            //открыть страницу wiki
            open("https://github.com/selenide/selenide/wiki");
            //Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
            $("#wiki-pages-box").$(byText("SoftAssertions"));
            //Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5

        }
    }


