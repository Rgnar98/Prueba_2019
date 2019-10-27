public class Button implements IOnOffClient {
    private IOnOffServer server;
    private boolean state;

    public Button(){
        this.state = false;
    }

    private void Push(){
        state = !state;
        if(state)
            SendActivate();
        else
            SendDeactivate();
    }

    @Override
    public void SendActivate() {
        server.Activate();
    }

    @Override
    public void SendDeactivate() {
        server.Deactivate();
    }

    @Override
    public void SetServer(IOnOffServer server){
        this.server = server;
    }
}
