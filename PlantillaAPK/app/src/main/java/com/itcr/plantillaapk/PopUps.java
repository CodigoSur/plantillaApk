package com.itcr.plantillaapk;


import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;

public class PopUps extends AppCompatActivity {

    public void popUpSalir(Context context){
        AlertDialog.Builder salirApp = new AlertDialog.Builder(context);
        salirApp.setTitle("Salir");
        salirApp.setIcon(R.drawable.ic_exit_to_app_black_24dp);
        salirApp.setMessage("¿Estás seguro que deseas salir?");
        salirApp.setPositiveButton("Salir", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                System.exit(0);
            }
        });

        salirApp.setNegativeButton("Cancelar", null);
        salirApp.show();
    }
}
