package examples.aaronhoskins.com.mvvmdemo.view.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import examples.aaronhoskins.com.mvvmdemo.R;
import examples.aaronhoskins.com.mvvmdemo.databinding.ActivityMainBinding;
import examples.aaronhoskins.com.mvvmdemo.model.randomuser.RandomUserResponse;
import examples.aaronhoskins.com.mvvmdemo.view.adapters.RandomUserRecyclerViewAdapter;
import examples.aaronhoskins.com.mvvmdemo.viewmodel.UserViewModel;

public class MainActivity extends AppCompatActivity {
    UserViewModel userViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding mainActiviyBinding
                = DataBindingUtil.setContentView(this, R.layout.activity_main);
        userViewModel = new UserViewModel();
        mainActiviyBinding.setViewmodel(userViewModel);
        // persist through lifecycle this way
        mainActiviyBinding.setLifecycleOwner(this);

        userViewModel.randomUserResponseLiveData.observe(this, new Observer<RandomUserResponse>() {
            @Override
            public void onChanged(RandomUserResponse randomUserResponse) {
                userViewModel.setAdapter(randomUserResponse);
            }
        });
    }

    // tie views in xml to java code
    // Livedata is observable lifecycle aware data container
    // layout tag, data tag, variable tag and which items you need to tie to code, lambda functions
    // MVP relation between view and presenter (contract/interface)
    // models package in any architecture, wha tis found
    // what is dependency injection, common libraries
    // dagger 2 what does it generate
    // main dagger 2 annotations
    // what is a module
    //
    @BindingAdapter("bind:adapter")
    public static void initRecyclerView(RecyclerView view, RandomUserRecyclerViewAdapter adapter) {
        view.setLayoutManager(new LinearLayoutManager(view.getContext()));
        view.setAdapter(adapter);
    }
}
