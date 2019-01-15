package Selenium.BaiTapCK;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty" }, features = {
		"src\\test\\resources\\Selenium\\BaiTapCK\\DangKyNhanTin.feature" }, glue = "stepdefinitions"
		, tags = { "@tag3" }

)
public class RunCucumberTest {
}
