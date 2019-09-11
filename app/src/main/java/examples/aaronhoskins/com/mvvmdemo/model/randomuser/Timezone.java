
package examples.aaronhoskins.com.mvvmdemo.model.randomuser;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Timezone implements Parcelable {

    @SerializedName("description")
    private String mDescription;
    @SerializedName("offset")
    private String mOffset;

    protected Timezone(Parcel in) {
        mDescription = in.readString();
        mOffset = in.readString();
    }

    public static final Creator<Timezone> CREATOR = new Creator<Timezone>() {
        @Override
        public Timezone createFromParcel(Parcel in) {
            return new Timezone(in);
        }

        @Override
        public Timezone[] newArray(int size) {
            return new Timezone[size];
        }
    };

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getOffset() {
        return mOffset;
    }

    public void setOffset(String offset) {
        mOffset = offset;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mDescription);
        parcel.writeString(mOffset);
    }
}
