import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class Lesson4Test {
     @Test
    void SoftAssertionsTest() {
        //открыть главную страницу Github
        open("https://github.com/");
        //Найти в поисковике Selenide
        $("[placeholder=Search or jump to...]"). click();

        sleep(5000);

        //Перейдите в раздел Wiki проекта
        //Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        //Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5

    }

}


