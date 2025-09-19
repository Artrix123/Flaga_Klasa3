package ph.kostki.app1;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        textViewPytanie=findViewById(R.id.textView);
    }

    private  int proby=0;
    private TextView textViewPytanie;
    public void test(View view) {
        if (proby!=3) {
            Toast.makeText(this, R.string.Dobra, Toast.LENGTH_SHORT).show();
            view.setVisibility(view.INVISIBLE);
            proby++;
        }
        else{
            textViewPytanie.setText(R.string.Congrats);
            view.setVisibility(view.INVISIBLE);
        }
    }

    public void dobry(View view) {
            Toast.makeText(this, R.string.Wrong, Toast.LENGTH_SHORT).show();
    }
}