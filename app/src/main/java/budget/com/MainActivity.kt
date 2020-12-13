package budget.com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.SeekBar


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val seek = findViewById<SeekBar>(R.id.seekBar)
        val submit : Button = findViewById<Button>(R.id.button)
        val budget = findViewById<EditText>(R.id.editTextNumberDecimal2)
        val bills = findViewById<EditText>(R.id.editTextNumberDecimal3)
        val groceries = findViewById<EditText>(R.id.editTextNumberDecimal7)
        val housing = findViewById<EditText>(R.id.editTextNumberDecimal5)
        val other = findViewById<EditText>(R.id.editTextNumberDecimal6)
        val savings = findViewById<EditText>(R.id.editTextNumber)
        val total = findViewById<TextView>(R.id.textView14)
        submit.setOnClickListener{
            var x = budget.text.toString().toInt() - bills.text.toString().toInt() - groceries.text.toString().toInt() - housing.text.toString().toInt() - other.text.toString().toInt() - savings.text.toString().toInt() - total.text.toString().toInt()
            x = x * (savings.toString().toInt()/100)
            total.text = x.toString()
        }
    }
}