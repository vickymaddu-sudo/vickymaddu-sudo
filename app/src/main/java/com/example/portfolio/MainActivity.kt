package com.example.portfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonSkills=findViewById<Button>(R.id.btnskills )
        val buttonEducation=findViewById<Button>(R.id.btnedu)
        val buttonProjects=findViewById<Button>(R.id.btnprojects)
        val buttonInternships=findViewById<Button>(R.id.btninternships)
        buttonSkills.setOnClickListener {
            intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }
        buttonEducation.setOnClickListener{
            intent= Intent(this,EducationAcitvity::class.java)
            startActivity(intent)
        }
        buttonProjects.setOnClickListener{
            intent= Intent(this,projectsActivity::class.java)
            startActivity(intent)
        }
        buttonInternships.setOnClickListener{
          intent= Intent(this,InternshipActivity::class.java)
            startActivity( intent)
        }
    }

}