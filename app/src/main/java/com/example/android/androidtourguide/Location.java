package com.example.android.androidtourguide;

/**
 * Created by NickKrause on 5/7/2017.
 *   Store information specific to each attraction
 */

public class Location {
    private int mDesc;  //  Description
    private int mName;  //  Attraction  Name Text
    private int mImage; //  Graphic image

    public Location(int aName, int aDesc, int aImage)
    {
        mDesc = aDesc;
        mName = aName;
        mImage = aImage;
    }
    public int getDesc()
    {
        return mDesc;
    }
    public int getName()
    {
        return mName;
    }
    public int getImage()
    {
        return mImage;
    }

    public String toString() {
        String Message;
        Message = "Description:" + this.mDesc
                + "\nName:" + this.mName
                + "\nImage:" + this.mImage;
        return Message;
    }

}
