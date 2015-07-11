Fluent Page for Selenium/Thucydides
===================================

Fluent Page is a Selenium/Thucydides PageObject extension adding a bit more functionality to your average PageObject.
By making a PageObject extend `net.jockx.fluentpage.Page` class you can easily chain assertions, logging statements and
PageObject's own methods while keeping reference to the page currently processed by WebDriver method calls.

Features:
---------
- Handle Page Factory initiation automatically - no need to provide constructors for pageObjects
- Static access to all your `PageObject` instances
```java
Page.get(SomePageObject.class);
Page.navigateTo(SomePageObject.class);
Page.waitForPage(SomePageObject.class);
```
- Fluent access to logger and assertions
```java
Page.navigateTo(SomePage.class)
    .clickButton()
    .assertion.assertTrue(condition, "Message")
    .logger.info("Some logging statement")
    .clickAnotherButton()
```
Usage:
------
- Declare class the following way:
```java
public class MyPageObject extends Page<MyPageObject>
```
- Optionally override navigateTo() and waitToLoad()
- Return a reference to one of your PageObjects from any action method call
```java
PageB clickGoToPageB(){
    gotoPageA.click();
    return Page.navigateTo(PageB.class);
}
```