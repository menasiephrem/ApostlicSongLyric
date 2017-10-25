package com.mekilit.apostlic.apostlicsonglyric;

import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Menasi on 8/1/2016.
 */
class ViewHolders {
    ImageView albumArt;
    TextView BigText;
    TextView SmallText;

    public ViewHolders(View view) {
        albumArt = (ImageView) view.findViewById(R.id.albumArt);
        BigText = (TextView) view.findViewById(R.id.BigText);
        SmallText = (TextView) view.findViewById(R.id.SmallText);


        if(ApostolicSongs.theme == R.style.AppTheme_Black){

            BigText.setTextColor(Color.WHITE);
            SmallText.setTextColor(Color.WHITE);

        }

    }
}