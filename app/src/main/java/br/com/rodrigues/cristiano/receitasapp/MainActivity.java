package br.com.rodrigues.cristiano.receitasapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button botaoBolo;
    private Button botaoTorta;
    private Button botaoCookie;
    private Button botaoSorvete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoBolo = (Button) findViewById(R.id.btnBolo);
        botaoBolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentBolo = new Intent(MainActivity.this, BoloActivity.class);
                startActivity(intentBolo);
            }
        });

        botaoTorta = (Button) findViewById(R.id.btnTorta);
        botaoTorta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentTorta = new Intent(MainActivity.this, TortaActivity.class);
                startActivity(intentTorta);
            }
        });

        botaoCookie = (Button) findViewById(R.id.btnCookie);
        botaoCookie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCookie = new Intent(MainActivity.this, CookieActivity.class);
                startActivity(intentCookie);
            }
        });

        botaoSorvete = (Button) findViewById(R.id.btnSorvete);
        botaoSorvete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSorvete = new Intent(MainActivity.this, SorveteActivity.class);
                startActivity(intentSorvete);
            }
        });
    }
}
