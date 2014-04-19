/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mlro.prueba;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
 
public class SongsActivity extends Activity implements OnClickListener{
	
	Button btnPausa;
	Button btnRepro;
	MediaPlayer audio1;
    
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_layout);
        LinearLayout layout = new LinearLayout(this);
        btnRepro = new Button(this);
        btnRepro.setText("Reproducir");
        btnPausa = new Button(this);
        btnPausa.setText("Pausa");
        btnRepro.setOnClickListener(this);
        btnPausa.setOnClickListener(this);
        layout.addView(btnRepro);
        layout.addView(btnPausa);
        setContentView(layout);
        audio1 =  MediaPlayer.create(this, R.raw.s1 );
        audio1.setLooping(true);
    }
    @Override
	public void onClick(View v) {
		if(v==btnRepro){
			audio1.start();
		}else{
			if(v==btnPausa){
				audio1.pause();
			}
		}
		
	}
}
