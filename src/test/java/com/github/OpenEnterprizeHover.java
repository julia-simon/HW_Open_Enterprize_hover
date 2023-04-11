package com.github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class OpenEnterprizeHover {

    @Test
    void OpenEnterprizeHoverTest() {
        open("https://github.com/");
        $(".d-lg-flex.list-style-none").$(byText("Solutions")).hover();
        $(byTagAndText("a", "Enterprise")).click();
        $("h1.h1-mktg").shouldHave(text("Build like the best"));

    }

}
