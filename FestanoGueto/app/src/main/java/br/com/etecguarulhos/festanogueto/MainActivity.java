package br.com.etecguarulhos.festanogueto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.btnConfirm = findViewById(R.id.btn_confirm);

        this.mViewHolder.btnConfirm.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btn_confirm){
            Intent intent = new Intent(this,DetailsActivity.class);
            startActivity(intent);
        }
    }

    private static class ViewHolder {
        Button btnConfirm;
    }
}