
package examples.aaronhoskins.com.mvvmdemo.model.randomuser;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;


@SuppressWarnings("unused")
public class RandomUserResponse implements Parcelable {

    @SerializedName("info")
    private Info mInfo;
    @SerializedName("results")
    private List<Result> mResults;

    protected RandomUserResponse(Parcel in) {
        mResults = in.createTypedArrayList(Result.CREATOR);
    }

    public static final Creator<RandomUserResponse> CREATOR = new Creator<RandomUserResponse>() {
        @Override
        public RandomUserResponse createFromParcel(Parcel in) {
            return new RandomUserResponse(in);
        }

        @Override
        public RandomUserResponse[] newArray(int size) {
            return new RandomUserResponse[size];
        }
    };

    public Info getInfo() {
        return mInfo;
    }

    public void setInfo(Info info) {
        mInfo = info;
    }

    public List<Result> getResults() {
        return mResults;
    }

    public void setResults(List<Result> results) {
        mResults = results;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(mResults);
    }
}
