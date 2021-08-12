package com.example.contact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar

class ContactDetailActivity : AppCompatActivity() {

    private var contact: Contact? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_detail)

        //initToolbar()
        //getExtras()
        //bindViews()
    }

    private fun initToolbar() {
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun getExtras() {
        //contact = intent.getParcelableExtra(EXTRA_CONTACT)
    }

    companion object {
        const val EXTRA_CONTACT: String = "EXTRA_CONTACT"
    }

    private fun bindViews() {
        TODO("Not yet implemented")
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}