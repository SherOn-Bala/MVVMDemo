package examples.aaronhoskins.com.mvvmdemo.model.datasource.remote.retrofit;

import examples.aaronhoskins.com.mvvmdemo.model.datasource.remote.retrofit.apiservices.RandomUserService;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import static examples.aaronhoskins.com.mvvmdemo.model.datasource.remote.retrofit.UrlConstants.BASE_URL;

public class RetrofitHelper {

    private Retrofit getRetrofitInstance() {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public RandomUserService getService() {
        return getRetrofitInstance().create(RandomUserService.class);
    }
}
