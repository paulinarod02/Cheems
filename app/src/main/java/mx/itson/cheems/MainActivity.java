package mx.itson.cheems;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public int ubicacion = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciar();

        Button btnIniciar = (Button)findViewById(R.id.btnReiniciar);
        btnIniciar.setOnClickListener(this);

        for(int i=1;i<=12;i++){
            ImageButton btnSeleccion = (ImageButton)  findViewById((
                    getResources().getIdentifier("opcion"+i, "id", this.getPackageName())));
            btnSeleccion.setOnClickListener(this);
        }

    }

    public void iniciar(){
        (findViewById(R.id.opcion1)).setBackgroundResource(R.drawable.icon_pregunta);
        (findViewById(R.id.opcion2)).setBackgroundResource(R.drawable.icon_pregunta);
        (findViewById(R.id.opcion3)).setBackgroundResource(R.drawable.icon_pregunta);
        (findViewById(R.id.opcion4)).setBackgroundResource(R.drawable.icon_pregunta);
        (findViewById(R.id.opcion5)).setBackgroundResource(R.drawable.icon_pregunta);
        (findViewById(R.id.opcion6)).setBackgroundResource(R.drawable.icon_pregunta);
        (findViewById(R.id.opcion7)).setBackgroundResource(R.drawable.icon_pregunta);
        (findViewById(R.id.opcion8)).setBackgroundResource(R.drawable.icon_pregunta);
        (findViewById(R.id.opcion9)).setBackgroundResource(R.drawable.icon_pregunta);
        (findViewById(R.id.opcion10)).setBackgroundResource(R.drawable.icon_pregunta);
        (findViewById(R.id.opcion11)).setBackgroundResource(R.drawable.icon_pregunta);
        (findViewById(R.id.opcion12)).setBackgroundResource(R.drawable.icon_pregunta);

        Random random = new Random();
        ubicacion = random.nextInt(11)+1;

    }

    public void destapar(int opcion){
        if(opcion == ubicacion){
            // Ya perdió
            Toast.makeText(this, "¡PERMDISTE!", Toast.LENGTH_LONG).show();
            Toast.makeText(this"GANAMSTE!", Toast.LENGTH_SHORT).show();

            for(int i =1; i<=12; i++){
                // Iteramos cada carta (o botón)
                ImageButton btnSeleccion = (ImageButton)  findViewById((
                        getResources().getIdentifier("opcion"+i, "id", this.getPackageName())));
                if(i == opcion){
                    // Se destapa la carta mala del cheems llorando
                    btnSeleccion.setBackgroundResource(R.drawable.icon_cheems_llora);

                 if(i == opcion){
                        // Se destapa la carta mala del cheems llorando
                        btnSeleccion.setBackgroundResource(R.drawable.icon_cheems_win);
                }else{
                    // Todas las cartas restantes se destapan con el cheems normal
                    btnSeleccion.setBackgroundResource(R.drawable.icon_cheems);
                }
            }
        }else{
            // No perdió todavía, por lo tanto se destapa solo esa carta con el cheems normal
            ImageButton btnSeleccion = (ImageButton)  findViewById((
                    getResources().getIdentifier("opcion"+opcion, "id", this.getPackageName())));
            btnSeleccion.setBackgroundResource(R.drawable.icon_cheems);
        }
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.opcion1){
            destapar(1);
        } else if(view.getId() == R.id.opcion2){
            destapar(2);
        }else if(view.getId() == R.id.opcion3){
            destapar(3);
        }else if(view.getId() == R.id.opcion4){
            destapar(4);
        }else if(view.getId() == R.id.opcion5){
            destapar(5);
        }else if(view.getId() == R.id.opcion6){
            destapar(6);
        }else if(view.getId() == R.id.opcion7){
            destapar(7);
        }else if(view.getId() == R.id.opcion8){
            destapar(8);
        }else if(view.getId() == R.id.opcion9){
            destapar(9);
        }else if(view.getId() == R.id.opcion10){
            destapar(10);
        }else if(view.getId() == R.id.opcion11){
            destapar(11);
        }else if(view.getId() == R.id.opcion12){
            destapar(12);
        }
    }
}