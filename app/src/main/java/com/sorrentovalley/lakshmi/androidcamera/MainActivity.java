package com.sorrentovalley.lakshmi.androidcamera;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
Button button;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    button=(Button)findViewById(R.id.button_photo);
        imageView=(ImageView)findViewById(R.id.imageView_photo);

        button.setOnClickListener(new View.OnClickListener()
        {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(intent, 0);
        }
    });
}

    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        // TODO Auto-generated method stub
        super.onActivityResult(requestCode, resultCode, data);

        Bitmap bp = (Bitmap) data.getExtras().get("data");
        imageView.setImageBitmap(bp);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}
