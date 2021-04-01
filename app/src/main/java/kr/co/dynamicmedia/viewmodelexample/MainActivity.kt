    package kr.co.dynamicmedia.viewmodelexample

    import androidx.appcompat.app.AppCompatActivity
    import android.os.Bundle
    import android.view.View
    import android.widget.Button
    import android.widget.TextView
    import androidx.databinding.DataBindingUtil
    import androidx.lifecycle.Observer
    import androidx.lifecycle.ViewModelProvider
    import kr.co.dynamicmedia.viewmodelexample.databinding.ActivityMainBinding

    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            // 데이터 바인딩(ViewModel 연결)
            val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
            binding.vm = ViewModel()

            // AAC ViewModel
            val viewModel = ViewModelProvider(this).get(AccViewModel::class.java)
            viewModel.getInputText().observe(this, Observer <String>{ newStr ->
                binding.tvSample.text = newStr

            })

            binding.btn1.setOnClickListener {
                viewModel.updateText(binding.et1.text.toString())
            }
        }
    }