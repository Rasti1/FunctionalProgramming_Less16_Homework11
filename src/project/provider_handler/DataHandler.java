package project.provider_handler;

import project.entity.User;
import project.outputer.Outputer;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class DataHandler {

    final AtomicInteger counter = new AtomicInteger(1);

    public void handleData(List<User> list, Consumer<User> consumer) {

        for (User user : list) {
            System.out.print(counter.getAndIncrement() + ") ");
            consumer.accept(user);
        }

    }

    public Consumer<User> getConsumer() {

        return contact ->
                new Outputer().getOutput(contact.toString());

    }
}
