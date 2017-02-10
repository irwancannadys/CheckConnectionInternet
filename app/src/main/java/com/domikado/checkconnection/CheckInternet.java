package com.domikado.checkconnection;
// Created by irwancannady (irwancannady@gmail.com) on 2/10/17 at 5:02 PM.

import android.app.Service;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class CheckInternet {

    Context context;

    public CheckInternet(Context context) {
        this.context = context;
    }

    public boolean isConnected(){

        ConnectivityManager conn = (ConnectivityManager) context.getSystemService(Service.CONNECTIVITY_SERVICE);
        if (conn != null){
            NetworkInfo info = conn.getActiveNetworkInfo();
            if (info != null){
                if (info.getState() == NetworkInfo.State.CONNECTED);
                return true;
            }
        }

        return false;
    }
}
