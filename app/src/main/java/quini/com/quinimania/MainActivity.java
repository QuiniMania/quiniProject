package quini.com.quinimania;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //mostrar fecha actual:
        Calendar calendar = Calendar.getInstance();
        int dia = calendar.get(Calendar.DAY_OF_MONTH);
        int mes = calendar.get(Calendar.MONTH);
        mes = mes + 1;
        int anio = calendar.get(Calendar.YEAR);

        TextView fecha = (TextView) findViewById(R.id.textViewFechaHoy);

        fecha.setText(dia + "/" + mes + "/" + anio);


        //animacion logo:
        //Animation animacion = AnimationUtils.loadAnimation(this, R.anim.animacion);

        //ImageView bordeSuperior = (ImageView) findViewById(R.id.bordeSuperiorLogo);
        //bordeSuperior.startAnimation(animacion);

        //ImageView bordeInferior = (ImageView) findViewById(R.id.bordeInferiorLogo);
        //bordeInferior.startAnimation(animacion);

        //animar bolas
        Animation animacion2 = AnimationUtils.loadAnimation(this, R.anim.animacion2);

        ImageView bola32 = (ImageView) findViewById(R.id.bola32);
        bola32.startAnimation(animacion2);

        Animation animacion3 = AnimationUtils.loadAnimation(this, R.anim.animacion3);

        ImageView bola3 = (ImageView) findViewById(R.id.bola3);
        bola3.startAnimation(animacion3);

        //pasar a JugarActivity

        ImageButton botonJugar = (ImageButton) findViewById(R.id.imageButtonJugar);

        botonJugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, JugarActivity.class);
                startActivity(intent);
            }
        });

        //pasar a MisJugadasActivity

        ImageButton botonMisJugadas = (ImageButton) findViewById(R.id.imageButtonMisJugadas);

        botonMisJugadas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MisJugadasActivity.class);
                startActivity(intent);
            }
        });

        //pasar a UltimoSorteoActivity

        ImageButton botonUltimoSorteo = (ImageButton) findViewById(R.id.imageButtonUltimoSorteo);

        botonUltimoSorteo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UltimoSorteoActivity.class);
                startActivity(intent);
            }
        });

        //pasar a LosSalidoresActivity

        ImageButton botonLosSalidores = (ImageButton) findViewById(R.id.imageButtonSalidores);

        botonLosSalidores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LosSalidoresActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();


        if (id == R.id.opcion_jugar)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
