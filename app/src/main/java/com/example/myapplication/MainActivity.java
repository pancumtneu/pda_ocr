package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;

import com.example.common.CameraSurfaceView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener, CameraSurfaceView.OnTextureChangedListener  {
    private static final String TAG = MainActivity.class.getSimpleName();
    CameraSurfaceView svPreview;
    TextView tvStatus;
    ImageButton btnSwitch;
    ImageButton btnShutter;
    ImageButton btnSettings;

    String savedImagePath = "";
    int lastFrameIndex = 0;
    long lastFrameTime;
    Native predictor = new Native();
    @Override
    public void onClick(View view) {

    }

    @Override
    public boolean onTextureChanged(int inTextureId, int outTextureId, int textureWidth, int textureHeight) {
        return false;
    }
}
