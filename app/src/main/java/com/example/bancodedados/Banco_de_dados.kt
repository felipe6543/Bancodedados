package com.example.bancodedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Banco_de_dados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_banco_de_dados)
    }
  val amount: TextView = findViewById(R.id.text_view_amount)
  val name: TextView = findViewById(R.id.text_view_name)
  val initials: TextView = findViewById(R.id.text_view_initials)
  val construct: TextView = findViewById(R.id.text_view_construct)
  val context: TextView = findViewById(R.id.text_view_context)
  val age: TextView = findViewById(R.id.text_view_age)
  val application: TextView = findViewById(R.id.text_view_application)
  val time: TextView = findViewById(R.id.text_view_application_time)
  val correction: TextView = findViewById(R.id.text_view_correction)
  val validity: TextView = findViewById(R.id.text_view_validity)
  val object: TextView = findViewById(R.id.text_view_object)
  val target: TextView = findViewById(R.id.text_view_target_audience)
  val description: TextView = findViewById(R.id.text_view_description)
  val items: TextView = findViewById(R.id.text_view_items)
  val professionals: TextView = findViewById(R.id.text_view_professionals_who_can_apply)

}