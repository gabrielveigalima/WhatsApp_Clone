package gabrielveigalima.com.br.whatsapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import gabrielveigalima.com.br.whatsapp.R;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference referenceFirebase = FirebaseDatabase.getInstance().getReference();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        referenceFirebase.child( "Pontos").setValue(100);
    }
}
