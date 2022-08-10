package com.example.kafews;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Admin extends AppCompatActivity {
    EditText rvName, staName, maxim, cuur;
    FirebaseDatabase mDatabase;
    DatabaseReference mRef;
    Button btnisert;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        mAuth = FirebaseAuth.getInstance();
        rvName = findViewById(R.id.editRiverN);
        staName = findViewById(R.id.editStationN);
        maxim = findViewById(R.id.editMaxL);
        cuur = findViewById(R.id.editCurrL);
        btnisert = findViewById(R.id.buttonRiver);

        mDatabase = FirebaseDatabase.getInstance();
        mRef = mDatabase.getReference();

        btnisert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rv = rvName.getText().toString();
                String st = staName.getText().toString();
                String ma = maxim.getText().toString();
                String cu = cuur.getText().toString();

                if (rv.isEmpty() || st.isEmpty() || ma.isEmpty() || cu.isEmpty()) {
                    Toast.makeText(Admin.this, "Fill in all fields", Toast.LENGTH_SHORT).show();
                } else {
                    String userid = mRef.push().getKey();
                    Model model = new Model();
                    model.setRiverName(rv);
                    model.setStation(st);
                    model.setMaxLevel(ma);
                    model.setCurrLevel(cu);

                    mRef.child(userid).setValue(model, new DatabaseReference.CompletionListener() {
                        @Override
                        public void onComplete(@Nullable DatabaseError error, @NonNull DatabaseReference ref) {
                            if (error == null) {
                                Toast.makeText(Admin.this, "Insertion of Data was a success", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(Admin.this, Retrieve.class);
                                startActivity(intent);
                            } else {
                                Toast.makeText(Admin.this, "Encountered some errors", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });

                }

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuadmin,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int item_id = item.getItemId();

        if (item_id ==R.id.menuLogout) {
            mAuth.signOut();
            startActivity(new Intent(Admin.this, MainActivity.class));
        }
        return true;
    }

}