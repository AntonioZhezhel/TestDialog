package com.example.testdialog

import android.app.AlertDialog
import android.app.LauncherActivity
import android.app.LauncherActivity.ListItem
import android.content.ClipData
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.view.menu.MenuView
import java.util.jar.Attributes

class MainActivity : AppCompatActivity() {


    val nameList = mutableListOf<String>()
    var firstKitList = mutableListOf<String>("1", "2", "3 ")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun list(view: View) {
       val title = "Select preset"
        val builder = AlertDialog.Builder(this)
        builder.setTitle(title)
        //nameList
        builder.setPositiveButton("OK") { dialog, whichButton ->


        }

        builder.setNegativeButton("Cancel") { dialog, whichButton ->
        }
        builder.show()



    }
    fun add(view: View) {
        val alert = AlertDialog.Builder(this)
        val edittext = EditText(this)
        alert.setMessage("Enter title")
        alert.setTitle("Add new text")

        alert.setView(edittext)
        alert.setPositiveButton("Add") { dialog, whichButton ->

            nameList.add(edittext.text.toString())

        }

        alert.setNegativeButton("Cancel") { dialog, whichButton ->
        }
        alert.show()
    }
}
