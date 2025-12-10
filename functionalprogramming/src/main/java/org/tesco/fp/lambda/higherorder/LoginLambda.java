package org.tesco.fp.lambda.higherorder;

@FunctionalInterface
interface Resolve {
    void resolve(Object response);
}

@FunctionalInterface
interface Reject {
    void reject(Object error);
}

class Login {
    public void login(String userName, String password, Resolve res, Reject rej) {
        if (userName.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
            res.resolve("Login success");
        } else {
            rej.reject("Login Failed");
        }
    }
}

public class LoginLambda {
    public static void main(String[] args) {
        Login auth = new Login();
        auth.login("admin", "admin", response ->
                        System.out.println(response)
                , error -> System.out.println(error));
    }
}
