package com.example.kafews;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Retrieve extends AppCompatActivity {

    TextView trvName, tstaName, tmaxim, tcuur;
    FirebaseDatabase mDatabase;
    DatabaseReference mRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrieve);

        tcuur = findViewById(R.id.textCurrl);
        tmaxim = findViewById(R.id.textMaxLv);
        trvName = findViewById(R.id.textRiver);
        tstaName = findViewById(R.id.textStation);

        mDatabase = FirebaseDatabase.getInstance();
        mRef = mDatabase.getReference();
        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                for (DataSnapshot ds: snapshot.getChildren()) {
                    Model model = ds.getValue(Model.class);
                    String cu = model.getCurrLevel();
                    String ma = model.getMaxLevel();
                    String st = model.getStation();
                    String rv = model.getRiverName();

                    tcuur.setText(cu);
                    tmaxim.setText(ma);
                    trvName.setText(rv);
                    tstaName.setText(st);
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }
}