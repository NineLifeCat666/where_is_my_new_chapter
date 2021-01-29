import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class RanobesTests {
    String url = "https://ranobes.com/ranobe/53844-tales-of-herding-gods.html";

    @Test
    void whereIsMyChapter() {
        open(url);
        step("Проверка на наличие новой главы", ()-> {
           $("[class='chapters-scroll-list']").shouldHave(Condition.text("Глава 1163"));
        });
    }
}
