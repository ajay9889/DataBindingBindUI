package com.anushka.androidtutz.bindingdemo1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.anushka.androidtutz.bindingdemo1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding ;
    private ClickListnerHandler mClickListnerHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(
                this,
                R.layout.activity_main
        );
        binding.setStudent(new Student("Ajay", "ajay@poptv.sg"));
        mClickListnerHandler =new ClickListnerHandler(this);
        binding.setClickbuttonListner(mClickListnerHandler);
    }

}
