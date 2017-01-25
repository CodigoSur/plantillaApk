package com.itcr.plantillaapk;

import android.content.Context;
import android.content.Intent;

import java.io.IOException;

public class InterrupcionAudifonos extends android.content.BroadcastReceiver {

    private Stream stream;

    public InterrupcionAudifonos(Context contexto) throws IOException {
        stream = Stream.construirStream("", contexto);
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(
                android.media.AudioManager.ACTION_AUDIO_BECOMING_NOISY)) {
            stream.stop();
        }
    }


}