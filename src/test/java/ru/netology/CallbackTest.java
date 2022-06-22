package ru.netology;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class CallbackTest {


    @Test
    void shouldSubmitRequest() {
        open("http://localhost:9999");
        $("[data-test-id=name] input").setValue("Иванов Иван");
        $("[data-test-id=phone] input").setValue("+79110000000");
        $("[data-test-id=agreement]").click();
        $("button.button").click();
        $("[data-test-id=order-success]").shouldHave(
                Condition.exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.")
        );


    }
}