package Controller;//Magnus Svendsen DAT16i

import Model.StageHandler;
import javafx.event.ActionEvent;

public class AController
{
    private StageHandler stageHandler = new StageHandler();

    public void onLogOutBtnPressed(ActionEvent actionEvent)
    {
        stageHandler.logOut();
    }
}
