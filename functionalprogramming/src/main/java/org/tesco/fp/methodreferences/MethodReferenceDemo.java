package org.tesco.fp.methodreferences;

@FunctionalInterface
interface Printer {
    void print(String value);
}

@FunctionalInterface
interface HTTPGetHandler {
    void get(Object response);
}

class HttpServer {
    public void fetch(HTTPGetHandler httpGetHandler) {
        String fakeResponse = "hello";
        httpGetHandler.get(fakeResponse);
    }
}

class MicroTaskRunner {
    public static void startMicroTaskStatic() {
        for (int i = 0; i < 5; i++) {
            System.out.println("MicroTaskRunner Static " + Thread.currentThread().getName());
        }
    }

    public void startMicroTask() {
        for (int i = 0; i < 5; i++) {
            System.out.println("MicroTask Runner class " + Thread.currentThread().getName());
        }
    }
}

class Loop {
    //runable target code
    private void startMicroTask() {
        for (int i = 0; i < 5; i++) {
            System.out.println("MicroTask: " + Thread.currentThread().getName());
        }
    }

    public void start() {
        Thread thread = null;
        thread = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        });
        thread.start();
        //Runnable target code in separate method
        thread = new Thread(() -> {
            this.startMicroTask();
        });
        thread.start();
        thread = new Thread(() -> this.startMicroTask());
        thread.start();
        //method referece
        thread = new Thread(this::startMicroTask);
        thread.start();
        //in a separate class : lambda reference
        thread = new Thread(() -> new MicroTaskRunner().startMicroTask());
        thread.start();
        thread = new Thread(() -> MicroTaskRunner.startMicroTaskStatic());
        thread.start();
        //in a separate class: using method reference
        thread = new Thread(new MicroTaskRunner()::startMicroTask);
        thread.start();
        thread = new Thread(MicroTaskRunner::startMicroTaskStatic);
        thread.start();

    }
}

public class MethodReferenceDemo {
    public static void main(String[] args) {
        Printer printer = null;
        //lambda
        printer = value -> System.out.println(value);
        printer.print("Subramanian");
        //using method reference: simplified version of lambda
        printer = System.out::println;
        printer.print("Subramanian using method reference");

        HttpServer httpServer = new HttpServer();
        //lambda version
        httpServer.fetch((response -> {
            System.out.println(response);
        }));
        //method reference version
        httpServer.fetch(System.out::println);

        Loop loop = new Loop();
        loop.start();

    }
}
