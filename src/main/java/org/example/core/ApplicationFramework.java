package org.example.core;

import lombok.Getter;
import lombok.Setter;
import org.example.view.GuiJavaFx;

@Getter
@Setter
public class ApplicationFramework {

    private static ApplicationFramework instance;


    public static ApplicationFramework getInstance(){
        if(instance==null){
            instance = new ApplicationFramework();
        }

        return instance;
    }

    public void start(){
        GuiJavaFx.launch(GuiJavaFx.class);
    }
}
