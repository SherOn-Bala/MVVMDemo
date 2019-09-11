
package examples.aaronhoskins.com.mvvmdemo.model.randomuser;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Picture implements Parcelable {

    @SerializedName("large")
    private String mLarge;
    @SerializedName("medium")
    private String mMedium;
    @SerializedName("thumbnail")
    private String mThumbnail;

    protected Picture(Parcel in) {
        mLarge = in.readString();
        mMedium = in.readString();
        mThumbnail = in.readString();
    }

    public static final Creator<Picture> CREATOR = new Creator<Picture>() {
        @Override
        public Picture createFromParcel(Parcel in) {
            return new Picture(in);
        }

        @Override
        public Picture[] newArray(int size) {
            return new Picture[size];
        }
    };

    public String getLarge() {
        return mLarge;
    }

    public void setLarge(String large) {
        mLarge = large;
    }

    public String getMedium() {
        return mMedium;
    }

    public void setMedium(String medium) {
        mMedium = medium;
    }

    public String getThumbnail() {
        return mThumbnail;
    }

    public void setThumbnail(String thumbnail) {
        mThumbnail = thumbnail;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mLarge);
        parcel.writeString(mMedium);
        parcel.writeString(mThumbnail);
    }
}
