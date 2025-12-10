package org.tesco.fp.lambda.higherorder;

@FunctionalInterface
interface Handler {
    void connect();
}

@FunctionalInterface
interface HttpGetHandler {
    void get(Object response);
}

class HandlerImpl implements Handler {
    @Override
    public void connect() {
        System.out.println("HandlerImpl");
    }
}

class HttpHandlerImpl implements HttpGetHandler {
    @Override
    public void get(Object response) {
        System.out.println(response);
    }
}

class Database {
    public void connectDb(Handler handler) {
        handler.connect();
    }
}

class HttpServer {
    public void fetch(HttpGetHandler httpHandler) {
        String fakeResponse = "Hello";
        httpHandler.get(fakeResponse);
    }
}

public class FunctionAsParms {
    public static void main(String[] args) {
        Database database = new Database();
        //traditional way : provide implementation
        database.connectDb(new HandlerImpl());
        //anonymous inner class
        database.connectDb(new Handler() {
            @Override
            public void connect() {
                System.out.println("Handler Anonymous Impl");
            }
        });
        //lambda version : passing function as parameter
        database.connectDb(() -> System.out.println("Lambda impl"));

        HttpServer httpServer = new HttpServer();
        //traditional way
        httpServer.fetch(new HttpHandlerImpl());
        //anonymous inner class way
        httpServer.fetch(new HttpGetHandler() {
            @Override
            public void get(Object response) {
                System.out.println(response);
            }
        });
        //lambda pattern
        httpServer.fetch((response)-> System.out.println(response));

    }
}
