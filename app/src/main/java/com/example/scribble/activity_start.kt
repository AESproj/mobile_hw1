package com.example.scribble
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*


class activity_start : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        var textview_fact: TextView = findViewById(R.id.textview_fact)
        var flag : String = "funny"
        val spinnerVal : Spinner = findViewById(R.id.spinner_categories)
        val options = arrayOf("select category here","funny","psychology","animals","physics")
        spinnerVal.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options )
        spinnerVal.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag = options.get(p2) //p2 is the index of selected item
                textview_fact.text=getFact(flag)

            }
            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
        /*
        start.setOnClickListener {
            val intent = Intent(this, activity_start::class.java)
            startActivity(intent)
        }*/


    }
}
public fun getFact(str: String): String {
    var fact: String = "ready to learn a fact?"
    val funny = arrayOf("A man once wore 60 shirts and 9 pairs of jeans to the airport to avoid extra fees",
        "cows produce 3% less milk when listening to country music",
       " The CDC website has a zombie preparedness section"
    )
    //https://facts.net/funny-facts/
    //https://stacks.cdc.gov/view/cdc/6023
    val psychology = arrayOf("Your brain can store 2,500,000 gigabytes of info!",
        "Sweating can temporarily shrink the brain.",
        "The brain generates between 12 and 25 watts of electricity—that’s enough to power a low wattage light bulb!")
    //https://legacybox.com/blogs/analog/25-brain-facts-blow-mind
    val animals = arrayOf("Turkeys have a vision of 270°.",
        "Dalmatians are born without spots!","Polar bear skin is black!")
    //https://animalmedical.org/fun-facts
    val physics = arrayOf("Physics originated from astronomy, mathematics, and natural philosophy in 3000 B.C.",
        "Thales was the first physicist. He believed the world was only built from one element: water",
        "Newton formed the Laws of Motion in 1687.\n"
    )
    //https://facts.net/physics-facts/
    var num: Int=(0..2).random()
    when(str){
        "funny"->fact=funny[num]
        "psychology"->fact=psychology[num]
        "animals"->fact=animals[num]
        "physics"->fact=physics[num]
    }
    return fact
}
