package bm.it.mobile.sample.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import bm.it.mobile.sample.R
import bm.it.mobile.sample.repository.UserRepository
import bm.it.mobile.sample.viewModel.UserViewModel

class UserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        addFragmentTo(R.id.content_frame, createFragment())
    }

    private fun createFragment(): UserFragment {
        return UserFragment()
    }

    private fun addFragmentTo(
        containerId: Int,
        fragment: Fragment,
        tag: String = ""
    ) {
        supportFragmentManager.beginTransaction().add(containerId, fragment, tag).commit()
    }
}
