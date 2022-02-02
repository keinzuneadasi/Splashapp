package com.example.splash

        import android.content.Intent
                import androidx.appcompat.app.AppCompatActivity
                import android.os.Bundle
                import android.os.Handler
                import android.view.animation.AnimationUtils
                import android.widget.ImageView
        import com.example.testapplication.MainActivity
        import com.example.testapplication.R
        import com.example.testapplication.TESTActivity2
        import java.util.jar.Manifest

                @Suppress("DEPRECATION")
                class SplashScreen : AppCompatActivity() {
                    override fun onCreate(savedInstanceState: Bundle?) {
                        super.onCreate(savedInstanceState)
                        setContentView(R.layout.activity_main)

                        val backgroundImage:ImageView = findViewById(R.id.imagesplash)
                        val sideAnimation = AnimationUtils.loadAnimation(this, R.anim.side_slide)
                        backgroundImage.startAnimation(sideAnimation)


                        Handler().postDelayed({
                            val intent = Intent(this, MainActivity::class.java)
                            startActivity(intent)
                            finish()
                        }, 10000) // delaying for 4 seconds...


                    }
}