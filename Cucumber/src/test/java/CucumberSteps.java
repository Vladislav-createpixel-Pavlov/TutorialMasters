import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.af.En;
import io.cucumber.java.en.Given;
import io.cucumber.java.ru.*;
import io.qameta.allure.Step;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CucumberSteps
{
    int summ;
    int summ2;

    @Before(value = "~@success")
    public void SetData()
    {
        System.out.println("Pre-condition");
    }
    @After
    public void DelData()
    {
        System.out.println("Post-con");
    }
    @Before(value = "@correct")
    public void SetData1()
    {
        System.out.println("Pre-condition");
    }

    @ParameterType("red|blue|yellow")  // regexp
    public Color color(String color){  // type, name (from method)
        return new Color(color.hashCode());       // transformer function
    }
    @Step
    @Дано("^на счете пользователя имеется (\\d+) рублей$")
    public void наСчетеПользователяИмеетсяРублей(int arg1) throws Throwable {
        summ = arg1;
    }
    @Step
    @Дано("У меня есть мяч {color} цвета")
    public void мячЦвета(Color color) throws Throwable {
        System.out.println(color.toString());
    }
    @Step
    @Когда("пользователь снимает со счета {int} рублей")
    public void пользовательСнимаетСоСчетаРублей(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        summ2 = arg1;
    }
    @Step
    @Когда("^в меню доступны пункты$")
    public void пользовательЛист1(List<String> args) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(args.size());
    }

    @Когда("^в меню доступны пункты1$")
    public void пользовательТаблица(DataTable table) throws Throwable {
        List<Map<String,String>> ar = table.asMaps(String.class,String.class);
        System.out.println(ar.size());
        System.out.println(ar.getFirst());
        }
    @Step
    @Тогда("^появляется предупреждение \"([^\"]*)\"$")
    public void появляетсяПредупреждение(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        if(summ<summ2)
            System.out.println(arg1);
    }
    @Step
    @Дано("^выводиться сообщение$")
    public void выводитьсяСообщение(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
            System.out.println(arg1);
    }
    @Step
    @Тогда("^вывод предыстории \"([^\"]*)\"$")
    public void выводПредыстории(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(arg1);
    }
}
