package br.chico.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import br.chico.recyclerview.model.Controller;
import br.chico.recyclerview.model.Person;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View view) {
        EditText editName;
        EditText editAge;

        editName = findViewById(R.id.editName);
        editAge = findViewById(R.id.editAge);

        double age = Double.parseDouble(editAge.getText().toString());

        Controller.listOfPeople.add(new Person(editName.getText().toString(), age));
    }

    public void open(View view) {
        Intent intent = new Intent(this, List.class);
        startActivity(intent);
    }
}
