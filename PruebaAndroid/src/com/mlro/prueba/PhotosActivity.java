/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mlro.prueba;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Gallery;
import android.widget.ImageView;
 

@SuppressWarnings("deprecation")
public class PhotosActivity extends Activity {
	
	private static final String DEPRECATION = "deprecation";
	ImageView image;
    Gallery gallery;
    
    
    
    @Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photos_layout);
        
        image = (ImageView) findViewById(R.id.image);
        
        final Integer[] imagenes = { R.drawable.a, R.drawable.b, R.drawable.c,
                R.drawable.d, R.drawable.e,R.drawable.f,R.drawable.g
                };
  
        gallery = (Gallery) findViewById(R.id.gallery);
        gallery.setAdapter(new GalleryAdapter(this, imagenes));
        //al seleccionar una imagen, la mostramos en el centro de la pantalla a mayor tamaño
         
        //con esteeste listener, sólo se mostrarían las imágenes sobre las que se pulsa
        gallery.setOnItemClickListener(new OnItemClickListener()
        {
            @SuppressWarnings("rawtypes")
			public void onItemClick(AdapterView parent, View v, int position, long id)
            {
                image.setImageBitmap(BitmapUtils.decodeSampledBitmapFromResource(getResources(), imagenes[position], 50, 0));
            }
 
        });
          
        //con este otro listener se mostraría la imagen seleccionada en la galería, esto es, la que se encuentre en el centro en <a style="background: none repeat scroll 0% 0% transparent ! important; border: medium none ! important; display: inline-block ! important; float: none ! important; height: auto ! important; margin: 0px ! important; min-height: 0px ! important; min-width: 0px ! important; padding: 0px ! important; vertical-align: baseline ! important; width: auto ! important; text-decoration: underline ! important;" title="Click to Continue > by costmin" in_rurl="http://i.txtsrving.info/click?v=RVM6NDE0MjM6Mjg6Y2FkYTpiOTdmNTQ4YTMzNjU1MWU5YjA4MTk1YWMwZDdhOWY1Yjp6LTE3NDktNTQwOTY3OmRhbmllbG1lLmNvbToxODczNTM6MDo3NzFmZGRiN2YzOTk0ZDJkYmE0ZWUyMDc0ZGQ4ZDg4Zjox&subid=g-540967-b366460e40664e04ba8fcf75ee87d9dd-&data_test=rr_uk_mr3" id="_GPLITA_4" href="#">cadacada<img style="background: none repeat scroll 0% 0% transparent ! important; border: medium none ! important; display: inline-block ! important; float: none ! important; height: 10px ! important; margin: 0px 0px 0px 3px ! important; min-height: 0px ! important; min-width: 0px ! important; padding: 0px ! important; vertical-align: super ! important; width: 10px ! important;" src="http://cdncache-a.akamaihd.net/items/it/img/arrow-10x10.png"></a> momentomomento
//      gallery.setOnItemSelectedListener(new OnItemSelectedListener() {
//
//          @Override
//          public void onItemSelected(AdapterView parent, View v, int position, long id)
//          {
//              imagenSeleccionada.setImageBitmap(BitmapUtils.decodeSampledBitmapFromResource(getResources(), imagenes[position], 400, 0));
//          }
//
//          @Override
//          public void onNothingSelected(AdapterView<?> arg0)
//          {
//              // TODO Auto-generated method stub
//             
//          }
//      });
         
    }


	/**
	 * @return the deprecation
	 */
	public static String getDeprecation() {
		return DEPRECATION;
	}
     
 
 
}
