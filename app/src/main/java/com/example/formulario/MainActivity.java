package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class MainActivity extends AppCompatActivity {
    ImageView logotipo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logotipo = (ImageView)findViewById(R.id.imageViewLogotipo);
        RequestOptions crop = new RequestOptions().fitCenter();
        Glide.with(this)
                .load("https://mymodernmet.com/wp/wp-content/uploads/2019/11/koalas-habitat-destruction-bushfires.jpg")
                .apply(crop)
                .into(logotipo);
    }
}
