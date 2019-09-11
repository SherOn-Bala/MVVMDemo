
package examples.aaronhoskins.com.mvvmdemo.model.randomuser;


import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Name implements Parcelable {

    @SerializedName("first")
    private String mFirst;
    @SerializedName("last")
    private String mLast;
    @SerializedName("title")
    private String mTitle;

    protected Name(Parcel in) {
        mFirst = in.readString();
        mLast = in.readString();
        mTitle = in.readString();
    }

    public static final Creator<Name> CREATOR = new Creator<Name>() {
        @Override
        public Name createFromParcel(Parcel in) {
            return new Name(in);
        }

        @Override
        public Name[] newArray(int size) {
            return new Name[size];
        }
    };

    public String getFirst() {
        return mFirst;
    }

    public void setFirst(String first) {
        mFirst = first;
    }

    public String getLast() {
        return mLast;
    }

    public void setLast(String last) {
        mLast = last;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @NonNull
    @Override
    public String toString() {
        return String.format("%s %s", mFirst, mLast);
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mFirst);
        parcel.writeString(mLast);
        parcel.writeString(mTitle);
    }
}
