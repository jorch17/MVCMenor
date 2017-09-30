package main;
import models.ModelMenor;
import views.ViewMenor;
import controllers.ControllerMenor;

public class Main {
        public static void main(String[] pj) {
        ModelMenor model_menor = new ModelMenor();
        ViewMenor view_menor = new ViewMenor();
        ControllerMenor controller_menor = new ControllerMenor(model_menor,view_menor );

    }
    
}
