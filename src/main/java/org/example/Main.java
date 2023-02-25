package org.example;


import org.example.controllers.UserController;
import org.example.model.*;
import org.example.utils.Validate;
import org.example.views.ViewUser;

public class Main {

    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationJSON("users.txt");
        Repository repository = new RepositoryFileJSON(fileOperation, new UserMapperJSON());
        Validate validate = new Validate();
        UserController controller = new UserController(repository,validate);
        ViewUser view = new ViewUser(controller, validate);
        view.run();
    }
}