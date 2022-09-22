package com.example.contractexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.contractexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainContract.View<MainContract.Presenter> {

    private lateinit var binding: ActivityMainBinding
    override lateinit var presenter: MainContract.Presenter
    
    override fun onCreate(savedInstanceState: Bundle?) {
        // 필수적인 View 초기화 작업
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Presenter 초기화
        presenter = MainPresenter(this)
        presenter.start()

        // View 변경 작업 예시
        binding.showButton.setOnClickListener {
            presenter.growNumber() // 해당 함수는 다시 showData를 호출함
        }
    }
    
    override fun showData(data: Int) {
        binding.textview.text = data.toString()
    }
}