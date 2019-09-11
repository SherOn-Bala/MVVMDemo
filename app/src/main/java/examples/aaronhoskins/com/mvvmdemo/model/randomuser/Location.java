
package examples.aaronhoskins.com.mvvmdemo.model.randomuser;


import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Location implements Parcelable {

    @SerializedName("city")
    private String mCity;
    @SerializedName("coordinates")
    private Coordinates mCoordinates;
    @SerializedName("postcode")
    private String mPostcode;
    @SerializedName("state")
    private String mState;
    @SerializedName("street")
    private String mStreet;
    @SerializedName("timezone")
    private Timezone mTimezone;

    protected Location(Parcel in) {
        mCity = in.readString();
        mCoordinates = in.readParcelable(Coordinates.class.getClassLoader());
        if (in.readByte() == 0) {
            mPostcode = null;
        } else {
            mPostcode = in.readString();
        }
        mState = in.readString();
        mStreet = in.readString();
        mTimezone = in.readParcelable(Timezone.class.getClassLoader());
    }

    public static final Creator<Location> CREATOR = new Creator<Location>() {
        @Override
        public Location createFromParcel(Parcel in) {
            return new Location(in);
        }

        @Override
        public Location[] newArray(int size) {
            return new Location[size];
        }
    };

    public String getCity() {
        return mCity;
    }

    public void setCity(String city) {
        mCity = city;
    }

    public Coordinates getCoordinates() {
        return mCoordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        mCoordinates = coordinates;
    }

    public String getPostcode() {
        return mPostcode;
    }

    public void setPostcode(String postcode) {
        mPostcode = postcode;
    }

    public String getState() {
        return mState;
    }

    public void setState(String state) {
        mState = state;
    }

    public String getStreet() {
        return mStreet;
    }

    public void setStreet(String street) {
        mStreet = street;
    }

    public Timezone getTimezone() {
        return mTimezone;
    }

    public void setTimezone(Timezone timezone) {
        mTimezone = timezone;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mCity);
        parcel.writeParcelable(mCoordinates, i);
        if (mPostcode == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeString(mPostcode);
        }
        parcel.writeString(mState);
        parcel.writeString(mStreet);
        parcel.writeParcelable(mTimezone, i);
    }
}
