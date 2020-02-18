package temple.edu.coloradapter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        
        final Spinner colorSpinner = findViewById(R.id.colorSpinner);
        final View activityLayout = findViewById(R.id.activityLayout);

        ColorAdapter colorAdapter = new ColorAdapter(this, colors);
        colorSpinner.setAdapter( colorAdapter );

        colorSpinner.setOnItemSelectedListener(new Spinner.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                activityLayout.setBackgroundColor( Color.parseColor((String) parent.getItemAtPosition(position)) );
                view.setBackgroundColor( Color.parseColor("white") );
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
