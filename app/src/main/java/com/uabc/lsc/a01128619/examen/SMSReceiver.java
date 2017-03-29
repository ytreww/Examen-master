package com.uabc.lsc.a01128619.examen;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Toast;

/**
 * Created by comp03A on 3/28/17.
 */

public class SMSReceiver extends BroadcastReceiver {

    private static final String ACTION_SMS_RECEIVED = "android.provider.Telephony.SMS_RECEIVED";
    private Intent smsIntent;
    private OnSMSReceiverListener onSMSReceiverListener;

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle intentExtras = intent.getExtras();

        if (intentExtras != null) {
            /* Get Messages */
            Object[] sms = (Object[]) intentExtras.get("pdus");

            for (int i = 0; i < sms.length; ++i) {
                /* Parse Each Message */
                SmsMessage smsMessage = SmsMessage.createFromPdu((byte[]) sms[i]);

                String phone = smsMessage.getOriginatingAddress();
                String message = smsMessage.getMessageBody().toString();

                Toast.makeText(context, phone + ": " + message, Toast.LENGTH_SHORT).show();
            }
        }
    }

    public interface OnSMSReceiverListener{
        public void onSMSReceived(String coord);
    }




}
