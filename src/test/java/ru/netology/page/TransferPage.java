package ru.netology.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Text;
import ru.netology.data.DataHelper;

import javax.annotation.CheckReturnValue;
import javax.annotation.Nonnull;

import static com.codeborne.selenide.Selenide.$;

public class TransferPage {
    private SelenideElement amountField = $("[data-test-id=\"amount\"] input");
    private SelenideElement fromField = $("[data-test-id=from] input");
    private SelenideElement transferButton = $("[data-test-id=action-transfer]");

    public void transferCard(DataHelper.CardInfo CardInfo, int amountToTransfer) {
        amountField.setValue(String.valueOf(amountToTransfer));
        fromField.setValue(CardInfo.getCardNumber());
        transferButton.click();
    }

    @CheckReturnValue
    @Nonnull
    public static Condition withText(String text) {
        return new Text("На балансе недостаточно средств");
    }
}


// public void overTransferThanCurrentBalance(DataHelper.CardInfo CardInfo, int amountToTransfer) {
//            amountField.setValue(String.valueOf(amountToTransfer));
//        if () {
//            fromField.setValue(CardInfo.getCardNumber());
//            transferButton.click();
//        else() {
//                System.out.println("На балансе недостаточно средств");
//                return (transferCard);
//            }
