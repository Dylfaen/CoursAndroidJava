package com.example.cours;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.cours.testClasses.Wizard;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);

        Button submit = this.findViewById(R.id.create_wizard_submit_button);

        EditText nameEdit = findViewById(R.id.name_edit);
        EditText ageEdit = findViewById(R.id.age_edit);
        EditText spellEdit = findViewById(R.id.spell_edit);

        
        View.OnClickListener submitListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Wizard newWizard = new Wizard(nameEdit.getText().toString(), Integer.parseInt(ageEdit.getText().toString()), spellEdit.getText().toString());

                System.out.println(newWizard.name);

                Intent intent = new Intent(MainActivity.this, ToastActivity.class);
                intent.putExtra("WIZARD", newWizard);
                MainActivity.this.startActivity(intent);
            }
        };

        submit.setOnClickListener(submitListener);
    }
}