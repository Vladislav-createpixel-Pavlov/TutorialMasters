import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Steps
{
    @Step(value = "Проверка, что сумма чисел {num1} и {num2} равна {result}")
    public static void CheckSumTest(int num1,int num2,int result)
    {
        Assertions.assertTrue(num1+num2 == result);
    }
    @Attachment(value = "Вложение", type = "image/jpg", fileExtension = ".jpg")
    public static byte[] getBytes(String resourceName) throws IOException {
        return Files.readAllBytes(Paths.get("src/test/resources", resourceName));
    }
}
