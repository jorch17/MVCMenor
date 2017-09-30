package controllers;
import models.ModelMenor;
import views.ViewMenor;

public class ControllerMenor {
    ModelMenor model_menor;
    ViewMenor view_menor;
    
    public  ControllerMenor(ModelMenor model_menor, ViewMenor view_menor){
        this.model_menor = model_menor;
        this.view_menor = view_menor;
        initView();
        view_menor.jbtn_menor.addActionListener(event -> jtbn_menor_click());
        
    } 
    
        public void initView(){
        view_menor.jtf_n1.setText(String.valueOf(model_menor.getN1()));
        view_menor.jtf_n2.setText(String.valueOf(model_menor.getN2()));
        view_menor.jtf_n3.setText(String.valueOf(model_menor.getN3()));
        view_menor.jtf_m.setText(String.valueOf(model_menor.getM()));
        view_menor.setVisible(true);
    }
    public void jtbn_menor_click(){
        model_menor.setN1(Integer.parseInt(view_menor.jtf_n1.getText()));
        model_menor.setN2(Integer.parseInt(view_menor.jtf_n2.getText()));
        model_menor.setN3(Integer.parseInt(view_menor.jtf_n3.getText()));
        model_menor.menor();
        view_menor.jtf_m.setText(String.valueOf(model_menor.getM()));
    
    }
    
}
