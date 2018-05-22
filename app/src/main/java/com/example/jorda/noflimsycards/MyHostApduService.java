package com.example.jorda.noflimsycards;

import android.nfc.cardemulation.HostApduService;
import android.os.Bundle;


/**
  Created by jorda on 18/03/2018.
 */

public class MyHostApduService extends HostApduService {
    @Override
    public byte[] processCommandApdu(byte[] apdu, Bundle extras)
    {
        String stringToConvert = MainActivity.userId;
        byte[] responseApdu = stringToConvert.getBytes();
        sendResponseApdu(responseApdu);
        return null;
    }

    @Override
    public void onDeactivated(int reason) {

    }
}