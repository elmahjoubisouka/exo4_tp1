package com.example.exo4_tp1;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNom, editEmail, editPhone, editAdresse, editVille;
    private Button btnCalcul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Récupération des vues
        editTextNom = findViewById(R.id.editTextNom);
        editEmail = findViewById(R.id.editEmail);
        editPhone = findViewById(R.id.editPhone);
        editAdresse = findViewById(R.id.editAdresse);
        editVille = findViewById(R.id.editVille);
        btnCalcul = findViewById(R.id.btn_Calcul);

        // Ajout d'un écouteur de clic sur le bouton "Envoyer"
        btnCalcul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Récupération des données saisies
                String nom = editTextNom.getText().toString();
                String email = editEmail.getText().toString();
                String phone = editPhone.getText().toString();
                String adresse = editAdresse.getText().toString();
                String ville = editVille.getText().toString();

                // Vérification que tous les champs sont remplis
                if (nom.isEmpty() || email.isEmpty() || phone.isEmpty() || adresse.isEmpty() || ville.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Veuillez remplir tous les champs", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Création d'une intention pour démarrer SummaryActivity
                Intent intent = new Intent(MainActivity.this, SummaryActivity.class);
                intent.putExtra("nom", nom);
                intent.putExtra("email", email);
                intent.putExtra("phone", phone);
                intent.putExtra("adresse", adresse);
                intent.putExtra("ville", ville);
                startActivity(intent);
            }
        });
    }
}
