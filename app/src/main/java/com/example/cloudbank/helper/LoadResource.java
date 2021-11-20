package com.example.cloudbank.helper;

import android.content.Context;
import android.util.Log;

public class LoadResource {


    private static Context context;

    public LoadResource(Context acontext) {
        this.context = acontext;
    }

    static  public int getMipmapResIdByName(String resName)  {
        String pkgName = context.getPackageName();
        // Return 0 if not found.

        int resID = context.getResources().getIdentifier(resName,"drawable",pkgName);
        System.out.println(" this photo "+pkgName);
        Log.i("CustomListView", "Res Name  : "+ resName+"==> Res ID = "+ resID);
        return resID;
    }
}
