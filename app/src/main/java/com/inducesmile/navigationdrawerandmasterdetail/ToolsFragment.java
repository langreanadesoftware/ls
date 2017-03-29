package com.inducesmile.navigationdrawerandmasterdetail;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ToolsFragment extends Fragment {
    private TextView txtosversion;


    public ToolsFragment() {
        // Required empty public constructor


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_tools, container, false);

        Log.e("Device",android.os.Build.DEVICE);

        final TextView texto = (TextView) view.findViewById(R.id.txtosversion);

        //texto.setText("Debug-infos:");
        texto.setText("Debug-infos:" + "\r\n"
                + "\r\n Time: " + Build.TIME + "\r\n"
                + "\r\n OS Version: " + System.getProperty("os.version") + "(" + android.os.Build.VERSION.INCREMENTAL + ")" + "\r\n"
                + "\r\n OS API Level: " + android.os.Build.VERSION.SDK + "\r\n"
                + "\r\n Device: " + android.os.Build.DEVICE + "\r\n"
                + "\r\n Brand: " + Build.BRAND + "\r\n"
                + "\r\n Manufacturer: " + Build.MANUFACTURER + "\r\n"
                + "\r\n Serial: " + Build.SERIAL + "\r\n"
                + "\r\n CODENAME: " + Build.VERSION.CODENAME + "\r\n"
                + "\r\n RELEASE: " + Build.VERSION.RELEASE + "\r\n"
                + "\r\n Model (and Product): " + android.os.Build.MODEL + " ("+ android.os.Build.PRODUCT + ")");

        // return inflater.inflate(R.layout.fragment_tools, container, false);
        return view;




    }


}
