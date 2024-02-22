package project;

import project.provider_handler.DataHandler;
import project.provider_handler.DataProvider;

public class App {
    public static void main(String[] args) {

        DataHandler handler = new DataHandler();
        DataProvider provider = new DataProvider();
        handler.handleData(provider.getData(), handler.getConsumer());

    }
}
