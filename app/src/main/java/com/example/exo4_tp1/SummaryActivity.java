package com.example.exo4_tp1;



import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SummaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        // Récupération des données passées
        Intent intent = getIntent();
        String nom = intent.getStringExtra("nom");
        String email = intent.getStringExtra("email");
        String phone = intent.getStringExtra("phone");
        String adresse = intent.getStringExtra("adresse");
        String ville = intent.getStringExtra("ville");

        // Initialisation des TextViews pour afficher les données
        TextView textViewSummary = findViewById(R.id.textViewSummary);
        String summary = "Nom : " + nom + "\n" +
                "Email : " + email + "\n" +
                "Téléphone : " + phone + "\n" +
                "Adresse : " + adresse + "\n" +
                "Ville : " + ville;

        textViewSummary.setText(summary);
    }
}
