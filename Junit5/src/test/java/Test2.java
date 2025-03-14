import io.qameta.allure.*;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.IOException;

import static java.awt.event.KeyEvent.*;

public class Test2
{
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @Attachment(value="",type = "",fileExtension = "")
    public void Test1() throws IOException {
        Steps.CheckSumTest(1,2,3);
        String darkSouls = "Dark souls 3";
        Steps.getBytes("9EiGch5PksQ.jpg");
        String link = "http://sberbank.ru";
        Allure.addAttachment("Результат", "text/plain", link);
    }
    @Epic(value ="" )
    @Test
    public void Test2() throws IOException {}
    }

