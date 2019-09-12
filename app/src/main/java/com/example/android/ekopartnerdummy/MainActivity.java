package com.example.android.ekopartnerdummy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.Button;

import android.view.View;

import android.content.Intent;



public class MainActivity extends AppCompatActivity {


    private Button buttonSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();

    }


    public void addListenerOnButton() {

        System.out.println("===========================================");

        buttonSum = (Button) findViewById(R.id.button_send);

        buttonSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                System.out.println("========..............===== LLLLLLLLLLLL====== 1 ==...........======================");
                System.out.println("=======.............=====LLLLLLLLLLLLLLLLLLLL  2  LLLLL=========...........======================");
                System.out.println("=====================...........=============== 3 =======");
                System.out.println("======...................===============.......   4   ....======================");


                int AEPS_REQUEST_CODE = 10923;
// Set a value to AEPS_REQUEST_CODE

                Intent intent = new Intent(MainActivity.this, EkoPayActivity.class);
                Bundle bundle = new Bundle();

// set partner parameters
                String environment = "uat";
                String developer_key = "becbbce45f79c6f5109f848acd540567";
                String initiator_id  = "7411111111";
                String user_code = "20310001";
                String initiator_logo_url = "https://files.eko.co.in:8080/docs/logos/payment/dummy-partner-logo.png";
                String partner_name = "PARTNER Name INC";
                String language = "en";
                String secret_key_timestamp =  "1568274099712";

                String secret_key = "ZZWwfI1d0W3SC7XAiPh0g5xFXVZO/PJhRyXAB2mwR+w=";


                String callback_url = "https://beta.ekoconnect.in:20011/connect/callback";

                bundle.putString("environment", environment);
// Optional
// Default value "production"  If environment not passed then, default environment will be "production"
// Expected values "uat" for beta testing or"production" for production environment

                bundle.putString("product","aeps");
// mandatory



                bundle.putString("secret_key_timestamp", secret_key_timestamp);
// mandatory

                bundle.putString("secret_key", secret_key);
// mandatory

                bundle.putString("developer_key", developer_key);
// mandatory

                bundle.putString("initiator_id", initiator_id);
// mandatory


                bundle.putString("callback_url", callback_url);
// mandatory

                bundle.putString("user_code", user_code);
// mandatory


                bundle.putString("initiator_logo_url", initiator_logo_url);
// mandatory

                bundle.putString("partner_name" , partner_name);
// mandatory


                bundle.putString("language", language);


                System.out.println("BUTTON CLICKED...............");

                intent.putExtras(bundle);



                startActivityForResult(intent, AEPS_REQUEST_CODE);


            }

        });


    }

}
