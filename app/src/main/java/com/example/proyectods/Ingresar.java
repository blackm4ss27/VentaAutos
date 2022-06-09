package com.example.proyectods;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.util.Arrays;

public class Ingresar extends AppCompatActivity {
    EditText EMAIL,PAS;
    Button Login;
    TextView mloginBtn;
    ImageButton googlebtn;
    FirebaseAuth fAuth; // firebase autenticacion
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EMAIL = findViewById(R.id.mail);
        PAS = findViewById(R.id.password);
        Login = findViewById(R.id.btnLogin);
        mloginBtn = findViewById(R.id.crearText);
        googlebtn = findViewById(R.id.btnGoogle);
        progressBar = findViewById(R.id.progressBar);

        fAuth = FirebaseAuth.getInstance(); // recibiendo la isntancia para realizar todas las operaciones
        //2*** Verificar si el user ya inicio sesion o ya lo hizo
        //*** ver la cuenta antes o despues o es un user que regreso
        // *** current = obtener usuario actual
        if(fAuth.getCurrentUser()!= null){
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
            finish();
        }
        //**********
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // el método trim sirve manipulación de cadenas (String), el cual sirve para quitar los espacios a la cadena
                String email = EMAIL.getText().toString().trim();
                String password = PAS.getText().toString().trim();
                //validar los datos que se ingresaron
                if(TextUtils.isEmpty(email)){
                    EMAIL.setError("Email es requerido");
                    return;
                }
                if(TextUtils.isEmpty(password)){
                    PAS.setError("Password es requerido");
                    return;
                }
                //si es menor a 6 caracteres
                if(password.length()<6){
                    PAS.setError("Password tiene que ser  >=6 caracteres");
                    return;
                }
                // se hara visible cuando el proceso de registro se esta realizando
                progressBar.setVisibility(view.VISIBLE);


                //LOGIN EN FIREBASE
                //aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
                fAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        //si la tarea es exitosa
                        if (task.isSuccessful()){
                            Toast.makeText(Ingresar.this, "Login exitoso", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(Ingresar.this, MainActivity.class);
                            intent.putExtra("email", email);
                            startActivity(intent);
                        }
                        else{
                            Toast.makeText(Ingresar.this,
                                    " Se produjo un ERROR! Usuario Incorrecto" +task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                            progressBar.setVisibility(View.GONE);
                        }
                    }
                });
            }
        });
        //aa
        mloginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Registrarse.class));
            }
        });
    }
}