/*
 * Copyleft (c) 2013. This code is for learning purposes only. Do whatever you like with it but don't take it as perfect code.
 * This code lab has been developed by Michel Racic (http://rac.su/+) and funded partially by Credit Suisse AG (http://www.credit-suisse.ch) and GDG Zürich (http://www.gdgzh.ch).
 */

package ch.racic.selenium.poptalk.calc;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalcPage implements ICalcPage{

    @FindBy(id = "result")
    private WebElement display;

    @FindBy(id="calculator-button-ac")
    private WebElement clear;

    @FindBy(id="calculator-button-ce")
    private WebElement clearEntry;

    @FindBy(id="calculator-button-backspace")
    private WebElement backspace;

    @FindBy(id="calculator-button-%")
    private WebElement percent;

    @FindBy(id="calculator-button-÷")
    private WebElement divide;

    @FindBy(id="calculator-button-x")
    private WebElement multiply;

    @FindBy(id="calculator-button--")
    private WebElement substract;

    @FindBy(id="calculator-button-+")
    private WebElement add;

    @FindBy(id="calculator-button-=")
    private WebElement equal;

    @FindBy(id="calculator-button-.")
    private WebElement dot;

    @FindBy(id="calculator-button-0")
    private WebElement n0;

    @FindBy(id="calculator-button-1")
    private WebElement n1;

    @FindBy(id="calculator-button-2")
    private WebElement n2;

    @FindBy(id="calculator-button-3")
    private WebElement n3;

    @FindBy(id="calculator-button-4")
    private WebElement n4;

    @FindBy(id="calculator-button-5")
    private WebElement n5;

    @FindBy(id="calculator-button-6")
    private WebElement n6;

    @FindBy(id="calculator-button-7")
    private WebElement n7;

    @FindBy(id="calculator-button-8")
    private WebElement n8;

    @FindBy(id="calculator-button-9")
    private WebElement n9;

    public double displayed() {
        return Double.valueOf(display.getText());
    }

    public ICalcPage clear() {
        clear.click();
        return this;
    }

    public ICalcPage clearEntry() {
        clearEntry.click();
        return this;
    }

    public ICalcPage backspace() {
        backspace.click();
        return this;
    }

    public ICalcPage percent() {
        percent.click();
        return this;
    }

    public ICalcPage divide() {
        divide.click();
        return this;
    }

    public ICalcPage multiply() {
        multiply.click();
        return this;
    }

    public ICalcPage add() {
        add.click();
        return this;
    }

    public ICalcPage substract() {
        substract.click();
        return this;
    }

    public double equal() {
        equal.click();
        return Double.valueOf(display.getText());
    }

    public ICalcPage dot() {
        dot.click();
        return this;
    }

    public ICalcPage n0() {
        n0.click();
        return this;
    }

    public ICalcPage n1() {
        n1.click();
        return this;
    }

    public ICalcPage n2() {
        n2.click();
        return this;
    }

    public ICalcPage n3() {
        n3.click();
        return this;
    }

    public ICalcPage n4() {
        n4.click();
        return this;
    }

    public ICalcPage n5() {
        n5.click();
        return this;
    }

    public ICalcPage n6() {
        n6.click();
        return this;
    }

    public ICalcPage n7() {
        n7.click();
        return this;
    }

    public ICalcPage n8() {
        n8.click();
        return this;
    }

    public ICalcPage n9() {
        n9.click();
        return this;
    }
}
