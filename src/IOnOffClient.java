public interface IOnOffClient {
    void SendActivate();
    void SendDeactivate();
    void SetServer(IOnOffServer s);

}
