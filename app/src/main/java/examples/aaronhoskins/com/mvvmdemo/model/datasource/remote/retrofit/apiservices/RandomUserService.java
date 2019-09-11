package examples.aaronhoskins.com.mvvmdemo.model.datasource.remote.retrofit.apiservices;



import examples.aaronhoskins.com.mvvmdemo.model.randomuser.RandomUserResponse;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

import static examples.aaronhoskins.com.mvvmdemo.model.datasource.remote.retrofit.UrlConstants.PATH_API;
import static examples.aaronhoskins.com.mvvmdemo.model.datasource.remote.retrofit.UrlConstants.QUERY_GENDER;
import static examples.aaronhoskins.com.mvvmdemo.model.datasource.remote.retrofit.UrlConstants.QUERY_RESULT_COUNT;

public interface RandomUserService {
    @GET(PATH_API)
    Observable<RandomUserResponse> getRandomUserResponse(
            @Query(QUERY_RESULT_COUNT) String numOfDesiredResults,
            @Query(QUERY_GENDER) String requestedGender);
}
