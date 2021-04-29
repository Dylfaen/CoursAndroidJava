package com.example.cours;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.cours.testClasses.Wizard;

public class ToastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);

        Wizard wizard = (Wizard) this.getIntent().getSerializableExtra("WIZARD");

        TextView nameTextView = findViewById(R.id.name);
        nameTextView.setText(wizard.name);

        Button shoutName = findViewById(R.id.shout_button);
        shoutName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wizard.shoutName();
            }
        });

        Button castSpell = findViewById(R.id.cast_spell);
        castSpell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wizard.castSpell();
            }
        });


    }
}