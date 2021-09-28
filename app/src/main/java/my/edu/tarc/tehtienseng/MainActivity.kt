package my.edu.tarc.tehtienseng

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnCa: Button = findViewById(R.id.buttonRenew)
        val age: TextView = findViewById(R.id.textAge)
        val msg: TextView = findViewById(R.id.messagePass)
        val cat: Spinner = findViewById(R.id.spinnerCat)



        btnCa.setOnClickListener{
            var userAge: Int = age.text.toString().toInt()

            if (userAge > 21 && cat.selectedItemPosition == 0  ){
                msg.text = "Your 5 years passport renew fee is RM 200"
            }
            else if (userAge <= 12){
                msg.text = "Your 5 years passport renew fee is RM 100 "
            }
            else if (cat.selectedItemPosition == 1 && userAge > 50 ) {
                msg.text = "Your 5 years passport renew fee is RM 100 "
            }
            else if (cat.selectedItemPosition == 2 && cat.selectedItemPosition == 4  ) {
                msg.text = "Your 5 years passport renew fee is RM 100 "
            }
            else if (cat.selectedItemPosition == 3 && userAge <= 21 ) {
                msg.text = "Your 5 years passport renew fee is RM 100 "
            }
            else if (cat.selectedItemPosition == 5  ) {
                msg.text = "Your 5 years passport renew fee is free "
            }
        }


    }




}