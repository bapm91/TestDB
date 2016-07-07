package com.example.user.testdb;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

public class App extends Application {

    public static List<CardsModel> CardListDataset() {
        List<CardsModel> cardsModelList = new ArrayList<>();
        cardsModelList.add(new CardsModel("1", "testTitle", "testBody", "06.07.16", "06.07.16", "16.07.16", "5"));

        return cardsModelList;
    }

    public static List<CardsModel> getCardsModelList() {
        return CardListDataset();
    }


}
