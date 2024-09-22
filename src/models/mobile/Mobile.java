package models.mobile;

import Interface.mobile.IMobile;
import Interface.mobile.ITelephone;

public class Mobile implements IMobile, ITelephone {
    private long IEMICode;
    private boolean IsSingleSIM;
    private String Processor;
    private boolean SIMCard;
    private long mobileNo;

    public Mobile(long imei, long mobileNo) {
        this.IEMICode = imei;
        this.mobileNo = mobileNo;

    }

    public void connectBluetooth() {

    }

    public void dial() {

    }

    public long getEMICode() {

        return IEMICode;
    }

    public void getWiFiConnection() {

    }

    public void receiveMessage() {

    }

    public void sendMessage(String message) {


    }

    @Override
    public void dialNumber() {

    }

    @Override
    public void callNumber() {

    }

    @Override
    public void listenVoicemail() {

    }

    @Override
    public void sendText(String text) {

    }
}
