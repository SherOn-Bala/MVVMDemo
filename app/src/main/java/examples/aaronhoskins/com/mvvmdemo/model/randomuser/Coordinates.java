
package examples.aaronhoskins.com.mvvmdemo.model.randomuser;


import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Coordinates implements Parcelable {

    @SerializedName("latitude")
    private String mLatitude;
    @SerializedName("longitude")
    private String mLongitude;

    protected Coordinates(Parcel in) {
        mLatitude = in.readString();
        mLongitude = in.readString();
    }

    public static final Creator<Coordinates> CREATOR = new Creator<Coordinates>() {
        @Override
        public Coordinates createFromParcel(Parcel in) {
            return new Coordinates(in);
        }

        @Override
        public Coordinates[] newArray(int size) {
            return new Coordinates[size];
        }
    };

    public String getLatitude() {
        return mLatitude;
    }

    public void setLatitude(String latitude) {
        mLatitude = latitude;
    }

    public String getLongitude() {
        return mLongitude;
    }

    public void setLongitude(String longitude) {
        mLongitude = longitude;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mLatitude);
        parcel.writeString(mLongitude);
    }
}
